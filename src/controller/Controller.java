package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.Model;
import interfaces.User;
import interfaces.View;
import model.Application;
import model.UserImpl;
import view.SignUpForm;
import view.ViewImpl;

public class Controller {
	private Model model;
	private View view;
	
	public void start() {
		this.model = new Application("accountdata");
		this.view = new ViewImpl();
		this.initLoginView(0);
		this.initLoginView(1);
	}
	
	public void initLoginView(int select) {
		this.view.getFrames()[0].loginMenu();
		this.view.getFrames()[1].loginMenu();
		
		// listener login button
		Controller c = this;
		ActionListener login = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username = view.getFrames()[select].getLoginPanel().getUsernameField().getText();
				String password = view.getFrames()[select].getLoginPanel().getPasswordField().getText();
				boolean logged = model.getLogger().login(select,username,password);
				if(!logged)
					view.getFrames()[select].getLoginPanel().loginFailed();
				else {
					view.getFrames()[select].lobbyMenu();
					c.model.initLobbyManager();
					c.initLobbyView();
				}
			}	
		};
		this.view.getFrames()[select].getLoginPanel().getLoginBtn().addActionListener(login);
		
		// listener sign up button
		ActionListener signUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.getFrames()[select].signUp();
			}
		};
		this.view.getFrames()[select].getLoginPanel().getSignUpBtn().addActionListener(signUp);
	}
	
	public void initLobbyView() {
		
	}
	
	public void initTeamView() {
		
	}
}
