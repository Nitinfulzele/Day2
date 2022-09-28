
public class VowelOrConsonantSwitch {
	
	public static void main() {

		char ch = 'Z';

		switch (ch) {

		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + "is Vowel");
			break;
			
			default:
			System.out.println(ch + "is Consonant");
		}

	}

}
