package workoutprograms;

public class palindrome2 {

	public static void main(String[] args) {

		String str = "madam";
		
		String revValue = "";
		
		/*
		 * for(int i = str.length()-1; i>=0; i--) {
		 * 
		 * 
		 * revValue = revValue + str.charAt(i);
		 * 
		 * 
		 * }
		 */
		
		for (int i = 0; i<=str.length()-1; i++) {
			
			char ch = str.charAt(i);
			revValue = ch+revValue;
		}
		
		if(revValue.equals(str)) {
			System.out.println("This is a palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
		
		
	
	}

}
