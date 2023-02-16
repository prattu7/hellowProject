package Package_1;
class GL_var {
	static int k=40;
	int p=50;
	public static void main(String[] args) {
		int i=10;
		int j=20;
		System.out.println(k);
		System.out.println(GL_var.k);
		GL_var obj = new GL_var();
		System.out.println(obj.k);
		System.out.println(obj.p);
		obj.p = 120;
		System.out.println(obj.p);
		GL_var obj2 = new GL_var();
		System.out.println(obj2.p);
		int k = 1000;
		System.out.println(k+" ");
		System.out.println(i+j);
		System.out.println("k"+"i"+10+20);
	
				
	}
}
