package model;

import interfaces.Account;
import interfaces.Lobby;

public class LobbyImpl implements Lobby{
	private Account owner, guest;
	private int id;
	
	public LobbyImpl(Account owner, int id) {
		this.owner = owner;
		this.id = id;
	}
	
	@Override
	public Account getOwner() {
		// TODO Auto-generated method stub
		return this.owner;
	}

	@Override
	public Account getGuest() {
		// TODO Auto-generated method stub
		return this.guest;
	}

	public int getId() {
		return this.id;
	}
}
