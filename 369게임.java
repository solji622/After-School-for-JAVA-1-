import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 369 게임 33,36,39는 짝짝 출력
		
		int num;
		int clap = 0;
		System.out.print("숫자 입력: ");
		int last = sc.nextInt();
		
		for(int i = 1; i<=last; i++) {
			num = i;
			
			while(true) {
				if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
					System.out.println(i +": 짝");
					clap++; // clap == clap += 1
				}
				num = num / 10;
				if(num == 0) {
					break;
				}
			}
		}
		System.out.println("1부터 " + last + "까지의 총 박수: "+clap);
	}

}
