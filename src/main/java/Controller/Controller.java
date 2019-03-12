package Controller;

import org.hibernate.SessionFactory;

import DB.DAO;
import Model.Game;


public class Controller 
{
private DAO dao;
	
	public Controller(SessionFactory sf) 
	{
		this.dao = new DAO(sf);
	}
	
	public void cierraSF()
	{
		this.dao.cierraSF();
	}
	
	public void insertGame(Game game)
	{
		this.dao.insertGame(game);
	}
	
	public void saveGame(Game game)
	{ 
		this.dao.saveGame(game);
	}
}
