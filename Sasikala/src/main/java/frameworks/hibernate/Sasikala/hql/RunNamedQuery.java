package frameworks.hibernate.Sasikala.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunNamedQuery 
{
	public static void main(String[] args) 
	{
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		
		Query q=session.getNamedQuery("myOwnOne");
		List<Integer> yet=q.list();
		System.out.println(yet);
		
		/*q=session.getNamedNativeQuery("myOwnTwo");// hibernate 5.X required
		List<Projector> all=q.list();
		for(Projector p:all)
		{System.out.println(p.getItem()+" "+p.getHours());}*/
		
		session.getTransaction().commit();
		session.close();
	}
}
