package com.capg.myapp.beans;

import org.springframework.stereotype.Repository;

@Repository(value="repo")
public class EmployeeRepoImp {
	
		public void getRepo() {
			
			System.out.println("repo method is  called..");
			
		}
	

}
