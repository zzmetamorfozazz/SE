package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	// level01-task02
	private static Scanner sc;
	static int floor = 9;
	static int entrance = 4;
	static int flatCount = 4;
	static int count = 0;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("What apartment number are you search?:");

		int apartment = sc.nextInt();
		for (int i = 1; i <= entrance; i += 1) {
			for (int j = 1; j <= floor; j += 1) {
				for (int x = 1; x <= flatCount; x += 1) {
					count++;
					if (count == apartment) {
						System.out.println("entrance:" + i);
						System.out.println("floor:" + j);
					}					
				}
			}
		}
		if (apartment < 1 || apartment > entrance * floor * flatCount) {
			System.out.println("There's no such apartment in the house");
		}
	}

}
