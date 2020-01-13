package spring.each.SasikalaUI.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Interacts 
{
	@Before("execution(public String spring.each.SasikalaUI.aop.WaterBottle.toString())")
	public void sample()
	{System.out.println("Sample log called");}
	
	@Before("execution(public String spring.each.SasikalaUI.aop.Retail.toString())")
	public void simple()
	{System.out.println("Message invoked while Retail operation");}
	
	@After("myOwn()")
	public void demoMyOwn() {System.out.println("Whenever individual request raised");}
	
	@Pointcut("within(spring.each.SasikalaUI.aop.WaterBottle) && execution(public int get*())")
	public void myOwn(){}
	
	@After("execution(public WaterBottle get*())")
	public void msgTails(JoinPoint point)
	{System.out.println("Retail get Operations "+point.toString());}
	
	@After("args(params)")
	public void assigning(Object params)
	{System.out.println("Assigned value is: "+params);}
	
	@After("args(params) && within(spring.each.SasikalaUI.aop.WaterBottle)")
	public void assigningOne(Object params)
	{System.out.println("Assigned value to the water bottles are: "+params);}
	
	@Around("execution(public String getEligibility())")
	public Object passThrough(ProceedingJoinPoint join)
	{
		Object hai=null;
		try {
			System.out.println("Around Called before read: "+join.toString());
			hai=(Object)join.proceed();
			System.out.println("Around Called After read: "+join.toString());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hai;
	}
	
	@After("@annotation(Sasikala)")
	public void userDefined()
	{System.out.println("Custom annoation is used here");}
	
	/*@AfterReturning(value="args(params)",returning="back")
	public void backSome(Object params,Object back)
	{System.out.println(params+" What actually returned: "+back);}*/
}