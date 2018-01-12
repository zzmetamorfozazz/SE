package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + "*" + i + "=" + i * a);
		}
	}

}
