package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fac = 1;
		
		for(int i = 18; i > 0; i--) {
				fac *= i;
		}
		System.out.println(fac);
	}

}
