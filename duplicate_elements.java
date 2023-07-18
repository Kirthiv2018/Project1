package workoutprograms;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class duplicate_elements {

	public static void main(String[] args) {

		int arr[] = {1,2,3,3,4,5};
		
		
		Set<Integer> setObj = new TreeSet<Integer>();
//		setObj.add(1);
//		setObj.add(3);
//		setObj.add(3);
//		setObj.add(4);
//		setObj.add(5);
		
		for(int i=0;i<arr.length;i++) {
			if(setObj.add(arr[i])){
				//System.out.println("Not a duplicate: "+arr[i]);
			}
			else {
				System.out.println("This is a duplicate: "+arr[i]);
			}
		}
		/*
		 * Iterator<Integer> iter = setObj.iterator(); while(iter.hasNext()) {
		 * System.out.println(iter.next()); }
		 * 
		 */
		
	}

}
