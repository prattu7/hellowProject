package string_1;
public class string123 {
	public static void main(String[] args) {
		String str  = "The rains have started here";
		String str1 = "The rains Have started here";
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("s")); //8
		System.out.println(str.indexOf("s", 9)); //15
		System.out.println("========");
		System.out.println(str.indexOf("s", str.indexOf('s')+1));
		System.out.println(str.indexOf("s",str.indexOf("s", str.indexOf('s')+1)+1));
		System.out.println(str.indexOf("s", 25));
		System.out.println(str.indexOf("Hello"));
		System.out.println(str.indexOf("star"));
		System.out.println(str.indexOf("star",str.indexOf("star")+1));
		System.out.println(str.substring(8));
		System.out.println(str.substring(12, 17)); //(Start from index position, End before Index position)
		System.out.println("---------------");
		System.out.println(str);
		System.out.println("#####################");
		String v1= "hello how are you";
		System.out.println(v1.substring(4, 9)); //o how
		System.out.println(v1.substring(7, 13)); //ow are
		System.out.println(v1.indexOf("h", v1.indexOf("h")+1)); //6
		System.out.println("#####################");
		
		String temp[]= str.split(" ");
		System.out.println(temp.length);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		String x ="100";
		int i = Integer.parseInt(x); //Wrapper Class
		double ab= Double.parseDouble(x);
		System.out.println(i);
		System.out.println(ab);
		System.out.println(i+10); //110
		System.out.println(x+10); //10010
		String xy = "hello100";
		String z ="hello";
		int i1 = Integer.parseInt(xy);
		System.out.println(i1);
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");	
		System.out.println(100+"");
	}
}

//Assignment
//From your acc no 0001234534565 amount of 1000Rs credited to acc no 0074665326745
//From your acc no 1241234534565 amount of 40000Rs credited to acc no 4074665326745














