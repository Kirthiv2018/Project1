package workoutprograms;

public class fibonacciseries {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int counter = 0;
		
		while(counter<20) {

			System.out.println(num1 +" ");

			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;

			counter++;



		}
		
	}

}
