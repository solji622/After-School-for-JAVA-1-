package test;

import java.util.Random;
import java.util.Scanner;

public class TEst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 3개 랜덤으로 뽑기
		Random rd = new Random();
		
		int num1 = rd.nextInt(9)+1; // 0~8 -> 1~9
		int num2 = rd.nextInt(9)+1;
		int num3 = rd.nextInt(9)+1;
		
		// 숫자끼리 겹칠 경우 다시 뽑기
		while (num1 == num2 || num2 == num3 || num3 == num1) {
			num1 = rd.nextInt(9)+1;
			num2 = rd.nextInt(9)+1;
			num3 = rd.nextInt(9)+1;
		}

		int cnt = 0;
		
		while(true) {
		// 숫자 3개 입력받기
		System.out.print("숫자 입력: ");
		int my = sc.nextInt();
		cnt++;
				
		// 입력한 숫자가 4자리수이면 종료, 3자리수이면 숫자 한자리씩 추출
		if (my > 999) {
			System.out.println("숫자 입력 오류");
		} else {
			int three = my % 10;
			my = my / 10;
			int two = my % 10;
			my = my / 10;
			int one = my % 10;
			
			int strike = 0;
			int ball = 0;
			
			// 스트라이크, 볼 판단
			if (num3 == three) strike++;
      if (num2 == two) strike++;
      if (num1 == one) strike++;
      
      if(one == num2 || one == num3) ball++;
      if(two == num1 || two == num3) ball++;
      if(three == num1 || three == num2) ball++;
			
			System.out.println("스트라이크: "+strike);
			System.out.println("볼: "+ball);
			
			if (strike == 3) {
				System.out.println("----------------");
				System.out.println(cnt + "번 만에 맞췄습니다");
				break;
			}
			
			}
		}
	}

}
