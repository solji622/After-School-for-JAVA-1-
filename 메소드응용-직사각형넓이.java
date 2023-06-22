package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		int row = sc.nextInt();
		System.out.print("세로: ");
		int col = sc.nextInt();
		int result = 0;
		
		result = muti(row, col);
		System.out.println("직사각형의 넓이: "+result);
	}
	
	static int muti(int a, int b) {
    	int result;
        result = a*b;
        return result;
    }

}
