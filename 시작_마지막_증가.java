import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 값: ");
		int start = sc.nextInt();
		System.out.print("마지막 값: ");
		int last = sc.nextInt();
		System.out.print("증가값: ");
		int value = sc.nextInt();
		
		int sum = 0;
		for(int i = start; i<=last; i+=value) {
			// i+=value -> i에 value만큼 증가
			System.out.println("i: "+i);
			sum = sum + i;
		} System.out.println("sum: "+sum);
	}

}
