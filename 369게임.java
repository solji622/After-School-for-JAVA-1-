import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 369 게임 33,36,39는 짝짝 출력
		
		int num = sc.nextInt();
		int clap = 0;
		
		while(true) {
			if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.println(num +": 짝");
				clap++;
			}
			num = num / 10;
			if(num == 0) {
				break;
			}
		}
	}
}
