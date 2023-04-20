package test;

public class Test {

	public static void main(String[] args) {
		// [1부터 10까지 출력]
		int i = 1;
		while(i <= 10) { // i가 10보다 작거나 같을 때까지
			System.out.println(i); // i 출력
			i++; // 출력 후 i+1
		}
		
		
		//[*가 10개 출력 시 줄바꿈]
		int j = 1;
		while(j <= 10) { // j <= 10 일 때 i = 10 이므로
			i = 1; // i의 값을 1로 초기화
			while(i <= 10) {
				System.out.print("*");
				i++;
			}
			System.out.println(); // 줄바꿈
			j++;
		}
		
		
		//[while문을 for문으로 변경]
		for(j = 1; j<=10; j++) { // 바깥 while문
			for(i = 1; i<=10; i++) { // 안 while문
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//[별찍기 - 출력할 때마다 별 개수 +1]
		for(j = 1; j<=10; j++) {
			System.out.println("j = " + j); //현재 j의 값 출력
			for(i = 1; i<j; i++) { 
				/* i = 1, j = 2 : [1<2] -> i++ -> [2<2]  
				   i = 2, j = 3 : [2<3] -> i++ -> [3<3] 
				   -> 반복문이 반복되면서 이전 값들이 누적되어 출력 */
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
