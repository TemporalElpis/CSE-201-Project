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
				System.out.println("the detail of login");
			}
		});
		
		// sign up button
		JButton signUpButtom = new JButton("Sign Up");
		frame.add(signUpButtom);
		signUpButtom.setBounds(790, 20, 100, 30);
		signUpButtom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("the detail of sign up");
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
}
