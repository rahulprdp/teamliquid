package se101;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JButton;

public class booking extends JFrame {

	private JPanel contentPane;
	
	booking() {
		setBackground(new Color(102, 51, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Booking");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(88, 211, 189, 69);
		contentPane.add(lblNewLabel);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(322, 85, 4, 333);
		contentPane.add(canvas);
		
		JButton btnNewButton = new JButton("Schedule Appointment");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton.setBounds(407, 177, 224, 45);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.isEnabled()) {
					 	docbook ah = new docbook();
					 	ah.setVisible(true);
					 	dispose();

			            System.out.println("Doc Book");
			        }

			}
		});
		
		JButton btnNewButton_1 = new JButton("Schedule Test");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 17));
		btnNewButton_1.setBounds(407, 259, 224, 41);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_1.isEnabled()) {
					 	testbook ah = new testbook();
					 	ah.setVisible(true);
					 	dispose();

			            System.out.println("Test Book");
			        }

			}
		});
		contentPane.add(btnNewButton_1);
		
		
		
		
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_2.setBounds(407, 371, 116, 41);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_2.isEnabled()) {
					 	
					 	dispose();
			            System.out.println("Log Out");
			        }

			}
		});
	}
}
