package workoutprograms;

public class maximumvalue {

	public static void main(String[] args) {

		
		int arr[] = {20,1000,50,10,1,65,750};
		
		int maxValue = arr[0];
		
		for(int i =1; i<arr.length;i++) {
			
			if(arr[i]>maxValue) {
				
				maxValue = arr[i];
			}
		}
		
		System.out.println("Maximum value is :"+maxValue);
	}

}
