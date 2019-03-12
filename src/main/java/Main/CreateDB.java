package Main;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CreateDB 
{
	 public static void main(String[] args) {
	        SessionFactory sf = null;
	        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	                .configure()
	                .applySetting("hibernate.hbm2ddl.auto", "create")
	                .applySetting("hibernate.connection.username", "root")
	                .applySetting("hibernate.connection.password", "")
	                .build();
	        try {
	            sf =  new MetadataSources(registry).buildMetadata().buildSessionFactory();
	        } catch (Exception e) {
	            e.printStackTrace();
	            StandardServiceRegistryBuilder.destroy(registry);
	        } finally {
	            if (sf != null) sf.close();
	        }
	    }

}
