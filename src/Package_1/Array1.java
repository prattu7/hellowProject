package Package_1;

public class Array1 {
		public static void main(String[] args) {
			int y = 100;
			int a[]= {10, 20, 30, 40, 50};
			String b[]= {"Hi","Hello","Best","Monday"};
			//Arrays are stored based on index location. Index location starts from 0
			System.out.println(a.length);
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println(a[4]);
			System.out.println("=====");
			for(int i= 0; i<a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println("=====");
			for(int i= a.length-1; i>=0; i--) {
				System.out.println(a[i]);
			}
		}
	}
