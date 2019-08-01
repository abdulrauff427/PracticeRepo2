package Cucumber.Automation;

public class stringManipulation {

	public static void main(String[] args) {
		String str = "Hi i am abdul from hyderabad";
		
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("a", 6));
		System.out.println(str.indexOf("a", str.indexOf("a")+1));
		System.out.println(str.indexOf("a", str.indexOf("a", str.indexOf("a")+1)+1));
		System.out.println(str.indexOf("a", str.indexOf("a", str.indexOf("a", str.indexOf("a")+1)+1)+1));
	}

}
