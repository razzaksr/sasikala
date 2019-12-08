package frameworks.hibernate.Sasikala.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecuteMap 
{
	public static void main(String[] args) 
	{	
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		session.beginTransaction();
		/*//one to one
		Laptop lap=new Laptop("Dell Inspiron", "SSD", 4, 47900.9);
		Person per=new Person("Sabari","Development");per.setLaptop(lap);
		session.save(lap);session.save(per);// one to one*/
		
		/*// one to many
		Laptop l1=new Laptop("HP", "Pavilion", 4, 56700.4);
		Laptop l2=new Laptop("Sony", "Camera", 8, 76500.12);
		Person per=new Person("Sheik","Support");
		per.getMore().add(l1);per.getMore().add(l2);
		session.save(l1);session.save(l2);session.save(per);*/
		
		/*// many to one
		Laptop l1=new Laptop("Compaq", "GPU", 2, 26900.0);
		Laptop l2=new Laptop("Lenevo", "DDR4", 3, 41090.4);
		Person per=new Person("Razak","Development");l1.setPerson(per);l2.setPerson(per);
		session.save(l1);session.save(l2);session.save(per);*/
		
		Laptop l1=new Laptop("HP", "Pavilion", 4, 56700.4);
		Laptop l2=new Laptop("Sony", "Camera", 8, 76500.12);
		Person per1=new Person("Razak","Development");
		per1.getMore().add(l1);per1.getMore().add(l2);
		Person per2=new Person("Sheik","Support");
		per2.getMore().add(l1);per2.getMore().add(l2);
		l1.getExtra().add(per1);l1.getExtra().add(per2);
		l2.getExtra().add(per1);l2.getExtra().add(per2);
		
		session.save(l1);session.save(l2);session.save(per1);session.save(per2);
		
		session.getTransaction().commit();
		session.close();
	}
}
