package test;

import java.util.Scanner;

public class TEst {

	public static void main(String[] args) {
		 // 두 수를 입력받아서
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("num1?");
        num1 = sc.nextInt();
        System.out.print("num2?");
        num2 = sc.nextInt();
       
        // 사칙연산을 선택하게끔
        System.out.print("+(1) -(2) *(3) /(4)");
        int op = sc.nextInt();        
        double result = 0;
       
        // 계산 결과를 출력
        switch(op) {
        case 1:
            result = add(num1, num2); // num1, num2 == 인자
            break;
        case 2:
        	result = add2(num1, num2);
            break;
        case 3:
        	result = add3(num1, num2);
            break;
        case 4:
            // 더블 = 인트/인트
        	result = add4(num1, num2);
            break;
        default:
            System.out.print("다시 입력해주세요");        
        }
        System.out.println("결과: "+result);
    }
    
	
	// 리턴값 x == void, 리턴값 o == 해당하는 자료형
    static int add(int a, int b) { // int a, b == 매개변수
    	// a == num1, b == num2
    	int result;
        result = a+b;
        return result;
    }
    
    static int add2(int a, int b) {
    	// a == num1, b == num2
    	int result;
        result = a-b;
        return result;
    }
    
    static int add3(int a, int b) {
    	// a == num1, b == num2
    	int result;
        result = a*b;
        return result;
    }
    
    static double add4(double a, double b) {
    	// a == num1, b == num2
    	double result;
        result = a/b;
        return result;
    }

}
