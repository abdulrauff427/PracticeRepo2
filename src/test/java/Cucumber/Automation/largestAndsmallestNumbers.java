package Cucumber.Automation;

import java.util.Arrays;

public class largestAndsmallestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[] = {-10,-999,-50,10,30,3333};
       
       int smallest = num[0];
       int largest = num[0];
       
       for (int i=1;i<num.length;i++)
       {
    	   if(num[i]>largest)
    	   {
    		   largest = num[i];
    	   }
    	   else if(num[i]<smallest)
    	   {
    		   smallest = num[i];
    	   }
       }
       System.out.println("Numbers in the array are :" +Arrays.toString(num));
       System.out.println("Largest number is "+largest);
       System.out.println("Smallest numbre is "+smallest);
	}

}
