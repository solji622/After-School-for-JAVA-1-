public class game {

	public static void main(String[] args) {
		
		Poketmon p1 = new Poketmon();
		
		p1.name = "Gorapaduck";
		
		System.out.println(p1.name);
		System.out.println(p1.name+"의 레벨은 "+p1.level+"이다");
		System.out.println("level up!");
		
		p1.level_up();
		System.out.println(p1.name+"의 레벨은 "+p1.level+"이다");
		
		
	}

}
