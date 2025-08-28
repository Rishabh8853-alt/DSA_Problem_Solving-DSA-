
public class Main
{
	public static int BinarySearch( int arr[],int key) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid =(start+end)/2;
			if( arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}

		}
		return -1;
	}
	public static void main(String[] args) {
		int key=10;
		int arr[]= {2,3,5,7,8,4,5,6,10};
		int index=BinarySearch(arr,key);
		if(index==-1) {
			System.out.println("index not found");
		} else {
			System.out.println("index for keys is"+ index);
		}
	}
}