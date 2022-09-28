import java.util.Scanner;
public class DisplayUnitTenHundred {
	
	public static void main (String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter powers of ten");
		num=sc.nextInt();
		
		if (num == 1) {
			System.out.println("one");
		}
		else if(num == 10) {
			System.out.println("ten");
			
		}
		else if (num == 100) {
			System.out.println("hundred");
		}
		else if (num == 1000) {
			System.out.println("thousand");
		}
		else if (num == 10000) {
			System.out.println("ten thousand");
		}
		else {
			System.out.println("return");
			
		}
		
	}

}
