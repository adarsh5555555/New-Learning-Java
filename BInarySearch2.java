public class BInarySearch2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int isPresent = find(arr,4);
        System.out.println(isPresent);

    }
    static int find(int[] myArr,int target){
        int start = 0;
        int end = myArr.length-1;
        while(end>=start){
            int mid = start+(end-start)/2;
            if(target>myArr[mid]){
                start = mid+1;
            } else if (target<myArr[mid]) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
