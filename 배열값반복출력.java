import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] arr = new int [5]; // arr라는 배열 안에 5개의 칸 생성
		int i = 0;
		while(i < 5) { // i가 4가 될 때까지 반복
			System.out.print("값을 입력하세요: ");
			arr [i] = scan.nextInt(); // 배열에 입력 값 저장
			i++;
		}
		for (int j = 0; j < 5; j++) { 
			System.out.println(arr[j]);
		}
	}

}
