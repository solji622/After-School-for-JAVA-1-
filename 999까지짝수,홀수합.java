package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evensum = 0;
		int oddsum = 0;
		
		for (int i = 1; i <= 999; i++) {
			if (i % 2 == 0) {
				evensum += i;
			} else if (i % 2 != 0) {
				oddsum += i;
			}
		}
		System.out.println("짝수들의 합은: "+evensum);
		System.out.println("홀수들의 합은: "+oddsum);
		
	}

}
