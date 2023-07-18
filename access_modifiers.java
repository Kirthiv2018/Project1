package javabasics;

public class access_modifiers {
	


	private static String str1 = "Selenium";
	public 	String str2 = "Automation";
	protected String str3 = "training";
	
	
	private static void method1() {
		
		System.out.println("This is a Private method");
	}
	
	public void method2() {
		
		System.out.println("This is a public method");
	}
	
	protected void method3() {
		
		System.out.println("This is a protected method");
	}
	
	public static void main(String[] args) {

	
		method1();
		System.out.println(str1);
		 
	
	
	}

}
