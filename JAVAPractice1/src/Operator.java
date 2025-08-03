

public class Operator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("a >= 0 = " + (a >= 0));
		System.out.println("(a >= 0) && (b >= 0) = " + ((a >= 0) && (b >= 0)));
		
	}

}
