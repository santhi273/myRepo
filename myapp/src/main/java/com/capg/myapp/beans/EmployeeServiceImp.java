package com.capg.myapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp {
	
		@Autowired
		EmployeeRepoImp repo;
	
	
		public void getService() {
			
			
			System.out.println("repo object from service "+repo);
		}

}
