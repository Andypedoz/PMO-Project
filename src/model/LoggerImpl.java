package model;

import java.util.HashMap;

import interfaces.Account;
import interfaces.AccountManager;
import interfaces.Logger;
import interfaces.Pair;
import interfaces.User;

public class LoggerImpl implements Logger{
	private AccountManager fileManager;
	
	public LoggerImpl(AccountManager fileManager) {
		this.fileManager = fileManager;
	}
	
	// metodo per loggare
	@Override
	public boolean login(int select, String username, String password) {
		Account first = this.fileManager.getAccount(0);
		Account second = this.fileManager.getAccount(1);
		boolean logged = false;
		Account toLogin = new AccountImpl(username,password);
		if(this.fileManager.getAccounts().contains(toLogin)) {
		while(!logged)	
			for(Account a : this.fileManager.getAccounts()) {
				if(a.equals(toLogin))
					this.fileManager.setAccount(select, a);
					logged = true;
					System.out.println("Profilo "+(select+1)+" loggato come "+a.getUsername());
			}
		}else
			System.out.println("Errore: Account non trovato");
		return logged;
	}
	
	// metodo per registrarsi
	@Override
	public void register(String username, String password, User user) {
		// TODO Auto-generated method stub
		int lastId = this.fileManager.getAccounts().get(this.fileManager.getAccounts().size() - 1).getId();
		System.out.println("Last id: "+lastId);
		int newId = lastId + 1;
		Account toAdd = new AccountImpl(username,password,user,newId);
		if(!this.fileManager.getAccounts().contains(toAdd)) {
			this.fileManager.getAccounts().add(toAdd);
			System.out.println("Nuovo account registrato correttamente");
			this.fileManager.writeNewFile(toAdd);
		}else
			System.out.println("Account già esistente!");

	}

}
