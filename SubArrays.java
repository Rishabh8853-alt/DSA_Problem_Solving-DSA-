
public class SubArrays

{
	static void PrintSubarrays( int arr[]) {
		int ts=0;
		for(int i=0; i<arr.length; i++) {
			int start=i;
			for(int j=i; j<arr.length; j++) {
				int end=j;
				for(int k=start; k<end; k++) {
					System.out.println(arr[k]+"");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total Subarray"+ts);

	}

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12};
		PrintSubarrays(arr);
	}
}
