package Main;

import java.text.ParseException;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import View.StartView;
import Controller.Controller;



public class Main 
{
	 private static SessionFactory buildSessionFactory() 
	 {
	        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	                .configure().build();
	        try 
	        {
	            return new MetadataSources(registry).buildMetadata().buildSessionFactory();
	        } catch (Exception e) 
	        {
	            e.printStackTrace();
	            StandardServiceRegistryBuilder.destroy(registry);
	            return null;
	        } 
	    }
            
            
	public static void main(String[] args) throws ParseException
	{
		SessionFactory sf = null;
        
        try 
        {
            sf = buildSessionFactory();
            Controller controller = new Controller(sf);
            StartView startView = new StartView(null, true, controller);
            while(startView.isVisible())
            {}
        } 
        catch (HibernateException e) 
        {
        	if (sf != null) sf.close();
            e.printStackTrace();
        } 
        finally 
        {
        	if (sf != null) sf.close(); 
        	System.out.println("SessionFactory cerrado en Main.");
        }
    }

}
