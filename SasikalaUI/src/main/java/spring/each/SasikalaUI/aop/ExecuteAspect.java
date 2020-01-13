package spring.each.SasikalaUI.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExecuteAspect 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new FileSystemXmlApplicationContext("aspects.xml");
		/*Retail r=(Retail)context.getBean("retail");
		//System.out.println(r);
		System.out.println(r.getBottleA().getBrand()+" "+
		r.getBottleA().getCapacity()+" "+r.getBottleA().getPrice());
		System.out.println(r.getBottleB().getPrice());
		r.setBottleA((WaterBottle)context.getBean("bottleC"));
		r.getBottleB().setCapacity(5000);
		System.out.println(r);*/
		TnPsc t=(TnPsc)context.getBean("tnPsc");
		System.out.println(t.getPost1().getEligibility()+" "+
		t.getPost1().getIncome()+" "+t.getPost1().getName());
		
		System.out.println(t.getPost2().getIncome());
	}
}
