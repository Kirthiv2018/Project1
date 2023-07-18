package workoutprograms;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String str1 = "knee";
		String str2 = "keen";
		
		boolean returnValue = false;
		
		if(str1.length()==str2.length()) {
			
			char [] charArrStr1 = str1.toCharArray();
			char [] charArrStr2 = str2.toCharArray();
			System.out.println(charArrStr1);
			System.out.println(charArrStr2);
			Arrays.sort(charArrStr1);
			Arrays.sort(charArrStr2);
			
			returnValue = Arrays.equals(charArrStr1,charArrStr2);

			if(returnValue) {
				System.out.println("It is a anagram");
			}
			else {
				
				System.out.println("It is not a anagram");
			}
			
		}
	}

}
