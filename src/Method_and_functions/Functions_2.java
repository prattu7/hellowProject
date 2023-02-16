package Method_and_functions;

class Functions_2 {
	String m1(int a, boolean b) {
		System.out.println("M1 method=> "+ a + "=="+ b);	
		return "Hi";}
	
	public static void main(String[] args) {
	 Functions_2 obj1= new Functions_2();
		String a= obj1.m1(10, true);
		
}}