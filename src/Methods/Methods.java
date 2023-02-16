package Methods;

public class Methods {
	public static void main(String[] args) {
		Methods.m1();
		Methods obj1 = new Methods();
		obj1.m2();	
		int a = Methods.m3();
		double b = obj1.m4();
		System.out.println(b);
		System.out.println(a);
		int c = Methods.m5();
		System.out.println(c);
	}
static void m1() {
	System.out.println("M1 Default Method");
}
void m2() { 
	System.out.println("M2 default nonStatic method");
}
static int m3() {
	System.out.println("M3 default Static method & Int Return type");
	return 10;
}
double m4() {
	System.out.println("M4 default Static method & Double Return type");
	return 20.5;
}
static int m5() {
	return 100;
}
}