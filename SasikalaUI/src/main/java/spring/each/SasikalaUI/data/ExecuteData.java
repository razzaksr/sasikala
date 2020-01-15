package spring.each.SasikalaUI.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExecuteData 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new FileSystemXmlApplicationContext("data-jdbc.xml");
		/*AccessObject obj=(AccessObject)context.getBean("accessObject");
		//System.out.println("Status of table creation: "+obj.createTable());
		System.out.println("Status of insertion: "+obj.adding(new Watch("Apple hitech","iOS",true,false,12300)));*/
		TemplateStyle temp=(TemplateStyle)context.getBean("templateStyle");
		//System.out.println(temp.insertion(new Watch("MiWrist5","Android",false,true,7899)));;
		/*System.out.println("No of Watches: "+temp.stocks());
		System.out.println("Price is: "+temp.getPrice("MiWrist5"));
		System.out.println("Model is: "+temp.getModel(1));*/
		//System.out.println(temp.getOne(1));
		System.out.println(temp.getAll());
	}
}
