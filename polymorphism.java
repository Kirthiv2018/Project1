package javabasics;

public class polymorphism {

	
	public static void overload(String str) {
		
		System.out.println(str);
		
		
	}
	
	public static void overload(int ...num) {
		
		System.out.println(num[1]);
	}
	
	public static void overload(int num, String str, long l) {
		
		System.out.println(num);
		System.out.println(str);
		System.out.println(l);
	}
	
	
	public static void main(String[] args) {
		
		overload("My first overloaded method");
		overload(100,200,300);
		overload(500, "Overloaded method with three parameters", 50000);
		
		
	}

}
