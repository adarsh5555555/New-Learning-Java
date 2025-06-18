public class binarySearch {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        int a = isThere(myArray , 7);
        System.out.println(a);

    }
    static  int isThere(int[] arr ,int numToFind){
      int start = 0;
      int end = arr.length-1;
      while(start<=end){
          int mid = start+(end-start)/2;
          if(arr[mid]<numToFind){
              start =mid+1;
          } else if (arr[mid]>numToFind) {
              end = mid-1;
          }else{
              return mid;
          }
      }

        return -1;
    }
}
