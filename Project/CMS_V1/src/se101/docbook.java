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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JRadioButton;

public class docbook extends JFrame  {

	private JPanel contentPane;
	private JTextField date;
	private JButton btnNewButton;
	private JTextField pname;
	private JTextField pemail;
	
	//Sign In
	//insert into docbook values('Krishna Raj','30-04-2022','Arjun K','arjun123@gmail.com');
	//select count(email) from docbook where dates ='30-04-2022' and docname = 'Krishna Raj';
		String pbook(String docname,String date,String Name,String email) {
			final  String url = "jdbc:postgresql://localhost:5432/mydb";
			final String user = "postgres"; 
			final  String password = "starlord";
			
			try{
				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection(url,user,password);
				
				if(con !=null) {
					System.out.println("** Doc Book Connected to SQL**");
				}else {
					System.out.println("Failed");
				}
				
				
				 PreparedStatement St1 = con.prepareStatement("select count(email) from docbook where dates ='"+date+"' and docname = '"+docname+"'");
				 
				 ResultSet rs = St1.executeQuery();
				 
				 while(rs.next()){  

					 if ( rs.getInt(1) <= 50 ){
						 PreparedStatement St2 = con.prepareStatement("insert into docbook values('"+docname+"','"+date+"','"+Name+"','"+email+"')");
						 St2.executeQuery();
						 System.out.print("\n Inserted booking \n");
						 return("True");
						 
					 }

						 
					 }

				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return("True");
		}
		

		docbook() {
		setBackground(new Color(102, 51, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 572);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doctor Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(46, 160, 144, 69);
		contentPane.add(lblNewLabel);
		
		JRadioButton doc1 = new JRadioButton("Krishna Raj");
		doc1.setFont(new Font("Arial", Font.PLAIN, 17));
		doc1.setBounds(200, 186, 149, 23);
		contentPane.add(doc1);
		
		JRadioButton doc2 = new JRadioButton("Bobby K");
		doc2.setFont(new Font("Arial", Font.PLAIN, 17));
		doc2.setBounds(364, 186, 159, 23);
		contentPane.add(doc2);
		
		JRadioButton doc3 = new JRadioButton("Riya");
		doc3.setFont(new Font("Arial", Font.PLAIN, 17));
		doc3.setBounds(544, 186, 144, 23);
		contentPane.add(doc3);

		 
		
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(46, 214, 113, 57);
		contentPane.add(lblNewLabel_1);
		
		date = new JTextField();
		date.setText("DD-MM-YYYY");
		date.setBounds(200, 230, 281, 30);
		contentPane.add(date);
		date.setColumns(10);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(46, 420, 113, 38);
		
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(46, 30, 113, 30);
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
		
		JLabel lblNewLabel_2 = new JLabel("Schedule Appointment");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel_2.setBounds(46, 89, 318, 30);
		contentPane.add(lblNewLabel_2);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(46, 125, 549, 4);
		contentPane.add(canvas);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(46, 282, 125, 30);
		contentPane.add(lblNewLabel_3);
		
		pname = new JTextField();
		pname.setBounds(200, 285, 281, 30);
		contentPane.add(pname);
		pname.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email ID");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(46, 349, 144, 30);
		contentPane.add(lblNewLabel_4);
		
		pemail = new JTextField();
		pemail.setBounds(200, 352, 281, 30);
		contentPane.add(pemail);
		pemail.setColumns(10);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.isEnabled()) {
					 	String dn = " ";
					 	
					 	if(doc1.isSelected()==true) {
					 		dn="Krishna Raj";
					 	}
					 	
					 	if(doc2.isSelected()==true) {
					 		dn="Bobby";
					 	}
					 	
					 	if(doc3.isSelected()==true) {
					 		dn="Riya";
					 	}
					 	
					 	String dt = date.getText();
					 	String pn = pname.getText();
					 	String pe = pemail.getText();
					 	
					 	
					 	String x = pbook(dn,dt,pn,pe);
					 	if(x=="True") {
					 		 System.out.println("Booked!");
					 	}
					 	else
					 	{
					 		System.out.println("Not Booked Try another date");
					 	}
			           
			        }

			}
		});
		contentPane.add(btnNewButton);
		
		
		
		
		
	}
}
