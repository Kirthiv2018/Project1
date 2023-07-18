package workoutprograms;

public class practice {

	public static void main(String[] args) {
/*		int arrValues[] = {1,3,5,7,7,9,10};
		
		
		for(int i=0;i<arrValues.length;i++) {
			for(int j=i+1;j<arrValues.length;j++) {

				if(arrValues[i]!=arrValues[j]) {
					break;
				}
				else {
					System.out.println(" "+arrValues[i]);
				}
			}
		}*/
		
		String arrValues[] = {"Shiva","Linga","Shiva","Shakti","Muruga","Linga"};
		for (int i=0;i<arrValues.length;i++) {
			
			for(int j=i+1;j<arrValues.length;j++) {
				
				if(arrValues[i].compareTo(arrValues[j])==-1) {
					break;
				}
				else {
					System.out.println(""+arrValues[i]);
				}
			}
		}
		
		
	}

}
