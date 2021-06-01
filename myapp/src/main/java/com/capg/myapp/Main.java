package com.capg.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.capg.myapp.beans.Employee;
import com.capg.myapp.beans.EmployeeRepoImp;
import com.capg.myapp.beans.EmployeeServiceImp;

@ComponentScan("com.capg.myapp.beans")
public class Main {

	public static void main(String[] args) {


	ApplicationContext context =	new	AnnotationConfigApplicationContext(Main.class);
	
				Employee emp =	context.getBean(Employee.class);
		
						emp.setEid(101);
						emp.setEname("shanti");
						emp.setSalary(50000);
				
					System.out.println(emp);
					System.out.println(emp.getAddr());
					
					System.out.println(emp.getEname());
					
				EmployeeServiceImp service = context.getBean(EmployeeServiceImp.class);

	
					System.out.println(service);
				
					service.getService();
					
					
			EmployeeRepoImp repo =(EmployeeRepoImp)	context.getBean("repo");
					
					System.out.println(repo);
					
					repo.getRepo();
					
					
	
	}

}
