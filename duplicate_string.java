package workoutprograms;

import java.util.Set;
import java.util.TreeSet;

public class duplicate_string {

	public static void main(String[] args) {

		String strArr[] = {"Shiva","Linga","Muruga","Shiva","Shakthi","Linga"};
		
		Set<String> setStringOBj = new TreeSet<String>();
		
		for(int i=0;i<strArr.length;i++) {
			if(setStringOBj.add(strArr[i])==false) {
				System.out.println("It is a duplicate: "+strArr[i]);
			}
		}
		
	}

}
