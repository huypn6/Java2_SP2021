package com.vn.slide3;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableDemo {

	private JFrame frame;
	private JTable table;
	private List<Student> students = new ArrayList<Student>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableDemo window = new TableDemo();
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
	public TableDemo() {
		initialize();
		students.add(new Student("Tuấn", 9.0));
		students.add(new Student("Phương", 6.0));
		students.add(new Student("Hằng", 7.0));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		table = new JTable();
		table.setBounds(41, 31, 327, 177);
		frame.getContentPane().add(table);

		JButton btnFill = new JButton("Fill");
		btnFill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillData();
			}

			private void fillData() {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				for (Student student : students) {
					model.addRow(new Object[] {student.getName(), student.getMarks() });
				}
				table.setModel(model);
			}
		});
		btnFill.setBounds(245, 227, 89, 23);
		frame.getContentPane().add(btnFill);

		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(344, 227, 89, 23);
		frame.getContentPane().add(btnOk);
	}
}
