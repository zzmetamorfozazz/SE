package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("input a");
		int a = sc.nextInt();

		System.out.println("input b");
		int b = sc.nextInt();

		System.out.println("input c");
		int c = sc.nextInt();

		if (a + b > c || b + c > a || c + a > b) {
			System.out.println("triangle exist");
		} else {
			System.out.println("triangle doesn't exist");
		}

	}

}
