public class Test1 {

	public static void main(String[] args) {
		long a = 1_000_000; // , 대신 _로(값에 영향 x)
		long b = 2_000_000;
		long c = a * b; // 2_000_000_000_000 
		// int * int = int -> a,b에 int로 선언하면 에러 발생
		System.out.println(c);

	}

}
