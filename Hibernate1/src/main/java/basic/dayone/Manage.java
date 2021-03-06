package basic.dayone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Manage 
{
	public void add()
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Bike bike=new Bike("Apache200", 40, 113000.8);
		session.save(bike);
		
		bike=new Bike("Apache160", 43, 98700.8);
		session.save(bike);
		
		bike=new Bike();
		session.save(bike);
		
		session.getTransaction().commit();
		session.close();
	}
}