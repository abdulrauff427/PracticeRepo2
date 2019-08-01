package Cucumber.Automation;

public class removeunwantedchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="$(*&)Hello34567890world";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
