package Method_and_functions;

public class Functions {
	static void m1() {
		System.out.println("M1 default method");	}
	int m2() {
		System.out.println("M2 default method & Int ReturnType");
		return 10;	}
	void m3(String a) {
		System.out.println("M3 String Arg method");	}
	
	public static void main(String[] args) {
		Functions.m1();
		Functions obj1 = new Functions();
		int x= obj1.m2();
		obj1.m3("hello");
		System.out.println(x);
	}
}

