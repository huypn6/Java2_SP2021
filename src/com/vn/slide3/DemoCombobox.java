package com.vn.slide3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DemoCombobox {

	private JFrame frmDemoCombobox;
	private List<Student> students = new ArrayList<Student>();
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoCombobox window = new DemoCombobox();
					window.frmDemoCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoCombobox() {
		initialize();
		
		students.add(new Student("Tuấn", 9.0));
		students.add(new Student("Phương", 6.0));
		students.add(new Student("Hằng", 7.0));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDemoCombobox = new JFrame();
		frmDemoCombobox.setTitle("Demo combobox");
		frmDemoCombobox.setBounds(100, 100, 450, 300);
		frmDemoCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDemoCombobox.getContentPane().setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(57, 68, 115, 22);
		frmDemoCombobox.getContentPane().add(comboBox);
		
		JButton btnFill = new JButton("Fill");
		btnFill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillData();
			}
		});
		btnFill.setBounds(200, 68, 89, 23);
		frmDemoCombobox.getContentPane().add(btnFill);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show();
			}
		});
		btnOk.setBounds(315, 68, 89, 23);
		frmDemoCombobox.getContentPane().add(btnOk);
	}

	protected void show() {
		String name = (String)comboBox.getSelectedItem();
		JOptionPane.showMessageDialog(this.frmDemoCombobox, name);
	}

	protected void fillData() {
		for (Student student : students) {
			comboBox.addItem(student.getName());
		}
	}
}
