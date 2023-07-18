package workoutprograms;

public class findduplicateelements {

	public static void main(String[] args) {

		int arrValue[] = {2,4,6,8,2,4};
		
		
		
	
		for(int i=0; i<arrValue.length;i++) {
			
			
			for(int j=i+1; j<arrValue.length; j++) {
				if(arrValue[i]==arrValue[j]) {
					System.out.println(arrValue[i]+"");
				}
				
				
			}
		}
		
		
		
	}

}
