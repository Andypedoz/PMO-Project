package model;

import java.util.HashMap;

import interfaces.Pokemon;
import interfaces.PokemonLoader;

public class PokemonLoaderImpl implements PokemonLoader{
	private HashMap<String,Pokemon> pokedex;
	
	@Override
	public void loadPokedex() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, Pokemon> getPokedex() {
		// TODO Auto-generated method stub
		return this.pokedex;
	}

}
