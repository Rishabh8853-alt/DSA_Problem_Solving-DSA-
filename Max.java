public class Max {

	public static int Getmax(int arr[]) {
		int maximum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(maximum<arr[i]) {
				maximum=arr[i];
			}

		}
		return maximum;
	}


public static void main( String[] args) {

	int arr[] = {1,2,3,4,5,6,7,5,4,10};
	System.out.println(Getmax(arr));

}
}