package spring.each.SasikalaUI.daythree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAnnots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new FileSystemXmlApplicationContext("daythree.xml");
		Supreme s=(Supreme)context.getBean("supreme");
		HeadSet temp=(HeadSet)context.getBean("headSet");
		temp.setModel("iBall");temp.setFeature("Wifi");temp.setPrice(3000);
		s.setHead3(temp);
		System.out.println(s);
	}

}
