package com.vn.slide6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GetTimeSystemDemo {

	private JFrame frame;
	JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetTimeSystemDemo window = new GetTimeSystemDemo();
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
	public GetTimeSystemDemo() {
		initialize();
		//get system time: 08:80
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					long time = System.currentTimeMillis();
					label.setText( ""+ time/1000);
				}
				
			}
		});
		thread.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnHello = new JButton("Hello");
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Hello, Poly");
			}
		});
		btnHello.setBounds(167, 96, 89, 23);
		frame.getContentPane().add(btnHello);
		
		label = new JLabel("08:08");
		label.setBounds(228, 23, 141, 14);
		frame.getContentPane().add(label);
	}
}
