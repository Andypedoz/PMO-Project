package interfaces;

import java.util.List;

public interface LobbyManager {
	List<Lobby> getLobbyList();
	void addLobby(int select);
}
