package workoutprograms;

public class removespaces {

	public static void main(String[] args) {

		
		String str = "Rukmini         Kirthivasan";
		
		//String str1 [] = str.split(" ");
		//System.out.println(str1[0].toString()+str1[1]);
		String value = str.replaceAll("\\s", "");
		System.out.println(value);
	}

}
