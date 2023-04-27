package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// 구구단 - 몇단 입력했을 때 '몇단'만 출력하지 말고 2단부터 몇단까지 출력
		System.out.print("단 입력하기: ");
		int a = scan.nextInt();
		System.out.println("곱할 수 입력하기: ");
		int b = scan.nextInt();
		for (int i = 2; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
	}

}
