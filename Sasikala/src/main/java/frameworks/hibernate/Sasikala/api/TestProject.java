package frameworks.hibernate.Sasikala.api;

import java.util.Iterator;
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
		ProjectionList plist=Projections.projectionList();
		plist.add(Projections.property("name"));
		plist.add(Projections.property("duration"));
		plist.add(Projections.property("type"));
		criteria.add(Restrictions.between("price", 20,60)).
		setProjection(plist);
		List<Object> many=criteria.list();
		/*for(Object temp:many)
		{System.out.println(temp);}*/
		Iterator it=many.iterator();

		while(it.hasNext())
		{
			Object ob[] = (Object[])it.next();
			System.out.println(ob[0]+" "+ob[1]+" "+ob[2]);
		}
		
		session.getTransaction().commit();
		session.close();
	}
}
