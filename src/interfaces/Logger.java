package interfaces;

public interface Logger {
	boolean login(int select, String username, String password);
	void register(String username, String password, User user);
}
