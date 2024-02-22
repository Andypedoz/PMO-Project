package interfaces;

import java.util.HashMap;

public interface PokemonLoader {
	void loadPokedex();
	HashMap<String,Pokemon> getPokedex();
}
