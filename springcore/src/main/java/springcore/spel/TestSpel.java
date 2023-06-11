package springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {
	
	
	
	
	public static void main(String args[])
	{
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcore/spel/spelconfig.xml");
		
	    Demo demo = (Demo)context.getBean("demo");
	    
	    Demo demo2 = (Demo)context.getBean("demo");
	    System.out.println(demo);
		
	    System.out.println(demo.hashCode());
	    System.out.println(demo2.hashCode());
		
	}

}
