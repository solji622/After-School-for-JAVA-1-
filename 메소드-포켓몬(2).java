package test;

public class Poketmon {
	// 속성
	static int pno = 0;
	int level = 1;
	int hp = 50;
	int atk = 10;
	String name;
	
	Poketmon(){
		pno++;
		name = "주머니";
	}
	Poketmon(String 이름){
		pno++;
		this.name = 이름;
		// this == 자신을 가르킴
	}
	
	// 기능
	void levelup() {
		level++;
		hp+=10;
		atk+=2;
	}
	
	void run() {
		System.out.println(name + "이 공격합니다");
	}
}
