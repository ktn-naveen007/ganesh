package com.sample.programs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
	//	ApplicationContext context = 
		//    	  new ClassPathXmlApplicationContext(new String[] {"C:\\Users\\navin.kotamraju\\Desktop\\Ganesh\\demo\\src\\main\\java\\com\\sample\\programs\\Employee.xml"});
		    	
		Employee cust = (Employee)context.getBean("EmpBean");
		    	System.out.println(cust);
	}

}
