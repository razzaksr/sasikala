package frameworks.hibernate.Sasikala.cache;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import frameworks.hibernate.Sasikala.hql.Projector;

public class TestQueryCache 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s1=factory.openSession();
		s1.beginTransaction();
		
		Query q1=s1.createQuery("from Projector where proId=2");
		q1.setCacheable(true);
		List<Projector> act=q1.list();
		System.out.println(act);
		
		s1.getTransaction().commit();
		s1.close();
		
		Session s2=factory.openSession();
		s2.beginTransaction();
		
		Query q2=s2.createQuery("from Projector where proId=2");
		q2.setCacheable(true);
		act=q2.list();
		System.out.println(act);
		
		s2.getTransaction().commit();s2.close();
	}
}
