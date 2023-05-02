import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] arr = new int [5]; // arr라는 배열 안에 5개의 칸 생성
		int i = 0;
		while(i < arr.length) { // arr.length 로 입력하면 배열 범위가 바뀌어도 자동으로 
			System.out.print("값을 입력하세요: ");
			arr [i] = scan.nextInt(); // 배열에 입력 값 저장
			i++;
		}
		for (int j = 0; j < arr.length; j++) { 
			System.out.println(arr[j]);
		}
	}

}
