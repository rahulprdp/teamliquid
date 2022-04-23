package se101;

import java.awt.BorderLayout;
import java.sql.*; 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Canvas;
import javax.swing.SwingConstants;

public class loginp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	
	//Register function
	void registerp(String usid,String pass) {
		final  String url = "jdbc:postgresql://localhost:5432/mydb";
		final String user = "postgres";
		final  String password = "starlord";
		
		try{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			
			if(con !=null) {
				System.out.println("** Log in Connected to SQL**");
			}else {
				System.out.println("Failed");
			}
			

			 PreparedStatement St1 = con.prepareStatement("insert into plog values('"+usid+"','"+pass+"')");
			 
			 ResultSet rs = St1.executeQuery();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Sign In
	
	String checklog(String usid,String pass) {
		final  String url = "jdbc:postgresql://localhost:5432/mydb";
		final String user = "postgres";
		final  String password = "starlord";
		
		try{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			
			if(con !=null) {
				System.out.println("Connected to SQL");
			}else {
				System.out.println("Failed");
			}
			
			 PreparedStatement St1 = con.prepareStatement("Select * from plog where email = '"+usid+"' and password = '"+pass+"';");
			 
			 ResultSet rs = St1.executeQuery();

			 while(rs.next()){  

				 if ( rs.getString(1)!=null ){
					 return ("True");
				 }
				 }  
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ("False");
	}
	
	//Frame
		loginp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 554);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Info");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(422, 142, 167, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(422, 207, 102, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(546, 204, 218, 20);
		
		
		
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(422, 245, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(546, 242, 218, 20);
		
		
		
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdd = new JButton("Sign In");
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 18));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 if (btnAdd.isEnabled()) {
					 	
					 	String id = textField.getText();
						System.out.print("ID :"+ id);
						
						String pas = textField_1.getText();
						
					 	if(checklog(id,pas)=="True") {
					 		dispose();
				            booking b = new booking();
				            b.setVisible(true);
					 	}
			            
			            
			            
			        }
			        if (!btnAdd.isEnabled()) {
			            System.out.println("Add Button is not pressed");
			        }
				
				
			}
		});
		btnAdd.setBounds(422, 310, 148, 35);
		contentPane.add(btnAdd);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(332, 98, 3, 326);
		contentPane.add(canvas);
		
		JLabel lblNewLabel_3 = new JLabel("Patient SignIn");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 29));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(33, 163, 238, 214);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 22));
		btnNewButton.setBounds(33, 33, 117, 35);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.isEnabled()) {
					 	home ah = new home();
					 	ah.setVisible(true);
					 	dispose();

			            System.out.println("*Home pressed*");
			        }

			}
		});
		
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setBounds(616, 310, 148, 35);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 if (btnNewButton_1.isEnabled()) {
					 	System.out.println("Register button is pressed");
					 	
					 	String id = textField.getText();					
						String pas = textField_1.getText();
						
					 	registerp(id,pas);
					 	dispose();
				        booking b = new booking();
				        b.setVisible(true);

			        }
			        if (!btnNewButton_1.isEnabled()) {
			            System.out.println("Register button is not pressed");
			        }
				
				
			}
		});
		contentPane.add(btnNewButton_1);
	}
}
