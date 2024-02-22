package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class LoginPanel extends JPanel{
	
	JPanel sidePanel, loginSide;
	JTextField usernameField;
	JPasswordField passwordField;
	JLabel title, username, password, signUpLabel;
	JButton login, signUp;
	
	public LoginPanel() {
		// init settings
		this.setSize(800,600);
		this.setLayout(new GridLayout(1,2));
		
		// init components
		sidePanel = new JPanel();
		sidePanel.setBackground(Color.CYAN);
		loginSide = new JPanel();
		loginSide.setLayout(null);
		usernameField = new JTextField(20);
		passwordField = new JPasswordField(20);
		title = new JLabel("LOGIN");
		username = new JLabel("Username");
		password = new JLabel("Password");
		login = new JButton("Accedi");
		signUp = new JButton("Registrati");
		signUpLabel = new JLabel("Non hai un account?");
		
		// setting positions
		title.setBounds(180,100,100,30);
		usernameField.setBounds(100,170,200,30);
		passwordField.setBounds(100,240,200,30);
		username.setBounds(30,170,100,30);
		password.setBounds(30,240,100,30);
		login.setBounds(160,300,80,30);
		signUp.setBounds(30,510,100,30);
		signUpLabel.setBounds(10,470,150,30);
		
		loginSide.add(title);
		loginSide.add(usernameField);
		loginSide.add(passwordField);
		loginSide.add(username);
		loginSide.add(password);
		loginSide.add(login);
		loginSide.add(signUp);
		loginSide.add(signUpLabel);
		this.add(sidePanel);
		this.add(loginSide);
	}
	
	public void loginFailed() {
		JDialog popup = new JDialog();
		popup.setSize(300,200);
		JLabel message = new JLabel("Errore: Account non trovato!");
		popup.add(message);
		popup.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		popup.setLocationRelativeTo(null);
		popup.setVisible(true);
	}
	
	public JButton getLoginBtn() {
		return this.login;
	}
	
	public JButton getSignUpBtn() {
		return this.signUp;
	}
	
	public JTextField getUsernameField() {
		return this.usernameField;
	}
	
	public JPasswordField getPasswordField() {
		return this.passwordField;
	}
}
