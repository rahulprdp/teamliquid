package se101;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import javax.swing.JButton;

public class bschedule extends JFrame {

	private JPanel contentPane;
	private JTable j;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bschedule frame = new bschedule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bschedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 574);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Schedule");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		lblNewLabel.setBounds(58, 93, 247, 37);
		contentPane.add(lblNewLabel);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(58, 136, 501, 4);
		contentPane.add(canvas);
		
		
		String[][] data = {
	            { "Krishna Raj", "30-04-2022", "Aswin R","aswinr@gmail.com" },{ "Krishna Raj", "30-04-2022", "Karthik K","karthikk@gmail.com" },
	            { "Bobby", "30-04-2022", "Manu K","manuk@gmail.com" },{ "Riya", "30-04-2022", "Amal","amalk@gmail.com" },
	        };
	 
	        // Column Names
	        String[] columnNames = { "Name", "date", "pname","email" };
	 
	        // Initializing the JTable
	        j = new JTable(data, columnNames);
	        j.setFont(new Font("Arial", Font.PLAIN, 17));
	        j.setBounds(58, 198, 604, 215);
	 
	        contentPane.add(j);
	        
	        lblNewLabel_1 = new JLabel("Doc Name");
	        lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_1.setForeground(new Color(255, 255, 255));
	        lblNewLabel_1.setBounds(58, 173, 121, 14);
	        contentPane.add(lblNewLabel_1);
	        
	        lblNewLabel_2 = new JLabel("Date");
	        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_2.setForeground(new Color(255, 255, 255));
	        lblNewLabel_2.setBounds(211, 173, 46, 14);
	        contentPane.add(lblNewLabel_2);
	        
	        lblNewLabel_3 = new JLabel("Patient Name");
	        lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_3.setForeground(new Color(255, 255, 255));
	        lblNewLabel_3.setBounds(360, 173, 121, 14);
	        contentPane.add(lblNewLabel_3);
	        
	        lblNewLabel_4 = new JLabel("Patient Email");
	        lblNewLabel_4.setForeground(new Color(255, 255, 255));
	        lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_4.setBounds(512, 173, 110, 14);
	        contentPane.add(lblNewLabel_4);
	        
	        btnNewButton = new JButton("Back");
	        btnNewButton.setBackground(new Color(255, 255, 255));
	        btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
	        btnNewButton.setBounds(58, 440, 110, 31);
	        btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (btnNewButton.isEnabled()) {
							dochome n = new dochome();
							n.setVisible(true);
						 	dispose();
						 	
				        }

				}
			});
	        contentPane.add(btnNewButton);
		
	}
}
