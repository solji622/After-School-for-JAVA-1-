package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1부터 입력한 숫자 중 2의 배수 또는 3의 배수가 아니면 더하는 프로그램
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0 || i % 3 != 0) {
				System.out.println("현재 i: "+i);
				sum += i;
				System.out.println(sum);
			}
		}
	}

}
