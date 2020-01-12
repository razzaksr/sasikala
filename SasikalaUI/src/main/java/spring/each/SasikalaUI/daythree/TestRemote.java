package spring.each.SasikalaUI.daythree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new FileSystemXmlApplicationContext("daythree.xml");
		Manipulation s=(Manipulation)context.getBean("san");
		s.listAll();
		HeadSet temp=(HeadSet)context.getBean("h4");
		s.update(1,temp);s.listAll();
		Object obj=s.erase();
		System.out.println("Removed object is: "+obj);
		System.out.println("Status of presence: "+s.findOne(obj));
		s=(Manipulation)context.getBean("emp");
		s.listAll();s.update(3, "Mohamed");s.listAll();s.erase();
		s.erase(2);s.listAll();
	}
}
