package com.gmail.qa.ko.ya;
import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		int firstNumb = num / 10000;
		int secondNumb = num % 10000 / 1000;
		int thirdNumb = num % 10000 % 1000 / 100;
		int fourthNumb = num % 10000 % 1000 % 100 / 10;
		int fifthNumb = num % 10000 % 1000 % 100 % 10 / 1;
		System.out.println(firstNumb);
		System.out.println(secondNumb);
		System.out.println(thirdNumb);
		System.out.println(fourthNumb);
		System.out.println(fifthNumb);
	}
}
