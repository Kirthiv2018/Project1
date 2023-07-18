package workoutprograms;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {

		
		int arr[] = {1,3,5,20,6,200,30};
		
		
		for(int i=0; i<=arr.length-1; i++) {
			
			for(int j=i+1; j<=arr.length-1; j++) {
				
				
				if(arr[i]>arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		System.out.println(" "+Arrays.toString(arr));
		
	}

}
