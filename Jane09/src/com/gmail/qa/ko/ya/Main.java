package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		System.out.println("Enter number n (4<n<16)");

		int n = sc.nextInt();
		int res = 1;
		if (n > 4 && n < 16) {
			for (int i = 1; i <= n; i++) {
				res = res * i;
			}
			System.out.println(n+"!="+res);
		} else {
			System.out.println("n must be (4<n<16)");
		}
	}
}
