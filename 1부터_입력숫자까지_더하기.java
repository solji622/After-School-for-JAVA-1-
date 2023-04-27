package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1부터 입력한 숫자까지 더하는 프로그램
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		int sum = 0;
		int i = 1;
		
		while (true) { // 조건에 true == 계속 반복
				System.out.println("현재 i는: "+i);
				sum += i;
				// sum 0 + i 1 = 1 / sum 1 + i 2 = 3 ...
				i++;
				System.out.println(sum);
			if (i > num) {
				System.out.println("끝났다");
				break;
			}
			
		}
	}

}
