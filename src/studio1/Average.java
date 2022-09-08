package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("The first of two integers to be averaged?: ");
		int i0 = in.nextInt();
		System.out.print("The second of two integers to be averaged?: ");
		int i1 = in.nextInt();
		
		double averaged = (i0 + i1) / 2.0;
		System.out.println("Average of " + i0 + " and " + i1 + " is " + averaged + ".");
	}

}
