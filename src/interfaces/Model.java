package interfaces;

public interface Model {
	AccountManager getAccountManager();
	PokemonLoader getPokemonLoader();
	Logger getLogger();
	LobbyManager getLobbyManager();
	void initPokedex();
	void initLobbyManager();
}
