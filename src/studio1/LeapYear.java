package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int i0 = in.nextInt();
		
		boolean divisableBy4 = i0 % 4 == 0;
		boolean notDivisableBy100 = i0 % 100 != 0;
		boolean divisableBy400 = i0 % 400 == 0;
		
		boolean result = (divisableBy4 && notDivisableBy100) || divisableBy400;
		System.out.println(i0 + " is a leap year: " + result);

	}

}
