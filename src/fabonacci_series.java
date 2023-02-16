
class fabonacci_series {
	public static void main(String[] args) {

	    int n = 10, firstNo = 0, secondNo = 1;
	  

	    for (int i = 1; i <= n; i++) {
	      System.out.print(firstNo + " ");

	      // compute the next term
	      int sum = firstNo + secondNo;
	      firstNo = secondNo;
	      secondNo = sum;
	    }
	  }
	}