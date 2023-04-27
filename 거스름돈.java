import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int[] coins = {500, 100, 50, 10};
		for (int i = 0; i < coins.length; i++) {
			System.out.println(coins[i] + "원 짜리" + (money / coins[i])+"개");
			money = money % coins[i]; //큰 단위로 먼저 나눈 후 남는 걸 다시 나누기
		}
	}
}
