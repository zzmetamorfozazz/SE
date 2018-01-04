package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);

		System.out.println("input a");
		int a = sc.nextInt();

		System.out.println("input b");
		int b = sc.nextInt();

		System.out.println("input c");
		int c = sc.nextInt();

		System.out.println("input d");
		int d = sc.nextInt();

		int max = d;
		
		if (a > max) {
			max = a;
		}
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("Max = " + max);
	}

}
