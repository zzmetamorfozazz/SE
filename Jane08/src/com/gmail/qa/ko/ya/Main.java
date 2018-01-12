package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		// level01, task01
		int rows = 5;
		sc = new Scanner(System.in);

		System.out.println("Enter cols");
		int cols = sc.nextInt();

		for (int i = 0; i <= rows; i += 1) {
			for (int j = 0; j <= cols; j += 1) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println("");
		}
	}

}
