package frameworks.hibernate.Sasikala.api;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Test
{
	public static void main(String[] args) 
	{
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Seed.class);
		//criteria.add(Restrictions.ge("duration", 40));
		
		List<Seed> got=criteria.list();
		System.out.println(got);
		
		System.out.println("Second using like");
		//criteria.add(Restrictions.like("name", "C%"));
		got=criteria.list();
		System.out.println(got);
		
		System.out.println("Third combining");
		criteria.add(Restrictions.and(
				Restrictions.eq("type", "Natural"),
				Restrictions.le("price", 30)));
		got=criteria.list();
		System.out.println(got);
		
		System.out.println("Fourth combining by OR");
		criteria.add(Restrictions.or(
				Restrictions.eq("type", "Hybrid"),
				Restrictions.between("duration", 40, 100)));
		
		got=criteria.list();System.out.println(got);
		
		session.getTransaction().commit();
		session.close();
	}
}
