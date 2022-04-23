package se101;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.UIManager;

public class testbook extends JFrame {

	private JPanel contentPane;
	private JTextField pname;
	private JTextField page;
	private JTextField pdate;

	
	void testbook(String name,String age,String date,String test) {
		final  String url = "jdbc:postgresql://localhost:5432/mydb";
		final String user = "postgres";
		final  String password = "starlord";
		
		try{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			
			if(con !=null) {
				System.out.println("** Test Book Connected to SQL**");
			}else {
				System.out.println("Failed");
			}
			

			 PreparedStatement St1 = con.prepareStatement("insert into testbook values('"+name+"','"+age+"','"+date+"','"+test+"')");
			 
			 ResultSet rs = St1.executeQuery();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	testbook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 566);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Test Booking");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(56, 57, 231, 42);
		contentPane.add(lblNewLabel);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(56, 115, 509, 4);
		contentPane.add(canvas);
		
		JCheckBox blood = new JCheckBox("Blood Test");
		blood.setFont(new Font("Arial", Font.PLAIN, 15));
		blood.setBounds(223, 322, 158, 23);
		contentPane.add(blood);
		
		JCheckBox cov = new JCheckBox("Covid Test");
		cov.setFont(new Font("Arial", Font.PLAIN, 15));
		cov.setBounds(53, 322, 158, 23);
		contentPane.add(cov);
		
		JCheckBox bchk = new JCheckBox("Basic Check-Up");
		bchk.setFont(new Font("Arial", Font.PLAIN, 15));
		bchk.setBounds(396, 322, 158, 23);
		contentPane.add(bchk);
		
		pname = new JTextField();
		pname.setBounds(191, 152, 374, 30);
		contentPane.add(pname);
		pname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(56, 155, 125, 22);
		contentPane.add(lblNewLabel_1);
		
		page = new JTextField();
		page.setBounds(191, 201, 86, 30);
		contentPane.add(page);
		page.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(59, 209, 86, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(317, 209, 74, 22);
		contentPane.add(lblNewLabel_3);
		
		pdate = new JTextField();
		pdate.setForeground(new Color(0, 0, 0));
		pdate.setText("DD/MM/YYYY");
		pdate.setBounds(373, 201, 192, 30);
		contentPane.add(pdate);
		pdate.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Available Tests");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(56, 279, 155, 23);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(452, 383, 113, 30);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_2.isEnabled()) {
					 	booking ah = new booking();
					 	ah.setVisible(true);
					 	dispose();

			            System.out.println("Back");
			        }

			}
		});
		contentPane.add(btnNewButton_2);
		
		
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(56, 380, 125, 36);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.isEnabled()) {
						String n = pname.getText();
						String a = page.getText();
						String d = pdate.getText();
						
					 	String t ="Fake";
					 	if(cov.isSelected()==true) {
					 		t="Covid Test";
					 	}
					 	
					 	if(blood.isSelected()==true) {
					 		t="Blood Test";
					 	}
					 	
					 	if(bchk.isSelected()==true) {
					 		t="Basic Check Up";
					 	}
					 	
					 	testbook(n,a,d,t);
					 	

			            System.out.println("Booked");
			        }

			}
		});
		
		contentPane.add(btnNewButton);
	}
}
