package frameworks.hibernate.Sasikala.api;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TestProject 
{
	public static void main(String[] args) 
	{
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Seed.class);
		/*criteria.add(Restrictions.eq("type", "Hybrid")).
		setProjection(Projections.property("name"));
		List<String> got=criteria.list();
		for(String temp:got) 
		{System.out.println(temp);}*/
		
		System.out.println("Second output");
		criteria.add(Restrictions.between("price", 20,60)).
		setProjection(Projections.projectionList().
				add(Projections.property("name")).add(Projections.property("duration")));
		List<Object> many=criteria.list();
		for(Object temp:many)
		{System.out.println(temp);}
		
		session.getTransaction().commit();
		session.close();
	}
}
