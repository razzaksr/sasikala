package frameworks.hibernate.Sasikala.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestScope 
{
	public static void main(String[] args) 
	{
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		
		Projector temp=(Projector)session.get(Projector.class, 3);//read
		System.out.println(temp);
		
		//temp.setHours(12000);
				
		session.getTransaction().commit();
		session.close();
		
		temp.setPrice(40900.7);// detached
		
		session=fact.openSession();
		session.beginTransaction();
		session.update(temp);// persist
		session.getTransaction().commit();session.close();
	}
}
