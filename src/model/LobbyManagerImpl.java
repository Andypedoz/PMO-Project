package model;

import java.util.LinkedList;
import java.util.List;

import interfaces.Account;
import interfaces.AccountManager;
import interfaces.Lobby;
import interfaces.LobbyManager;

public class LobbyManagerImpl implements LobbyManager{
	private AccountManager fileManager;
	private List<Lobby> lobbyList;
	
	public LobbyManagerImpl(AccountManager fileManager) {
		this.fileManager = fileManager;
		this.lobbyList = new LinkedList();
	}
	
	@Override
	public List<Lobby> getLobbyList() {
		// TODO Auto-generated method stub
		return this.lobbyList;
	}

	@Override
	public void addLobby(int select) {
		// TODO Auto-generated method stub
		Account owner = this.fileManager.getAccount(select);
		try {
			int lastId = this.lobbyList.get(this.lobbyList.size() - 1).getId();
			int newId = lastId + 1;
			Lobby lobby = new LobbyImpl(owner,newId);
			this.lobbyList.add(lobby);
			System.out.println("Lobby "+newId+" creata da "+owner.getUsername());
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Nessuna lobby trovata");
			Lobby lobby = new LobbyImpl(owner,0);
			this.lobbyList.add(lobby);
			System.out.println("Lobby 0 creata da "+owner.getUsername());
		}

	}
	
}
