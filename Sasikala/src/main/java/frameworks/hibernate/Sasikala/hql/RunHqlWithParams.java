package frameworks.hibernate.Sasikala.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunHqlWithParams 
{
	public static void main(String[] args) 
	{
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		// sql injection
		String qq="'E%'";
		Query qry=session.createQuery("from Projector where item like "+qq);
		List<Projector> all=qry.list();
		/*for(Projector p:all)
		{System.out.println(p);}*/
		
		qq=" where price between 2000 and 35000";
		qry=session.createQuery("select item from Projector"+qq);
		List<String> alls=qry.list();
		/*for(String p:alls)
		{System.out.println(p);}*/
		
		qry=session.createQuery("from Projector where proId = :id");
		qry.setInteger("id", 3);
		all=qry.list();
		/*for(Projector p:all)
		{System.out.println(p);}*/
		
		qq="hours=:own";
		qry=session.createQuery("update Projector set "+qq+" where proId=?0");
		qry.setInteger(0, 1);qry.setInteger("own", 3000);
		qry.executeUpdate();
		System.out.println("Updated");
		session.getTransaction().commit();
		session.close();
	}
}
