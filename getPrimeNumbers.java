package workoutprograms;

public class getPrimeNumbers {

	public static boolean isPrimeNumber(int num) {
		boolean value = false;
		if(num<=1)
			return value;
		else {
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					return value;
				}
				else
					value = true;
			}
			return value;
			

		}
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {

		//getPrimeNumbers(100);
		int num = 100;
		for(int i=2;i<=num;i++) {
			
			if(num%i==0) {
				System.out.println(""+i);
			}
		}
		
	}

}
