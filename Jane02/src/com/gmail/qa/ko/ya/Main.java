package com.gmail.qa.ko.ya;
import java.util.Scanner;
public class Main 
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("������� ������� �");
		double a = sc.nextDouble();
		System.out.println("������� ������� B");
		double b = sc.nextDouble();
		System.out.println("������� ������� C");
		double c = sc.nextDouble();
		double p = (a + b + c) / 2;
		double x = p * ((p - a) * (p - b) * (p - c));
		double s = Math.sqrt(x);
		System.out.println("S ������������:" + s);
	}
}
