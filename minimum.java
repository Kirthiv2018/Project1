package workoutprograms;

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {20,10,2,1,-1,50,100,60};
		
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
				
			}
		}
		
		System.out.println("Minimum value is: "+min);
	}

}

