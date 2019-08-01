package Cucumber.Automation;

public class swap2Numbers {

	public static void main(String[] args) {

int x = 5;
int y =10;
		
		  int t;
		  
		  
		  t=x; x=y; y=t;
		  
		  System.out.println(x); System.out.println(y);
		  
		  
		  //2nd method using + operator
		  
		  x=x+y; y=x-y; x=x-y;
		  
		  
		  
		  //3rd way is to use * and / by operator
		  
		  x=x*y; y=x/y; x = x/y;
		 


//4th using XOR operator
x=x^y;
y=x^y;
x=x^y;

System.out.println("x ="+x);
System.out.println("y ="+y);


	}

}
