public class FindMin {

	public static int Getmin(int arr[]) {
		int minimum = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(minimum>arr[i]) {
				minimum=arr[i];
			}

		}
		return minimum;
	}


	public static void main( String[] args) {

		int arr[] = {1,2,3,4,5,6,7,5,4,10};
		System.out.println(Getmin(arr));

	}
}