package com.gmail.qa.ko.ya;
import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("¬ведите радиус");
		double r = sc.nextDouble();
		double c = 2* Math.PI* r;
		System.out.println("ќкружность круга:" +c);
	}
}
