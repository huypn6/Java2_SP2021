package com.vn.slide4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab4 {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab4 window = new Lab4();
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
	public Lab4() {
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
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblQunLSinh = new JLabel("QU\u1EA2N L\u00DD SINH VI\u00CAN");
		GridBagConstraints gbc_lblQunLSinh = new GridBagConstraints();
		gbc_lblQunLSinh.insets = new Insets(0, 0, 5, 5);
		gbc_lblQunLSinh.gridx = 3;
		gbc_lblQunLSinh.gridy = 1;
		frame.getContentPane().add(lblQunLSinh, gbc_lblQunLSinh);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		txtName = new JTextField();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 3;
		gbc_txtName.gridy = 3;
		frame.getContentPane().add(txtName, gbc_txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtDate = new JTextField();
		GridBagConstraints gbc_txtDate = new GridBagConstraints();
		gbc_txtDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDate.gridx = 3;
		gbc_txtDate.gridy = 5;
		frame.getContentPane().add(txtDate, gbc_txtDate);
		txtDate.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 7;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtSalary = new JTextField();
		GridBagConstraints gbc_txtSalary = new GridBagConstraints();
		gbc_txtSalary.insets = new Insets(0, 0, 5, 5);
		gbc_txtSalary.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSalary.gridx = 3;
		gbc_txtSalary.gridy = 7;
		frame.getContentPane().add(txtSalary, gbc_txtSalary);
		txtSalary.setColumns(10);
		
		JButton txtSave = new JButton("Save");
		txtSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		GridBagConstraints gbc_txtSave = new GridBagConstraints();
		gbc_txtSave.insets = new Insets(0, 0, 0, 5);
		gbc_txtSave.gridx = 3;
		gbc_txtSave.gridy = 8;
		frame.getContentPane().add(txtSave, gbc_txtSave);
	}

	protected void save() {
		//1. get input from ui
		String date = txtDate.getText();
		String name = txtName.getText();
		String salary = txtSalary.getText();
		
		//2. try -cath 
		try {
			// check name
			
			// check salary
			
			//check date format dd-MM-yyyy
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
