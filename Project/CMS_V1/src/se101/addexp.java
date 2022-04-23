package se101;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;

public class addexp extends JFrame {
	private JTable j;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private Canvas canvas_1;
	private JLabel lblNewLabel_4;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addexp frame = new addexp();
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
	public addexp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 594);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Expenses");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(49, 56, 156, 35);
		contentPane.add(lblNewLabel);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(49, 97, 467, 4);
		contentPane.add(canvas);
		
		String[][] data = {
	            { "Aswin R", "30-04-2022", "100" },{ "Karthik K", "30-04-2022", "100" },{ "Hari G", "30-04-2022", "100" },
	            { "Amal S", "30-04-2022", "100" },
	        };
	 
	        // Column Names
	        String[] columnNames = { "PName", "date", "amount" };
	 
	        // Initializing the JTable
	        j = new JTable(data, columnNames);
	        j.setFont(new Font("Arial", Font.PLAIN, 17));
	        j.setBounds(48, 342, 606, 121);
	 
	        contentPane.add(j);
	        
	        lblNewLabel_1 = new JLabel("Patient Name");
	        lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_1.setForeground(new Color(255, 255, 255));
	        lblNewLabel_1.setBounds(49, 125, 127, 23);
	        contentPane.add(lblNewLabel_1);
	        
	        textField = new JTextField();
	        textField.setBounds(180, 125, 315, 23);
	        contentPane.add(textField);
	        textField.setColumns(10);
	        
	        lblNewLabel_2 = new JLabel("Date");
	        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_2.setForeground(new Color(255, 255, 255));
	        lblNewLabel_2.setBounds(49, 159, 127, 23);
	        contentPane.add(lblNewLabel_2);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(180, 162, 179, 20);
	        contentPane.add(textField_1);
	        textField_1.setColumns(10);
	        
	        lblNewLabel_3 = new JLabel("Expense Summary");
	        lblNewLabel_3.setForeground(new Color(255, 255, 255));
	        lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_3.setBounds(49, 291, 189, 23);
	        contentPane.add(lblNewLabel_3);
	        
	        canvas_1 = new Canvas();
	        canvas_1.setBackground(new Color(255, 255, 255));
	        canvas_1.setBounds(49, 320, 467, 4);
	        contentPane.add(canvas_1);
	        
	        lblNewLabel_4 = new JLabel("Amount");
	        lblNewLabel_4.setForeground(new Color(255, 255, 255));
	        lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 17));
	        lblNewLabel_4.setBounds(49, 200, 127, 23);
	        contentPane.add(lblNewLabel_4);
	        
	        textField_2 = new JTextField();
	        textField_2.setBounds(180, 203, 179, 20);
	        contentPane.add(textField_2);
	        textField_2.setColumns(10);
	        
	        Button button = new Button("Submit");
	        button.setFont(new Font("Arial", Font.PLAIN, 17));
	        button.setBackground(new Color(255, 255, 255));
	        button.setBounds(49, 243, 127, 29);
	        contentPane.add(button);
	        
	        JButton btnNewButton = new JButton("Back");
	        btnNewButton.setBackground(new Color(255, 255, 255));
	        btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
	        btnNewButton.setBounds(49, 490, 118, 36);
	        btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (btnNewButton.isEnabled()) {
						 	dochome ah = new dochome();
						 	ah.setVisible(true);
						 	dispose();

				            System.out.println("*Home pressed*");
				        }

				}
			});
	        contentPane.add(btnNewButton);
	}
}
