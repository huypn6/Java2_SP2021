package com.vn.slide3;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudentUI {

	private JFrame frame;
	private List<Student> students;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentUI window = new StudentUI();
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
	public StudentUI() {
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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		JButton btnFiil = new JButton("Fill");
		btnFiil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillStudent();
			}
		});
		GridBagConstraints gbc_btnFiil = new GridBagConstraints();
		gbc_btnFiil.insets = new Insets(0, 0, 0, 5);
		gbc_btnFiil.gridx = 4;
		gbc_btnFiil.gridy = 2;
		frame.getContentPane().add(btnFiil, gbc_btnFiil);
		
		JButton btnOK = new JButton("Ok");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMessage();
			}
		});
		GridBagConstraints gbc_btnOK = new GridBagConstraints();
		gbc_btnOK.insets = new Insets(0, 0, 0, 5);
		gbc_btnOK.gridx = 5;
		gbc_btnOK.gridy = 2;
		frame.getContentPane().add(btnOK, gbc_btnOK);
	}

	protected void showMessage() {
		int index = comboBox.getSelectedIndex();
		System.out.println(students.get(index).getName());
		JOptionPane.showMessageDialog(this.frame, students.get(index).getName());
		
	}

	protected void fillStudent() {
		students = new ArrayList<Student>();
		students.add(new Student("Tuan", 9));
		students.add(new Student("Nhung", 13));
		students.add(new Student("Hung", 6));
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if( o1.getMarks() <= o2.getMarks()) 
					return 1;
				else return -1;
			}
			
		});
		
		for (Student student : students) {
			comboBox.addItem(student.getName());
		}
		
		
	}

}
