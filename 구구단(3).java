import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력한 단까지 구구단 출력
		System.out.print("몇단?: ");
		int a = sc.nextInt();
		System.out.print("몇곱?: ");
		int b = sc.nextInt();
		System.out.println();
		
		for (int i = 2; i<=a; i++) {
			System.out.println(i+"단");
			for (int j = 1; j<=b; j++) {
				System.out.println(i + " * "+ j+" = "+(i*j));
			}
			System.out.println();
		}
		
	}

}
