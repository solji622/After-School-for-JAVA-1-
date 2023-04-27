import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("라면 끓이기!");
		System.out.println("가스레인지 앞에 섰다.");
		System.out.println("[1. 불을 킨다.]   [2. 귀찮다, 생라면 먹자]");
		
		int 면 = sc.nextInt();
		
		if (면 == 1) {
			System.out.println("불이 켜집니다. 틱틱틱");
			System.out.println("물이 끓네요! 보글보글");
			System.out.println("[1. 스프, 면을 넣는다.]  [2. 귀찮다. 편의점 가야겠다.]");
			int 면2 = sc.nextInt();
			if (면2 == 1) {
				System.out.println("면과 스프를 넣고 2분 더 끓였다");
				System.out.println("라면이 완성됐다. 맛있게 먹어야지!!!!!!!");
			} else if(면2 == 2) {
				System.out.println("불을 끄고 편의점에 간다.");
			} else {
				System.out.println("잘못 입력했습니다. 게임 끝!");
			}
		} else if (면 == 2) {
			System.out.println("생라면 먹방");
		} else {
			System.out.println("잘못 입력했습니다. 게임 끝!");
		}
		
		
		
	}

}
