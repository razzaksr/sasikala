package spring.each.SasikalaUI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory context=new XmlBeanFactory(new FileSystemResource("dayone.xml"));
        //ApplicationContext context=new ClassPathXmlApplicationContext("dayone");
        Assembly a=(Assembly)context.getBean("as1");
        System.out.println(a);
        a=(Assembly)context.getBean("as2");
        System.out.println(a);
        a=(Assembly)context.getBean("as3");
        System.out.println(a);
        a=(Assembly)context.getBean("as4");
        System.out.println(a);
        a=(Assembly)context.getBean("as5");
        System.out.println(a);
        a=(Assembly)context.getBean("as6");
        System.out.println(a);
    }
}
