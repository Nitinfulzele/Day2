
public class ReverseNumberWhile {
	
	public static void main(String[] agrs) {
		int number = 231, reverse = 0;
		
		System.out.println("Input: " +number);
		
		while(number !=0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			
			number /=10;
		}
		System.out.println("Reverse Number:" + reverse);
		
	}

}
