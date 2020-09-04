import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class BankGUI {

	BankGUI window;
	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JLabel lblUsername;
	private JLabel lblPassword;

	//Default Constructor
	//BankGUI
	public BankGUI BankGUI() {
		window = new BankGUI();
		return window;
			
	}

	/**
	 * Create the application.
	 */
	public BankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(129, 49, 86, 20);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(129, 91, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(56, 46, 75, 25);
		frame.getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(58, 93, 66, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(58, 192, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnSignup = new JButton("Sign Up");
		btnSignup.setBounds(172, 192, 89, 23);
		frame.getContentPane().add(btnSignup);
	}
}
