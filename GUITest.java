import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class GUITest{
	
	private static JFrame frame;
	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JTextField textField;
	private JButton login, signup;
	private JLabel search;
	private JScrollPane scrollPane;
	
	public GUITest() {
		frame = new JFrame();
		contentPane = new JPanel();
		panel = new JPanel();
		textField = new JTextField();
		table = new JTable();
		login = new JButton();
		signup = new JButton();
		search = new JLabel();
		init();
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void init() {
		frame.setTitle("Game Catalog");
		frame.setLayout(null);
		
		search.setText("Search:");
		
		textField.setColumns(100);
		
		login.setText("Log In");
		signup.setText("Sign Up");
		
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
		scrollPane = new JScrollPane(table);
		
		search.setBounds(frame.getX()+150, frame.getY()+10, 50, 30);
		textField.setBounds(frame.getX()+210, frame.getY()+10, 400, 30);
		login.setBounds(frame.getX()+800, 10, 80, 30);
		signup.setBounds(frame.getX()+900, 10, 80, 30);
		table.setBounds(frame.getX(), frame.getY()+40, frame.getWidth(), frame.getHeight()-40);
//		scrollPane.setPreferredSize(new Dimension(500,500));
		
		frame.add(search);
		frame.add(textField);
		frame.add(login);
		frame.add(signup);
////		frame.add(table);
		frame.setContentPane(contentPane);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new GUITest();
		frame.setVisible(true);
	}

}
