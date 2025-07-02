public class ArrayAlgorithms{
  public static void main(String[] args){
    
  }

  private static int[] mergeTwoLists(int[] arr1, int[] arr2, int m, int n){
      int p1 = 0;
      int p2 = 0;
      int[] mergedList = new int[m+n];
      for(int i=0;i<mergedList.length;i++){
          if(p1<m && p2<n){
              if(arr1[p1]<=arr2[p2]){
                  mergedList[i]=arr1[p1];
                  p1+=1;
              }
              else{
                  mergedList[i]=arr2[p2];
                  p2+=1;
              }
          }
          else if(p2<n){
              mergedList[i]=arr2[p2];
              p2+=1;
          }
          else if(p1<m){
              mergedList[i]=arr1[p1];
              p1+=1;
          }
      }
      return mergedList;
  }
}
