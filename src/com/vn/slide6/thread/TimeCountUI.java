package com.vn.slide6.thread;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimeCountUI implements Runnable {

	private JFrame frame;
	JLabel lablTime;
	long timeStart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeCountUI window = new TimeCountUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TimeCountUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblText = new JLabel("Time");
		GridBagConstraints gbc_lblText = new GridBagConstraints();
		gbc_lblText.insets = new Insets(0, 0, 5, 5);
		gbc_lblText.gridx = 6;
		gbc_lblText.gridy = 3;
		frame.getContentPane().add(lblText, gbc_lblText);
		
		lablTime = new JLabel("00:00:00");
		GridBagConstraints gbc_lablTime = new GridBagConstraints();
		gbc_lablTime.insets = new Insets(0, 0, 5, 0);
		gbc_lablTime.gridx = 8;
		gbc_lablTime.gridy = 3;
		frame.getContentPane().add(lablTime, gbc_lablTime);
		
		JButton btnTinh = new JButton("Tinh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countTime();
			}
		});
		GridBagConstraints gbc_btnTinh = new GridBagConstraints();
		gbc_btnTinh.insets = new Insets(0, 0, 0, 5);
		gbc_btnTinh.gridx = 4;
		gbc_btnTinh.gridy = 5;
		frame.getContentPane().add(btnTinh, gbc_btnTinh);
		
		JButton btnTinhDiem = new JButton("Tinh diem");
		GridBagConstraints gbc_btnTinhDiem = new GridBagConstraints();
		gbc_btnTinhDiem.insets = new Insets(0, 0, 0, 5);
		gbc_btnTinhDiem.gridx = 6;
		gbc_btnTinhDiem.gridy = 5;
		frame.getContentPane().add(btnTinhDiem, gbc_btnTinhDiem);
	}

	protected void countTime() {
		timeStart = System.currentTimeMillis();
		Thread timeCount = new Thread(this);
		timeCount.start();
		System.gc();
	}
	
	@Override
	public void run() {
		while(true) {
			long timeCurrent = System.currentTimeMillis();
			long time = (timeCurrent - timeStart) / 1000;
			lablTime.setText(String.valueOf(time));
		}
	}

}
