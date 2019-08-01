package Cucumber.Automation;

public class reverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     long num = 123456;
		
		
		  long rev =0;
		  
		  while(num!=0) {
		  
		  
		  rev = rev*10+num%10; 
		  num = num/10;
		  
		  } 
		  System.out.println(rev);
		  
		 
     
     //2. Using String buffer
		
		  long num1 = 1234567890;
		  StringBuffer buff = new StringBuffer(String.valueOf(num1));
		  System.out.println(buff.reverse());
		 

}
}
