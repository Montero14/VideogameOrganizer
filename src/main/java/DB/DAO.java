package DB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Model.Game;

public class DAO 
{
private SessionFactory sf;
	
	public DAO(SessionFactory sf)
	{
		this.sf = sf;
	}
	
	public void cierraSF()
	{
		this.sf.close();
		System.out.println("SessionFactory cerrado en DAO.");
	}
	
	public void insertGame(Game game)
	{
		Session session = this.sf.openSession();
		Transaction tr = (Transaction) session.beginTransaction();
		session.save(game);
		tr.commit();
		session.close();
	}
	
	public void saveGame(Game game)
	{
		Session session = this.sf.openSession();
		Transaction tr = session.beginTransaction();
		session.merge(game);
		tr.commit();
		session.close();
	}
}
