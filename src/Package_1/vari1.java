package Package_1;

public class vari1 {
	static int a = 10;
	int c = 20;
	public static void main(String[] args) {
		vari1 obj = new vari1();
		System.out.println(a);
		System.out.println(vari1.a);
		System.out.println(obj.a);
		System.out.println(obj.c);
		int a = 30;
		int x = 40;
	vari1 obj2 = new vari1();
	System.out.println(vari1.a);
	System.out.println(a);
	System.out.println(obj2.c);
	System.out.println(obj2.a);
	System.out.println(x);
	vari1.a = 11;
	obj.c = 21;
	obj2.c = 23;
	a = 31;
	x = 41;
	vari1 obj3 = new vari1();
	System.out.println(vari1.a);
	System.out.println(a);
	System.out.println(obj3.a);
	System.out.println(obj2.a);
	System.out.println(obj.a);
	System.out.println(obj.c);
	System.out.println(obj2.c);
	System.out.println(obj3.c);
	System.out.println(x);
	
	
	
	
	}

	

}
