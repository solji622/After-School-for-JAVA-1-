import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 크기: ");
		int empty = scan.nextInt();
		int [] arr = new int [empty];
		
		// 배열에 값 넣기
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열의 값 입력: ");
			arr[i] = scan.nextInt();
		}
		
		
		// 배열 값 정렬 전 출력
		System.out.print("정렬 전: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]); // 공백 더하기 -> 배열 값 사이에 공백 출력
		}
		System.out.println();
		
		
		// [정렬하기] 1) 가장 작은 값 찾고 맨 앞으로 정렬 -> 배열 돌며 비교
		int min; // for 문 밖에서 변수 선언
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) { // i와 비교해야하므로 i+1
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			
			// [정렬하기] 2) 교환 작업
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
			// [정렬하기] 3) 배열 값 정렬 후 출력
			System.out.print("정렬 후: ");
			for (int k = 0; k < arr.length; k++) {
				System.out.print(" "+arr[k]); // 공백 더하기 -> 배열 값 사이에 공백 출력
			}
			System.out.println();
		}
		
	}
}
