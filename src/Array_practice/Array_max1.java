package Array_practice;

public class Array_max1 {
static int arr[] = {100, 60, 30, 150, 90};

// Method to find maximum in arr[]
static int largest()
{ 
	int i;

    // Initialize maximum element
	int max = arr[0];

    // Traverse array elements from second and
    // compare every element with current max 
	
	for( i =1; i < arr.length; i++)
		if(arr[i]> max)
			max = arr[i];
	return max;
	
} // Driver Method
public static void main(String[] args) {
	System.out.println("Largest in given array is " + largest());
}
}
