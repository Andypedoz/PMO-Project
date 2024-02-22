package model;

import interfaces.AccountManager;
import interfaces.LobbyManager;
import interfaces.Logger;
import interfaces.Model;
import interfaces.PokemonLoader;

public class Application implements Model{
	private AccountManager fileManager;
	private PokemonLoader pokemonLoader;
	private Logger logger;
	private LobbyManager lobbyManager;
	
	public Application(String filepath) {
		this.fileManager = new AccountManagerImpl(filepath);
		this.fileManager.loadAccounts();
		this.logger = new LoggerImpl(fileManager);
	}
	
	@Override
	public AccountManager getAccountManager() {
		// TODO Auto-generated method stub
		return this.fileManager;
	}

	@Override
	public PokemonLoader getPokemonLoader() {
		// TODO Auto-generated method stub
		return this.pokemonLoader;
	}

	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return this.logger;
	}

	@Override
	public LobbyManager getLobbyManager() {
		// TODO Auto-generated method stub
		return this.lobbyManager;
	}

	@Override
	public void initPokedex() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initLobbyManager() {
		// TODO Auto-generated method stub
		this.lobbyManager = new LobbyManagerImpl(this.fileManager);
		System.out.println("LobbyManager attivo!");
	}

}
