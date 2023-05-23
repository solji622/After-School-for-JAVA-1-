import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i<=num; i++) {
			if(i % 2 == 0) {
				even += i;
			} else if (i % 2 != 0) { // else만으로도 가능
				odd += i;
			}
		}
		System.out.println("짝수들의 합: "+even);
		System.out.println("홀수들의 합: "+odd);
	}
}
