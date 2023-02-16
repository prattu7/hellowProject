package exception_handling;

class exceptionhandling_1 {
public static void main(String[] args) {
	System.out.println("Program Starts");
	int a=0;
    try{
		a=10/0;
	}
	catch(ArithmeticException e) {
		{System.out.println(a);
	}
	System.out.println("Program Ends");
	
}
}
}