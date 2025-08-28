import java.util.*;
class Main {
     public static void Riverarray(int arr[]){
        //  int temp=0;
        int left = 0;
        int right = arr.length - 1;
         while(left<=right){
             int temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;
             left++;
             right--;
         }
         
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
      
 System.out.println("Original Array: " + Arrays.toString(arr)); // fixed

       Riverarray(arr);

      System.out.println("Reversed Array: " + Arrays.toString(arr)); // fixed
    }
}

// import java.util.*;

// class Main {
//     public static void Riverarray(int arr[]) {
//         int left = 0;
//         int right = arr.length - 1;
//         while (left <= right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Original Array: " + Arrays.toString(arr)); // fixed

//         Riverarray(arr);

//         System.out.println("Reversed Array: " + Arrays.toString(arr)); // fixed
//     }
// }
