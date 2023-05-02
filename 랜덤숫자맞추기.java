import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		
		int ran = rd.nextInt(49)+1; // 1부터 50까지 범위 설정
		System.out.print("숫자를 맞춰보세요!: ");
		int cnt = 0; // 횟수 저장
		
		while (true) {
			int dom = scan.nextInt(); // 랜덤 숫자 입력하기
			cnt++; // 입력할 때마다 횟수 카운트
		
			// 랜덤 숫자와 입력 숫자 비교
			if (ran > dom) {
				System.out.println("UP");
			} else if (ran < dom) {
				System.out.println("DOWN");
			} else if (ran == dom) {
				System.out.println("정답!");
				System.out.println(cnt + "번 만에 맞췄습니다");
				break;
			} else {
				System.out.println("숫자만 입력해주세요");
			}
		}
		
	}

}
