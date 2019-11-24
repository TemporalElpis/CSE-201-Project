import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;  

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
		logInButtom.setBounds(frame.getWidth()-130, 20, 100, 30);
		logInButtom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		
		// sign up button
		JButton signUpButtom = new JButton("Sign Up");
		frame.add(signUpButtom);
		signUpButtom.setBounds(frame.getWidth()-240, 20, 100, 30);
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
		searchInput.setBounds(frame.getWidth()/5, frame.getHeight()/9, frame.getWidth()/100*55, 30);
		searchButtom.setBounds(searchInput.getX() + searchInput.getWidth() + 10, searchInput.getY(), 100, 30);
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
		

		//TABLE 
		JTable table = new JTable();
		table.setVisible(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},					
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},					
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Genre", "Developer", "Interface", "Price", "Rating"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		table.setBounds(frame.getX()-250, frame.getY()+20, frame.getWidth()+120, frame.getHeight()-40);
		frame.add(table);
	}
	
	
	
	public static boolean creatAccount() {
		JFrame loginFrame = new JFrame("Creat Your Personal Account~"); 
		loginFrame.setVisible(true);
		loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		loginFrame.setAlwaysOnTop(true);
		loginFrame.setSize(512 , 200);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setLayout(null);
		
		//type name
		JLabel typeAccountName = new JLabel("User name: ");
		loginFrame.add(typeAccountName);
		typeAccountName.setBounds(100, 0, 100, 50);
		
		JTextField textUseName = new JTextField();
		textUseName.setBounds(200, 13, 220, 25);
		loginFrame.add(textUseName);
		
		//type password
		JLabel typepassword = new JLabel("Password: ");
		loginFrame.add(typepassword);
		typepassword.setBounds(100, 30, 100, 50);
		
		JTextField textPassword = new JTextField();
		textPassword.setBounds(200, 43, 220, 25);
		loginFrame.add(textPassword);
		
		//type password again
		JLabel typepasswordAgain = new JLabel("Type Password Again: ");
		loginFrame.add(typepasswordAgain);
		typepasswordAgain.setBounds(50, 60, 150, 50);

		JTextField textPasswordAgain = new JTextField();
		textPasswordAgain.setBounds(200, 73, 220, 25);
		loginFrame.add(textPasswordAgain);
		
		//click SignUp
		JButton signUp = new JButton("Sign Up!");
		loginFrame.add(signUp);
		signUp.setBounds(150, 110, 100, 30);
		signUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = textUseName.getText();
				String password1 = textPassword.getText();
				String password2 = textPasswordAgain.getText();
				boolean exist = checkExist(userName);
				
				//password is same && account does not exist
				if(password1.equals(password2) && !exist) {
					boolean status = creatAccount(userName,password1);
					if(status) {
						//print successful page
						JFrame successFrame = new JFrame("Account Created"); 
						successFrame.setVisible(true);
						successFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						successFrame.setAlwaysOnTop(true);
						successFrame.setSize(512 , 200);
						successFrame.setLocationRelativeTo(null);
						successFrame.setLayout(null);
					
						//success message Label
						JLabel successtext = new JLabel("Your account has been SUCCESSFULLY created!");
						successFrame.add(successtext);
						successtext.setBounds(120, 10, 300, 50);
						JLabel Welcome = new JLabel("Welcome!");
						successFrame.add(Welcome);
						Welcome.setBounds(220, 30, 900, 50);
						//done button
						JButton Awesome = new JButton("Awesome!");
						successFrame.add(Awesome);
						Awesome.setBounds(200, 110, 100, 30);
						Awesome.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
							successFrame.dispose();
							}
						});
					}
					
					loginFrame.dispose();
				}
				
				//password not match
				else if(!exist){
					//print fail page
					JFrame failFrame = new JFrame("Account Not Created"); 
					failFrame.setVisible(true);
					failFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					failFrame.setAlwaysOnTop(true);
					failFrame.setSize(512 , 200);
					failFrame.setLocationRelativeTo(null);
					failFrame.setLayout(null);
					
					//fail message Label
					JLabel failtext = new JLabel("Your password does not match!");
					failFrame.add(failtext);
					failtext.setBounds(120, 20, 300, 50);
					
					//done button
					JButton done = new JButton("done");
					failFrame.add(done);
					done.setBounds(200, 110, 100, 30);
					done.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							failFrame.dispose();
						}
					});
				}
			
				//user exist
				else {
					//print fail page
					JFrame failFrame = new JFrame("Account Not Created"); 
					failFrame.setVisible(true);
					failFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					failFrame.setAlwaysOnTop(true);
					failFrame.setSize(512 , 200);
					failFrame.setLocationRelativeTo(null);
					failFrame.setLayout(null);
					
					//fail message Label
					JLabel failtext = new JLabel("Your Account is already exist!");
					failFrame.add(failtext);
					failtext.setBounds(120, 20, 300, 50);
					
					//done button
					JButton done = new JButton("done");
					failFrame.add(done);
					done.setBounds(200, 110, 100, 30);
					done.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							failFrame.dispose();
						}
					});
				}
			}

			private boolean checkExist(String userName) {
				Scanner scn = null;
				String line;
				try {
					scn = new Scanner(new File("Account.txt"));
					while(scn.hasNextLine()) {
						line = scn.nextLine();
						String userNameInFile = line.substring(0,line.charAt(' '));
						if(userNameInFile.equals(userName)) {
							return true;
						}
					}
				}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
				scn.close();
				return false;
			}

			//creatAccount
			private boolean creatAccount(String userName, String password1) {
				PrintWriter pw = null;
				//write account in file
				try {
					pw = new PrintWriter("Account.txt");
					pw.println(userName + " " + password1 + "\n");
					pw.close();
					return true;
				}
				catch(Exception ex) {
					System.out.println(ex.getMessage());
					return false;
				}				
			}
			
			
		});
		
		//click Cancel
		JButton cancel = new JButton("Cancel");
		loginFrame.add(cancel);
		cancel.setBounds(280, 110, 100, 30);
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loginFrame.dispose();
			}
		});
		return true;
	}
	
	public static boolean Login() {
		JFrame loginFrame = new JFrame("Creat Your Personal Account~"); 
		loginFrame.setVisible(true);
		loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		loginFrame.setAlwaysOnTop(true);
		loginFrame.setSize(512 , 200);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setLayout(null);
		
		//type username
		JLabel typeAccountName = new JLabel("User name: ");
		loginFrame.add(typeAccountName);
		typeAccountName.setBounds(100, 20, 100, 50);
		
		JTextField textUseName = new JTextField();
		textUseName.setBounds(200, 33, 220, 25);
		loginFrame.add(textUseName);
		
		//type password
		JLabel typepassword = new JLabel("Password: ");
		loginFrame.add(typepassword);
		typepassword.setBounds(100, 65, 100, 50);
		
		JTextField textPassword = new JTextField();
		textPassword.setBounds(200, 80, 220, 25);
		loginFrame.add(textPassword);
		return false;
	}
}
