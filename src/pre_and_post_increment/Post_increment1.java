package pre_and_post_increment;

public class Post_increment1 {
	
	public static void main(String[] args) {
		int i = 0;
		int j = i++ + i++;
		System.out.println(i);
		System.out.println(j);
}
}