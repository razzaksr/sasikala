package spring.each.SasikalaUI.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExecuteData2 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new FileSystemXmlApplicationContext("data-jdbc2.xml");
		NamedStyle named=(NamedStyle)context.getBean("namedStyle");
		//System.out.println(named.getByRange(40000, 90000));
		System.out.println(named.getByPhrase("avenger150"));
	}
}
