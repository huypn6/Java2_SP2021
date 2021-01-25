package com.vn.slide4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import java.awt.event.ActionEvent;

public class NhapSo {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhapSo window = new NhapSo();
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
	public NhapSo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(190, 99, 157, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp ng\u00E0y");
		lblNewLabel.setBounds(99, 102, 102, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnKimTra = new JButton("Ki\u1EC3m tra");
		btnKimTra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kiemtraNgayThang();
			}
		});
		btnKimTra.setBounds(234, 145, 89, 23);
		frame.getContentPane().add(btnKimTra);
		
		JLabel lblBnPhiNhp = new JLabel("B\u1EA1n ph\u1EA3i nh\u1EADp ki\u1EC3u ng\u00E0y dd/mm/yyyy");
		lblBnPhiNhp.setBounds(99, 77, 248, 14);
		frame.getContentPane().add(lblBnPhiNhp);
	}

	protected void kiemtraNgayThang() {
		//1. get dư liệu ng dung nhập
		String dateString = textField.getText();
		
		//2. sử dụng try catch phân tích định dạng
		try {
			//3. convert ngày theo định dạng
			String format = "dd/mm/yyyy";
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			Date date = dateFormat.parse(dateString);
			JOptionPane.showMessageDialog(this.frame, "Nhập đúng rồi em ơi" + date);
			
		} catch (Exception e) {
			//4. show thông báo lỗi nếu có
			JOptionPane.showMessageDialog(this.frame, "Nhập không phải là ngày, hoặc không đúng định dạng");
		}
		
		
		
		
		
		
		
	}
}
