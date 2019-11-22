package basic.dayone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Hibernate1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Hibernate1Application.class, args);
		Manage m=(Manage)context.getBean("manage");
		m.add();
	}

}
