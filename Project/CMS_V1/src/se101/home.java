package se101;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 595);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CMS Portal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 32));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(73, 227, 241, 97);
		contentPane.add(lblNewLabel);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(355, 144, 3, 257);
		contentPane.add(canvas);
		
		JButton btnNewButton = new JButton("Doctor Sign In");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 23));
		btnNewButton.setBounds(432, 297, 216, 59);
		contentPane.add(btnNewButton);

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.isEnabled()) {
					 	login ah = new login();
					 	ah.setVisible(true);
					 	dispose();

			            System.out.println("Doc Sign In");
			        }

			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Patient Sign In");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 23));
		btnNewButton_1.setBounds(432, 195, 216, 58);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (btnNewButton_1.isEnabled()) {
				 	loginp ah = new loginp();
				 	ah.setVisible(true);
				 	dispose();

		            System.out.println("Pat Sign In");
		        }
				
			}
		});
		
		contentPane.add(btnNewButton_1);
	}
}
