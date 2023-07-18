package workoutprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class anagramusinglist {

	public static void main(String[] args) {

		String str1 = "keen";
		String str2 = "life";
		
		List<Character> listObj1 = new ArrayList<Character>();
		for(int i=0; i<str1.length();i++) {
			listObj1.add(str1.charAt(i));
		}
		
		Collections.sort(listObj1);
		
		List<Character> listObj2 = new ArrayList<Character>();
		for(int i=0; i<str2.length(); i++) {
			
			listObj2.add(str2.charAt(i));
		}
		
		Collections.sort(listObj2);
		
		if(listObj1.equals(listObj2)) {
			System.out.println("It is anagram");
		}else {
			System.out.println("It is not an anagram");
		}
	}
	

}
