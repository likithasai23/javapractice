package com.epsilon.Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/Project/config.xml");
    	 Order order = (Order)ctx.getBean("order");
    	 
    	 System.out.println(order);
    }
}
