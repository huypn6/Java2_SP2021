package com.vn.slide2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoLogin {

	private JFrame frmLoginForm;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoLogin window = new DemoLogin();
					window.frmLoginForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginForm = new JFrame();
		frmLoginForm.setTitle("Login Form");
		frmLoginForm.setBounds(100, 100, 450, 300);
		frmLoginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(66, 57, 75, 14);
		frmLoginForm.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(66, 105, 46, 14);
		frmLoginForm.getContentPane().add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(137, 54, 86, 20);
		frmLoginForm.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(137, 102, 86, 20);
		frmLoginForm.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				callLogin();
			}
		});
		btnLogin.setBounds(166, 170, 89, 23);
		frmLoginForm.getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(282, 170, 89, 23);
		frmLoginForm.getContentPane().add(btnCancel);
	}
	
	public void callLogin() {
		String username = txtUsername.getText();
		String password = txtPassword.getText();
		if(password.equals("poly") && username.equals("poly")) {
			System.out.println("thanh cong");
		} else {
			System.out.println("username or password incorrect");
		}
		
	}
}
