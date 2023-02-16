package pre_and_post_increment;

public class Pre_and_Post_increment {
 public static void main(String[] args) {
	int i = 1;
	int j = i++ + i-- -  --i + ++i -++i + i++ + i--;
	System.out.println(i);
	System.out.println(j);
}
}
