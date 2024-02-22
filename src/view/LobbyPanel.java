package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class LobbyPanel extends JPanel{
	
	/* lista di lobby disponibili anche se vi sono solo due profili nel sistema
	 * solo lotta singola al momento
	 *  
	*/
	
	JPanel playPanel, sidePanel;
	JButton joinBtn;
	
	public LobbyPanel() {
		this.setSize(800,600);
		this.setLayout(new GridLayout(1,2));
		playPanel = new JPanel();
		playPanel.setLayout(new GridLayout());
		playPanel.setSize(500,600);
		playPanel.setBackground(Color.lightGray);
		sidePanel = new JPanel();
		sidePanel.setSize(300,600);

		
		
		
		
		this.add(playPanel);
		this.add(sidePanel);
	}
}
