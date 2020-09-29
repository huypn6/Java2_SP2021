package com.vn.slide4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NhapDiemDemo {

	private JFrame frame;
	private JTextField txtScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhapDiemDemo window = new NhapDiemDemo();
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
	public NhapDiemDemo() {
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
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblScore = new JLabel("Score");
		GridBagConstraints gbc_lblScore = new GridBagConstraints();
		gbc_lblScore.insets = new Insets(0, 0, 5, 5);
		gbc_lblScore.gridx = 2;
		gbc_lblScore.gridy = 2;
		frame.getContentPane().add(lblScore, gbc_lblScore);
		
		txtScore = new JTextField();
		GridBagConstraints gbc_txtScore = new GridBagConstraints();
		gbc_txtScore.insets = new Insets(0, 0, 5, 5);
		gbc_txtScore.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtScore.gridx = 4;
		gbc_txtScore.gridy = 2;
		frame.getContentPane().add(txtScore, gbc_txtScore);
		txtScore.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhapDiem();
			}
		});
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.insets = new Insets(0, 0, 5, 5);
		gbc_btnOk.gridx = 6;
		gbc_btnOk.gridy = 2;
		frame.getContentPane().add(btnOk, gbc_btnOk);
	}

	protected void nhapDiem() {
		String inputScore = txtScore.getText();
		try {
			Float float1 = Float.parseFloat(inputScore);
			if (0<= float1 && float1 <=10) {
				System.out.println("Input is ok");
			} else {
				JOptionPane.showMessageDialog(this.frame, "Input invalid");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this.frame, "Input is not number");
			
		}
		System.out.println(inputScore);
	}

}
