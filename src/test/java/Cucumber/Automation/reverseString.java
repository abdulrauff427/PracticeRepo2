package Cucumber.Automation;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. First method to reverse 
		String s = "abdul rauff";
		int len = s.length();
		System.out.println("length of string is "+len);
		String rev = "";
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println("reversed String is " +rev);
		
		
		//2. Second method is to use StringBuffer
		StringBuffer sb = new StringBuffer(s);
		System.out.println("String buffer reverse " +sb.reverse());
		
		//3. Third method using String Builder
		StringBuilder sbu = new StringBuilder(s);
		System.out.println("String Builder reverse" +sbu.reverse());
	}

}
