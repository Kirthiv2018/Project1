package workoutprograms;

public class binary_search {

	public static void main(String[] args) {
		
		int arr [] = {1,3,40,30,2,70,400};
		
		boolean flag = false;
		int l = 0;
		int h = arr.length-1;
		int key = 400;
		while(l<=h) {
			
			
			int median = (l+h)/2;
			
			if(arr[median]<key) {
				
				l = median+1;
				
			}
			
			if(arr[median]>key) {
				l = median-1;
			}
			
			if(arr[median]==key) {
				System.out.println("Element found");
				flag=true;
				break;
			}
			
		}
		
		if(flag==false) {
			System.out.println("Element is not found");
		}
		
		
		
	}

}
