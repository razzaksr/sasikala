package frameworks.hibernate.Sasikala.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestInher 
{
	public static void main(String[] args) 
	{
		HRM hr=new HRM("Vinothini", "Adyar, Chennai");
		
		Project pro=new Project();pro.setName("Richard");pro.setAddress("Avadi, Chennai");
		pro.setClient("BirlaSoft");pro.setWeeks(20);
		
		Cab cab=new Cab();cab.setName("Mani");cab.setAddress("Poonamalli");cab.setPeople(5);
		cab.setDestination("Thiruvallur");
		
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		
		session.save(hr);session.save(pro);session.save(cab);
		
		session.getTransaction().commit();
		session.close();
	}
}
