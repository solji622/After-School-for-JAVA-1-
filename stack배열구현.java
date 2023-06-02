package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [3]; // 스택 상자
		int index = 0; // 인덱스 == 높이
		
		while(true) {
			System.out.println("1 - push 2 - pop");
			int in = sc.nextInt(); // push인지 pop인지 입력받음
			
			if(in == 1) { // push일 경우
			int temp = sc.nextInt(); // 값을 입력받음
			arr[index++] = temp; // 상자의 높이를 증가하면서 값을 넣음
				if(index == 3) {
					System.out.println("더이상 push를 할 수 없습니다");
				}
			} else { // pop인 경우 
				System.out.println(arr[--index]); // 높이를 감소하면서 방금 넣은 값 출력
				arr[index] = 0; // 인덱스 초기화
				if(index <= 0) {
					System.out.println("더이상 pop을 할 수 없습니다");
				}
			}
		}
	}

}
