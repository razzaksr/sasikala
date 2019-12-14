package frameworks.hibernate.Sasikala.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunBasicHql 
{
	public static void main(String[] args) 
	{
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		
		// select * from visions
		Query qry=session.createQuery("from Projector");
		List<Projector> all=qry.list();
		for(Projector p:all)
		{System.out.println(p);}
		
		// select modName from visions
		qry=session.createQuery("select item from Projector");
		List<String> alls=qry.list();
		for(String p:alls)
		{System.out.println(p);}
		
		// select * from visions where modHr between 5000 to 8000
		qry=session.createQuery("from Projector where hours between 5000 and 8000");
		all=qry.list();
		for(Projector p:all)
		{System.out.println(p);}
		
		// select * from visions where modLums >= 200 and modPrice<=41000 
		qry=session.createQuery("from Projector where lumens >=200 and price<=41000");
		all=qry.list();
		for(Projector p:all)
		{System.out.println(p);}
		
		
		session.getTransaction().commit();
		session.close();
	}
}
