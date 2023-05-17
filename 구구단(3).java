import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
    // 입력한 단까지 구구단 출력
    
		System.out.print("몇단?: ");
		int a = sc.nextInt();
		System.out.print("몇곱?: ");
		int b = sc.nextInt();
		
		for (int i = 2; i<=a; i++) { // 구구단은 2단부터이기에 i=2
			for (int j = 1; j<=b; j++) {
				System.out.println(i + " * "+ j+" = "+(i*j));
			}
      System.out.println(); // 구구단 사이에 공백 구분
		}
		
	}

}
