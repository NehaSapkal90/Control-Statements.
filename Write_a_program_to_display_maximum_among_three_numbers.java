package Control_satement;

public class Write_a_program_to_display_maximum_among_three_numbers {

	public static void main(String[] args) {

		int num1 = 21;
		int num2 = 10;
		int num3 = 13;

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is: " + num2);
		} else {
			System.out.println("num3 is: " + num2);
		}

	}

}
