package Control_satement;

public class Leap_year_or_not {

	public static void main(String[] args) {

		int year = 2000;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not leap year");
		}

	}

}
