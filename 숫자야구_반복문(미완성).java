import java.util.Random;
import java.util.Scanner;

public class Test {
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
		
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
		
		// 숫자 3개 입력받기
		System.out.print("숫자 입력: ");
		int my = sc.nextInt();
		
		// 입력한 숫자가 4자리수이면 끝, 3자리수이면 숫자 분류
		if (my > 999) {
			System.out.println("숫자 입력 오류");
		} else {
			int one = my % 10;
			my = my / 10;
			int two = my % 10;
			my = my / 10;
			int three = my % 10;
			my = my / 10;
			
			// 스트라이크, 볼 판단
			int s = 0;
			int ball = 0;
			if (num1 == one) s++;
			if (num2 == two) s++;
			if (num3 == three) s++;
		}
		
		
	}
}
