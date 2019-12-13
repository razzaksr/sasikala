package frameworks.hibernate.Sasikala.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCrud 
{
	public static void main(String[] args) 
	{
		//Projector p1=new Projector("BenQ LED", 31700.5, 300, 8000);// transient
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		
		//session.save(p1);// persist
		Projector temp=(Projector)session.get(Projector.class, 3);//read
		System.out.println(temp);
		
		temp.setHours(5000);//session.update(temp);// update
		
		session.delete(session.get(Projector.class, 4));// delete
		
		session.getTransaction().commit();
		session.close();
	}
}
