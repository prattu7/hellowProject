
public class PrimeNo {
	public static void main(String[] args) {
	    int prime = 17;
	    boolean status = true;
	    for (int i = 2; i <prime; i++) {
	 
	      if (prime % i == 0)
	      { 
	    	  System.out.println(prime +" " + "Its not a Prime Number, it is divisible by" + i);
	    	  status= false;
	    	  break;
	      }
	    }
	    if( status==true)
	    {
	      System.out.println(prime + " "+"Its a prime number.");
	  }
	    }}
