package frameworks.hibernate.Sasikala.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import frameworks.hibernate.Sasikala.hql.Projector;

public class TestSecondLevel 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s1=factory.openSession();
		s1.beginTransaction();
		
		System.out.println(s1.get(Projector.class, 3));
		
		s1.getTransaction().commit();
		s1.close();
		
		Session s2=factory.openSession();
		s2.beginTransaction();
		
		System.out.println(s2.get(Projector.class, 3));
		
		s2.getTransaction().commit();s2.close();
	}
}
