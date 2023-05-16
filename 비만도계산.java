import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//체중, 키 입력받기
		System.out.print("체중 입력: ");
		float weight = sc.nextFloat();
		System.out.print("키 입력: ");
		float 키 = sc.nextFloat();
		
		//비만도 계산하기
		float bmi = weight / (키 * 키);
		
		//비만도에 따라 출력하기
		if (bmi < 18.5) { // 18.5 미만
			System.out.println("저체중");
		} else if (bmi <= 24.9) {
			// 18.5~24.9 *위에서 이미 걸러지기에 24.9 이하만
			System.out.println("정상");
		} else if (bmi <= 29.9) { // 25~29.9
			System.out.println("과체중");
		} else if (bmi >= 30) { // 30 이상
			System.out.println("비만");
		} else {
			System.out.println("값 오류");
		}
	}

}
