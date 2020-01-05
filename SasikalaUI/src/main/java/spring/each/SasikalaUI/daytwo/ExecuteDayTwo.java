package spring.each.SasikalaUI.daytwo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class ExecuteDayTwo 
{
	public static void main(String[] args) 
	{
		//BeanFactory context=new XmlBeanFactory(new FileSystemResource("daytwo.xml"));
		/*District d=(District)context.getBean("dt1");
		System.out.println(d);
		d=(District)context.getBean("dt2");
		System.out.println(d);*/
		/*{
		Zone z=(Zone)context.getBean("zone");
		System.out.println(z);
		z=(Zone)context.getBean("zone2");
		System.out.println(z);
		}*/
		BeanFactory context=new XmlBeanFactory(new FileSystemResource("daytwo2.xml"));
		//ApplicationContext context=new ClassPathXmlApplicationContext("src/main/resources/daytwo2");
		/*Demands d=(Demands)context.getBean("dm1");
		System.out.println(d);
		d=(Demands)context.getBean("dm2");
		System.out.println(d);
		d=(Demands)context.getBean("dm3");
		System.out.println(d);
		d=(Demands)context.getBean("dm4");
		System.out.println(d);*/
		
		Corporation c=(Corporation)context.getBean("corp");
		System.out.println(c);
	}
}
