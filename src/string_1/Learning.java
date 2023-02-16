package string_1;
public class Learning {
 static int x=10;
 int y=20;
	public static void main(String[] args) {
		int a=100;
		System.out.println(Learning.x);
		System.out.println(x);
		System.out.println(a);
		Learning obj= new Learning();
		System.out.println(obj.y);
		System.out.println(obj.x);
		String g= obj.m1(1000);
		System.out.println(g);	
		}
		String m1(int c) {
		System.out.println("returns Hellow accepts numbr 1000 as argument");
	    return "hellow"; 
	    }
      Learning(){
    	  System.out.println("Default Constructor");
      }
      Learning(int d) {
    	  System.out.println("Int Arg Constructor");
      }
      static {System.out.println("Static Block");}
      { System.out.println("Non Static Bloak");}
      }
      
      
