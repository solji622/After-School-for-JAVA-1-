package test;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Random rd = new Random();
       
        System.out.print("가로: ");
	int rows = sc.nextInt();

	System.out.print("세로: ");
	int cols = sc.nextInt();

	int [] rc = new int [rows*cols];

	for(int i = 0; i<rc.length; i++) {
		rc[i] = rd.nextInt(rows*cols)+1;
		for(int j = 0; j<i; j++) {
			if(rc[i]==rc[j]) i--;
		}
	}

	for(int i=0; i<rc.length; i++) {
           System.out.printf("%d  ", rc[i]);
           	if(i!=0 && (i+1)%cols==0)
               		System.out.println();
		}

	}
}
