import java.awt.Font;

import javax.swing.*;

public class GUIMockUp{
	
	// =============================================== Properties
	
	public static void main(String[] args) {
		// create a new frame
		JFrame frame = new JFrame("AlphaSoft"); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		// create log in and sign up buttons
		JButton logInButtom = new JButton("Log In");
		JButton signUpButtom = new JButton("Sign Up");
		frame.add(logInButtom);
		frame.add(signUpButtom);
		signUpButtom.setBounds(790, 20, 100, 30);
		logInButtom.setBounds(900, 20, 100, 30);
		
		// create a search box
		JTextField searchInput = new JTextField();
		JButton searchButtom = new JButton("Search");
		frame.add(searchInput);
		frame.add(searchButtom);
		searchInput.setBounds(200, 80, 550, 30);
		searchButtom.setBounds(750, 80, 100, 30);
		
		Font font = new Font("Arial", Font.PLAIN, 36);
		// create a list
		JLabel list = new JLabel("List");
		list.setHorizontalAlignment(JLabel.CENTER);
		list.setFont(font);
		frame.add(list);
		list.setBounds(200, 100, 700, 600);
		
		// create a filter box
		JLabel filter = new JLabel("Filter");
		filter.setHorizontalAlignment(JLabel.CENTER);
		filter.setFont(font);
		frame.add(filter);
		filter.setBounds(10, 100, 180, 360);
	}
}
