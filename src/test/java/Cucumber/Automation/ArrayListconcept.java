package Cucumber.Automation;

import java.util.*;

import Cucumber.Automation.Employee;

public class ArrayListconcept {

	

	
	
	public static void main(String[] args) {

		Employee e1 = new Employee("abdul",23,"QA");
		Employee e2 = new Employee("abdul1",24,"QA1");
		Employee e3 = new Employee("abdul2",25,"QA2");

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		
		
		Iterator<Employee> emp =ar4.iterator();
		while(emp.hasNext())
		{
			Employee e = emp.next();
			//stem.out.println();
			
		}
		
	}

}
