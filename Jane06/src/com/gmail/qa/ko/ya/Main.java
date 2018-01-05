package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number of days in the year:");

		int days = sc.nextInt();
		if (days % 4 == 0 || days % 400 == 0) {
			System.out.println("Year high");
		} else if (days % 100 == 0) {
			System.out.println("Not a leap year");
		}else{
			System.out.println("Not a leap year");
		}
	}

}
