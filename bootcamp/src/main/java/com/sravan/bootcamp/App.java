package com.sravan.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.ast.MethodReference;

public class App 
{
	static void info()
	{
		System.out.println("Flat 30% Cashback on Taj hotels");
	}
	public static void main( String[] args )
    {
	    ApplicationContext context=new ClassPathXmlApplicationContext("com/sravan/bootcamp/xml/spring.xml");	
	    Restaurant obj=(Restaurant)context.getBean("cafes");
	    
	    // Dealer obj=(Dealer)context.getBean("dealer");
	    
	    obj.motto();
	    
	    
	    // LAMBDA EXPRESSIONS
	    Hotels hotel;
	    hotel=()->{
	    	System.out.println("Enjoy your dreams with Saint hotel");
	    };
	 
	    hotel.notice();
    }
    
   
}
