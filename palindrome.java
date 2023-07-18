package workoutprograms;

public class palindrome {

	public static void main(String[] args) {

		String str = "madam";
		int i = 0;
		int j = str.length()-1;
		boolean flag = false;
		
		while(i<j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				flag =false;
			}
			else
			{
				flag=true;
			}
			i++;
			j--;
			
		}
		if(flag)
			System.out.println("This is a palindrome");
		else
			System.out.println("This is not a palindrome");
		
		StringBuffer sb = new StringBuffer(str);
		String str2 = sb.reverse().toString();
		if(str.equals(str2)) {
			System.out.println("This is a Palindrome, identified using Reverse method");
		}else {
			System.out.println("This is not a Palindrome, identified using Reverse method");
		}
		
	
	}

}
