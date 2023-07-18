package workoutprograms;

public class missingnumberinarray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,8};
		int sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
	
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1;j<=5;j++) {
			sum1 = sum1+j;
		}
		
		System.out.println(sum1);
		
		System.out.println("Missing number is: "+(sum-sum1));
	}

}
