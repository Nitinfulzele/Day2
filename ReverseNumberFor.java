
public class ReverseNumberFor {
	
	public static void main(String [] args) {
		int num=231, reverse = 0;
		
		System.out.println("Input: " +num);
		
		for(;num !=0;) {
			
			int remainder=num % 10;
			
			reverse=reverse *10 + remainder;
			
			num=num/10;
		}
		
		System.out.println("Reverse number: " +reverse);
	}

}
