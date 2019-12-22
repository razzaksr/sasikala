package frameworks.hibernate.Sasikala.cache;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;

import frameworks.hibernate.Sasikala.hql.Projector;

public class TestQueryByExample 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s1=factory.openSession();
		s1.beginTransaction();
		
		Projector pro=new Projector();pro.setItem("Son%");
		/*pro.setHours(8000);pro.setLumens(200);
		pro.setProId(5);*/
		
		Example exa=Example.create(pro).enableLike();//(MatchMode.START);
		
		Criteria c=s1.createCriteria(Projector.class);
		c.add(exa);
		List<Projector> every=c.list();
		System.out.println(every);
		
		s1.getTransaction().commit();
		s1.close();
	}
}
