package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 입력 -> 1의 자리부터 차레대로 출력하기
		System.out.print("숫자 입력하기: ");
		
		int num1 = scan.nextInt();
		// 반복문 없이
		System.out.println(num1 % 10); // num1 = 6
		num1 = num1 / 10; // num1 = 12345 -> 6 버리기
		System.out.println(num1 % 10); // 버리고 남은 숫자로 다시 계산
		
		
		
		// 반복문 - for
		for (int num = scan.nextInt(); num > 0; num /= 10) {
			// 입력받기; num 이 0보다 클 때만 반복; num / 10
			// 초기값 띄어쓰기 한번 ; == 초기값 생략, 증감값 그냥 생략
			System.out.println(num % 10);
		}
		
	}

}
