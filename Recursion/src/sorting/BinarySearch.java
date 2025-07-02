public class BinarySearch{
   public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(findNumber(arr,10));
        System.out.println(findNumberRecur(arr,0, arr.length-1,10));
    }
    
    
   public static boolean findNumber(int[] arr, int n){
       int low = 0;
       int high = arr.length-1;
       
       while(low <= high){
           int mid = (low+high)/2;
           
           if(arr[mid]==n){
               return true;
           }
           if(arr[mid]<n){
               low=mid+1;
           }
           if(arr[mid]>n){
               high=mid-1;
           }
           
       }
       return false;
   }
   
   public static boolean findNumberRecur(int[] arr, int low, int high, int key){
       int mid=(low+high)/2;
       if(high<low){
           return false;
       }
       if(arr[mid]==key){
           return true;
       }
       else if(arr[mid]<key){
           return findNumberRecur(arr,mid+1,high,key);
       }
       else
       {
           return findNumberRecur(arr,low,mid-1,key);
       }
}
