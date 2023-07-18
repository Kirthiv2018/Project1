package workoutprograms;

public class strings {

	public static void main(String[] args) {

		String str = new String("hello");
		str.toUpperCase();
		str.concat("world");
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println("String Buffer:"+sb);
	}

}
