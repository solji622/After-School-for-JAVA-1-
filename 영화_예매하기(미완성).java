package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\r\n" + 
				"╔═╗╦ ╦╔╗╔╔═╗╦╦    ╔═╗╦╔╗╔╔═╗╔╦╗╔═╗\r\n" + 
				"╚═╗║ ║║║║║ ╦║║    ║  ║║║║║╣ ║║║╠═╣\r\n" + 
				"╚═╝╚═╝╝╚╝╚═╝╩╩═╝  ╚═╝╩╝╚╝╚═╝╩ ╩╩ ╩" + 
				"");
		
		String [][] seat = new String [5][5];
		
		while(true) {
			System.out.println();
			System.out.println("① 남은 좌석 확인 \n② 좌석 예매 \n③ 예매 확인 \n④ 종료");
			System.out.println();
			System.out.print("메뉴 선택: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("『 남은 좌석 확인하기 』");
				
				for(int i = 0; i<seat.length; i++) {
					for(int j = 0; j<seat.length; j++) {
						if(seat[i][j] == null) {
							System.out.printf(" □ ");
						} else {
							System.out.printf(" ■ ");
						}
					}
					System.out.println();
				}
				System.out.println("---------------");
				break;
				
			case 2:
				System.out.println("『 좌석 예매하기』");
				
				System.out.print("행 입력: ");
				int row = sc.nextInt();
				System.out.print("열 입력: ");
				int col = sc.nextInt();
				
				if((row >= 0 && row < 5) && (col >= 0 && col < 5)){
					System.out.print("이름 입력: ");
					String name = sc.next();
					if(seat[row][col] == null) {
						seat[row][col] = name;
						System.out.println("예매가 완료되었습니다.");
					} else {
						System.out.println("이미 선택된 좌석입니다. 다시 예매해주세요");
					}
				} else {
					System.out.println("다시 입력해주세요.");
				}
				System.out.println("---------------");
				break;
				
			case 3:
				System.out.println("『 예매 확인하기 』");
				System.out.print("예약자명: ");
				String myname = sc.next();
				
				for(int i = 0; i<seat.length; i++) {
					for(int j = 0; j<seat.length; j++) {
						if(seat[i][j] == myname) {
							System.out.println(myname+"님의 좌석은"+i+"행"+j+"열 입니다.");
						} else {
							System.out.println("예약 내역이 존재하지 않습니다.");
						}
					}
				}
				
				
				System.out.println("---------------");
				break;
			case 4:
				System.out.println("『 프로그램 종료 』");
				break;
			default:
				System.out.println("『 오류, 메뉴 재입력해주세요 』");
			}
		}
		
	}
}
