package Control_Statement_2;

public class Count_Digits_in_a_Number_Using_a_While_Loop {

	public static void main(String[] args) {
		int num=24;

		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);

	}

}
