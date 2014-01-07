package DataExtraction;

public class testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s= "My name is abs";
		System.out.println(s);
		
		String a=s.replaceAll(" ", "+");
		System.out.println(a);
		
		String str = "Her name is Tamana and Tamana is a good girl.";
	   // String strreplace = "Sonia";
	    String result = str.replaceAll("Tamana", "abc");
	    System.out.println(result);
	}

}
