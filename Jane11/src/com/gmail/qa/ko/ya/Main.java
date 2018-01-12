package com.gmail.qa.ko.ya;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	static int w;
	static int h;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter weight");
		w = sc.nextInt();
		System.out.println("Enter height");
		h = sc.nextInt();		
		for (int i = 0; i <= h; i += 1){
			for (int j = 0; j <= w; j += 1){
				if (i==0||i==h){
					System.out.print("*");
				} else if (j == 0 || j == w) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
