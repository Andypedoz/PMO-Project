package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class MyFrame extends JFrame{
	private int id;
	private LoginPanel loginPanel;
	private LobbyPanel lobbyPanel;
	private TeamPanel teamPanel;
	
	public MyFrame(int id) {
		this.id = id;
		this.setSize(800,600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		if(id == 0)
			this.setLocation(180,200);
		else
			this.setLocation(980,200);
		this.setVisible(true);
	}
	
	public void loginMenu() {
		if(this.lobbyPanel != null)
			this.remove(lobbyPanel);
		this.loginPanel = new LoginPanel();
		this.add(loginPanel);
		this.validate();
	}
	
	public void lobbyMenu() {
		if(this.loginPanel != null) {
			this.remove(loginPanel);
			this.loginPanel = null;
		}
		if(this.teamPanel != null) {
			this.remove(teamPanel);
			this.teamPanel = null;
		}
		this.lobbyPanel = new LobbyPanel();
		this.add(lobbyPanel);
		this.validate();
	}
	
	public void teamMenu() {
		if(this.lobbyPanel != null)
			this.remove(lobbyPanel);
		this.teamPanel = new TeamPanel();
		this.add(teamPanel);
		this.validate();
	}
	
	public void signUp() {
		new SignUpForm();
	}
	
	public LoginPanel getLoginPanel() {
		return this.loginPanel;
	}
	
	public LobbyPanel getLobbyPanel() {
		return this.lobbyPanel;
	}
	
	public TeamPanel getTeamPanel() {
		return this.teamPanel;
	}
}
