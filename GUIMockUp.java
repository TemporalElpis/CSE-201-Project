
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;  

public class GUIMockUp extends JPanel{
	
	// =============================================== Properties
	private JFrame frame;
	private JButton signUpButtom;
	private JButton logInButtom;
	private JButton logOutButtom;
	private JTable table;
	
	public GUIMockUp() {
		frame = new JFrame();
		signUpButtom = new JButton();
		logInButtom = new JButton();
		logOutButtom = new JButton();
		table = new JTable();
		init();
	}
	
	public static void main(String[] args) {
		GUIMockUp cataLog = new GUIMockUp();
		cataLog.frame.setVisible(true);
	}
	
	private void init() {
		
		// create a new frame
		frame.setTitle("Game Catalog");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		// sign up button
		signUpButtom.setText("Sign Up");
		frame.add(signUpButtom);
		signUpButtom.setBounds(frame.getWidth()-240, 20, 100, 30);
		signUpButtom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				creatAccount();
			}
		});

		// log in button
		logInButtom.setText("Log In");
		frame.add(logInButtom);
		logInButtom.setBounds(frame.getWidth()-130, 20, 100, 30);
		logInButtom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		
		// log out button
		logOutButtom.setText("Log Out");
		logOutButtom.setVisible(false);
		frame.add(logOutButtom);
		logOutButtom.setBounds(frame.getWidth()-130, 20, 100, 30);
		logOutButtom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signUpButtom.setVisible(true);
				logInButtom.setVisible(true);
				logOutButtom.setVisible(false);
			}
		});
		
		
		Font font = new Font("Arial", Font.PLAIN, 36);
		// create a search box
		JTextField searchInput = new JTextField();
		JButton searchButtom = new JButton("Search");
		frame.add(searchInput);
		frame.add(searchButtom);
		searchInput.setLocation(230, frame.getHeight()/9);
		searchInput.setSize(searchInput.getX()+ 350, 30);
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
	
		// create a filter panel
		JPanel filterPane = new JPanel();
		filterPane.setLayout(null);
		JLabel filter = new JLabel("Filter:");
		filter.setBounds(10, 0, 100, 50);
		filter.setFont(new Font("Arial", 1, 25));
		filterPane.add(filter);
		
		JLabel byPlatform = new JLabel("Platform: ");
		byPlatform.setBounds(filter.getX()+20, filter.getY()+80, 100, 30);
		byPlatform.setFont(new Font("Arial", 1, 15));
		filterPane.add(byPlatform);
		
		JRadioButton nintendo3ds = new JRadioButton("Nintendo 3DS");
		nintendo3ds.setBounds(byPlatform.getX()+10, byPlatform.getY()+40, 120, 30);
		filterPane.add(nintendo3ds);
		
		JRadioButton nintendoSwitch = new JRadioButton("Nintendo Switch");
		nintendoSwitch.setBounds(nintendo3ds.getX(), nintendo3ds.getY()+30, 120, 30);
		filterPane.add(nintendoSwitch);
		
		JRadioButton playS3 = new JRadioButton("PlayStation 3");
		playS3.setBounds(nintendo3ds.getX(), nintendoSwitch.getY()+30, 120, 30);
		filterPane.add(playS3);
		
		JRadioButton playS4 = new JRadioButton("PlayStation 4");
		playS4.setBounds(nintendo3ds.getX(), playS3.getY()+30, 120, 30);
		filterPane.add(playS4);
		
		JRadioButton xBox = new JRadioButton("XBOX");
		xBox.setBounds(nintendo3ds.getX(), playS4.getY()+30, 120, 30);
		filterPane.add(xBox);
		
		
		filterPane.setBounds(20, searchInput.getY(), searchInput.getX()-40, 550);
		filterPane.setBorder(BorderFactory.createEtchedBorder());
		frame.add(filterPane);

		//TABLE
		table.setVisible(true);
		table.setEnabled(false);
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
		
		DefaultTableCellRenderer r=new DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class,r);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(searchInput.getX(), searchInput.getY()+50, 
				searchButtom.getWidth()-searchInput.getX()+searchButtom.getX(), 500);
		frame.add(scrollPane);
		
		 
		frame.setVisible(true);
	
	}
	
	
	
	private boolean creatAccount() {
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
		
		JPasswordField textPassword = new JPasswordField();
		textPassword.setBounds(200, 43, 220, 25);
		loginFrame.add(textPassword);
		
		//type password again
		JLabel typepasswordAgain = new JLabel("Type Password Again: ");
		loginFrame.add(typepasswordAgain);
		typepasswordAgain.setBounds(50, 60, 150, 50);

		JPasswordField textPasswordAgain = new JPasswordField();
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
				String password1 = "";
				for(char i : textPassword.getPassword())
					password1 += i;
				String password2 = "";
				for(char i : textPasswordAgain.getPassword())
					password2 += i;
				boolean exist = checkExist(userName);
				
				//password is same && account does not exist
				if(password1.equals(password2) && !exist) {
					Account acc = new Account(userName,password1);
					boolean status = creatAccount(acc);
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
					else {
						System.out.println("error in CreatAccount");
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
				boolean result = false;
				String line;
				try {
					scn = new Scanner(new File("Account.txt"));
					while(scn.hasNextLine()) {
						line = scn.nextLine();
						String [] parts= new String [2];
						parts = line.split(", ");
						String userNameInFile = parts[0];
						if(userNameInFile.equals(userName)) {
							result = true;
						}
					}
				}
				catch(Exception ex){
					result = false;
				}
				scn.close();
				return result;
			}

			//creatAccount
			private boolean creatAccount(Account acc) {
				PrintWriter pw = null;
				//write account in file
				try {
					pw = new PrintWriter(new FileWriter("Account.txt",true));
					pw.println(acc.toString());
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
	
	private boolean Login() {
		JFrame loginFrame = new JFrame("Login~"); 
		loginFrame.setVisible(true);
		loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		loginFrame.setAlwaysOnTop(true);
		loginFrame.setSize(512 , 200);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setLayout(null);
		
		//type username
		JLabel typeAccountName = new JLabel("User name: ");
		loginFrame.add(typeAccountName);
		typeAccountName.setBounds(100, 0, 100, 50);
		
		JTextField textUseName = new JTextField();
		textUseName.setBounds(200, 13, 220, 25);
		loginFrame.add(textUseName);
		
		//type password
		JLabel typepassword = new JLabel("Password: ");
		loginFrame.add(typepassword);
		typepassword.setBounds(100, 45, 100, 50);
		
		JPasswordField textPassword = new JPasswordField();
		textPassword.setBounds(200, 60, 220, 25);
		loginFrame.add(textPassword);
		
		//click login
		JButton loginbuttom = new JButton("GO!");
		loginFrame.add(loginbuttom);
		loginbuttom.setBounds(210, 100, 100, 30);
		loginbuttom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = textUseName.getText();
				String password1 = "";
				for(char i : textPassword.getPassword())
					password1 += i;
				Account accType = new Account(userName,password1);
				boolean match = checkMatch(accType);
				//all match
				if(match) {
					//print successful page
					JFrame successFrame = new JFrame("Login Successful"); 
					successFrame.setVisible(true);
					successFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					successFrame.setAlwaysOnTop(true);
					successFrame.setSize(512 , 200);
					successFrame.setLocationRelativeTo(null);
					successFrame.setLayout(null);
				
					//success message Label
					JLabel successtext = new JLabel("You has been SUCCESSFULLY login!");
					successFrame.add(successtext);
					successtext.setBounds(120, 10, 300, 50);
					//done button
					JButton Welcome = new JButton("Welcome!");
					successFrame.add(Welcome);
					Welcome.setBounds(200, 110, 100, 30);
					Welcome.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							successFrame.dispose();
							loginFrame.dispose();
							signUpButtom.setVisible(false);
							logInButtom.setVisible(false);
							logOutButtom.setVisible(true);
							JLabel msg = new JLabel("Welcome " + userName + " !");
							msg.setBounds(signUpButtom.getX(), signUpButtom.getY(), signUpButtom.getWidth(), signUpButtom.getHeight());
							frame.add(msg);
						}
					});
				}
				
				//fail
				else {
					//print fail page
					JFrame successFrame = new JFrame("Login failed"); 
					successFrame.setVisible(true);
					successFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					successFrame.setAlwaysOnTop(true);
					successFrame.setSize(512 , 200);
					successFrame.setLocationRelativeTo(null);
					successFrame.setLayout(null);
				
					//success message Label
					JLabel successtext = new JLabel("Your account does not exist or your password does not match!");
					successFrame.add(successtext);
					successtext.setBounds(80, 20, 400, 50);
					//done button
					JButton Welcome = new JButton("try again~");
					successFrame.add(Welcome);
					Welcome.setBounds(200, 110, 100, 30);
					Welcome.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							successFrame.dispose();
						}
					});
				}
				

				
			}

			private boolean checkMatch(Account acc) {
				Scanner scn = null;
				String line;
				try {
					scn = new Scanner(new File("Account.txt"));
					while(scn.hasNextLine()) {
						line = scn.nextLine();
						String [] parts= new String [2];
						parts = line.split(", ");
						Account accInFile = new Account(parts[0], parts[1]);
						if(acc.equals(accInFile)) {
							scn.close();
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
		});
		return true;
	}

	private void view() {
		
	}
}
