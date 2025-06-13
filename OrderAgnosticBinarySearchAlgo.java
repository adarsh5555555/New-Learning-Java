public class OrderAgnosticBinarySearchAlgo {
    public static void main(String[] args) {
        int[]arr = {3,3,3,3,3,3,3};
        System.out.println(  search(arr,3));;

    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if (arr[0] < arr[arr.length - 1]) {
            while(start<=end){
                int mid = start+(end-start/2);
                if(target>arr[mid]){
                    start = mid+1;
                }else if(target<arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
                return -1;

            }


        } else if (arr[0] > arr[arr.length - 1]) {
            while(start<=end){
                int mid = start+(end-start/2);
                if(target>arr[mid]){
                    end = mid-1;
                }else if(target<arr[mid]){
                    start = mid+1;
                }else{
                    return mid;

                }
                return -1;

            }


        } else {
           if(target==arr[0]){
               return 0;
           }else{
               return -1;
           }

        }
        return 0;//unreachable

    }
}