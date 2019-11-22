import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIMockUp extends JPanel{
	
	// =============================================== Properties
	
	public static void main(String[] args) {	
		// create a new frame
		JFrame frame = new JFrame("AlphaSoft"); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		frame.setSize(1024, 768);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		// log in button
		JButton logInButtom = new JButton("Log In");
		frame.add(logInButtom);
		logInButtom.setBounds(900, 20, 100, 30);
		logInButtom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		
		// sign up button
		JButton signUpButtom = new JButton("Sign Up");
		frame.add(signUpButtom);
		signUpButtom.setBounds(790, 20, 100, 30);
		signUpButtom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				creatAccount();
			}
		});
		
		
		
		Font font = new Font("Arial", Font.PLAIN, 36);
		// create a search box
		JTextField searchInput = new JTextField();
		JButton searchButtom = new JButton("Search");
		frame.add(searchInput);
		frame.add(searchButtom);
		searchInput.setBounds(200, 80, 550, 30);
		searchButtom.setBounds(750, 80, 100, 30);
		searchButtom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = searchInput.getText();
				JLabel result = new JLabel("search result of "+s);
				result.setHorizontalAlignment(JLabel.CENTER);
				result.setFont(font);
				frame.add(result);
				result.setBounds(200, 100, 700, 600);
			}
		});
		
		// create a list
//		JLabel list = new JLabel("List");
//		list.setHorizontalAlignment(JLabel.CENTER);
//		list.setFont(font);
//		frame.add(list);
//		list.setBounds(200, 100, 700, 600);
		
		// create a filter box
		JButton filter = new JButton("filter");
		frame.add(filter);
		filter.setBounds(10, 100, 180, 360);
		filter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = "filter result";
				JLabel result = new JLabel(s);
				result.setHorizontalAlignment(JLabel.CENTER);
				result.setFont(font);
				frame.add(result);
				result.setBounds(200, 100, 700, 600);
			}
		});
		
		
//		
//		
//		JLabel filter = new JLabel("Filter");
//		filter.setHorizontalAlignment(JLabel.CENTER);
//		filter.setFont(font);
//		frame.add(filter);
		
	}
	
	
	
	public static boolean creatAccount() {
		JFrame loginFrame = new JFrame("Creat Your Personal Account~"); 
		loginFrame.setVisible(true);
		loginFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		loginFrame.setAlwaysOnTop(true);
		loginFrame.setSize(512 , 200);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setLayout(null);
		
		//type name
		JLabel typeAccountName = new JLabel("User name: ");
		loginFrame.add(typeAccountName);
		typeAccountName.setBounds(100, 20, 100, 50);
		
		JTextField textUseName = new JTextField();
		textUseName.setBounds(200, 33, 220, 25);
		loginFrame.add(textUseName);
		
		//type password
		JLabel typepassword = new JLabel("Password: ");
		loginFrame.add(typepassword);
		typepassword.setBounds(100, 50, 100, 50);
		
		JTextField textPassword = new JTextField();
		textPassword.setBounds(200, 63, 220, 25);
		loginFrame.add(textPassword);
		
		//type password again
		JLabel typepasswordAgain = new JLabel("Type Password Again: ");
		loginFrame.add(typepasswordAgain);
		typepasswordAgain.setBounds(50, 80, 150, 50);

		JTextField textPasswordAgain = new JTextField();
		textPasswordAgain.setBounds(200, 93, 220, 25);
		loginFrame.add(textPasswordAgain);
		return false;
	}
	
	public static boolean Login() {
		JFrame loginFrame = new JFrame("Creat Your Personal Account~"); 
		loginFrame.setVisible(true);
		loginFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		loginFrame.setAlwaysOnTop(true);
		loginFrame.setSize(512 , 200);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setLayout(null);
		
		JLabel typeAccountName = new JLabel("User name: ");
		loginFrame.add(typeAccountName);
		typeAccountName.setBounds(100, 20, 100, 50);
		
		JLabel typepassword = new JLabel("Password: ");
		loginFrame.add(typepassword);
		typepassword.setBounds(100, 80, 100, 50);
		return false;
	}
}
