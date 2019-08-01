package Cucumber.Automation;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		
		String names[] = {"abdul","abdus","rahman","abdul","rahman"};
		
		for (int i=0;i<names.length;i++)
			for (int j=i+1;j<names.length;j++)
			if(names[i].equals(names[j]))
			{
				System.out.println("DUplicate value is " +names[i]);
			}
		
		//2 method is to use Hashset
		Set<String> store = new HashSet<String>();
		for(String name :names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate value using HashSet is "+name);
			}
		}
	}

}
