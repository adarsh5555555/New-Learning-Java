public class BinarySearchAlgorithem {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,};
        System.out.println( findTarget(array,6));

    }
    /*
    BINARY SEARCH ALGORITHEM IS ONLY APPLICABLR FOR THE SORTED ARRAY
    BUT SORTED ARRAY CAN BE OF ANY TYPE EITHER ASCENDING OR DESCENDING
    THIS CODE IS WRITTEN AS ASSUMING THE ARRAY IS SORTED IN ASCENDING ORDER
    THIS DESCENDING ORDER WILL BE COVERED IN "ORDER AGNOSTIC BINARY SEARCH
    ALGORITHEM
     */

    static int findTarget(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start/2);
            if(target>arr[mid]){
                start = mid +1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else{
                return mid;
            }


        }
        return -1;
    }
}
