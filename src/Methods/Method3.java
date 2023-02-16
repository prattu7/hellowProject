package Methods;

class Method3 {
	
	static void m1() {
		System.out.println("M1 Deafault Method");
	}
	 void m2() {
		 System.out.println("M2 Method with void return type");
	 }
	 static int m3() {
		 System.out.println("M3 Method with int return type");
		 return 100;
	 }
	 double m4() {
		 System.out.println("M4 Method with double return type");
		 return 2.5;
	 }
	public static void main(String[] args) {
		Method3.m1();
		Methods obj1 = new Methods();
		obj1.m2();
		int a = Method3.m3();
		System.out.println(a);
		double b = obj1.m4();
		System.out.println(b);
		
		
	}
}
