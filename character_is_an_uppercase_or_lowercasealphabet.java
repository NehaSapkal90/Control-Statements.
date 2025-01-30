package Control_satement;

public class character_is_an_uppercase_or_lowercasealphabet {

	public static void main(String[] args) {

		char ch = 'C';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("UpperCase");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("lowerCase");
		} else {
			System.out.println("special symbol");
		}

	}

}
