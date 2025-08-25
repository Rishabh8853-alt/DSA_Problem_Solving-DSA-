public class LinearSearch{
    
    public static int GetSearch(int arr[],int key,int n){
        for(int i=0;i<n;i++){
            if(key == arr[i]){
                return i;
            
        }
    }
    return -1;
    }
    public static void main( String[] args){
        int key=10;
        int arr[]={1,4,5,6,8,10,11,12};
           int n= arr.length;
        int index= GetSearch(arr,key,n);
        if(index==-1){
            System.out.println("Not found");
            
        }else{
             System.out.println("found at index:" + index);
            
        }
        
    }
}