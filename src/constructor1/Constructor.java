package constructor1;

//NonStatic block will be executed first before calling each Constructor
public class Constructor {
	int i = 10;
	{	System.out.println("NonStatic Block-1");
		//We don't need to refer the Non static members with help of Object Name
		System.out.println(i);	}
	{	System.out.println("NonStatic Block-2");	}
	static
	{	System.out.println("Static Block");
		//We can refer the Non static members with help of Object Name
		Constructor obj = new Constructor();
		System.out.println(obj.i);
		System.out.println("Static Block-2");	}
	Constructor(){
		System.out.println("Default Constructor");	}
	Constructor(int a){
		int u=100;
		//We don't need to refer the Non static members with help of Object Name
		System.out.println(i);
		System.out.println(a);
		System.out.println("Int Arg Constructor");	}
	Constructor(int a, double b){
		System.out.println("Int & Double Arg Constructor");	}
	Constructor(double a, int b){
		System.out.println("Double & Int Arg Constructor");	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Constructor obj = new Constructor();
		System.out.println(obj.i);
		Constructor obj1 = new Constructor(100);
		new Constructor(10,20.50);
		new Constructor(20.50,10);
	}
}