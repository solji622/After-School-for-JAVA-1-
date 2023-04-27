public class Test {
	public static void main(String[] args) {
		int empty = 18; //변수에 18 저장
		int emplus1 = ++empty; //++□ -> +1 전위 연산자
		System.out.println("++empty : "+emplus1);
		
		empty = 18;
		emplus1 = empty++; // □++ -> 후위 연산자(연산을 나중에)
		System.out.println("empty++ : "+emplus1);
		System.out.println("empty : "+empty); // 후위 연산자로 +1 되어 19 출력
	}

}
