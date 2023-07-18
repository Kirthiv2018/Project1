package workoutprograms;


public class stringreverse {

	public static void main(String[] args) {

		String str = "Kirthi", newStr = "";
		
		
		/*
		 * for(int i=0; i<str.length();i++) { ch = str.charAt(i); newStr = ch+newStr;
		 * 
		 * }
		 */		
		for(int i=str.length()-1;i>=0;i--) {
			newStr = newStr+str.charAt(i);
		
		}
		System.out.println("My approach: "+newStr);
		
	}

}
