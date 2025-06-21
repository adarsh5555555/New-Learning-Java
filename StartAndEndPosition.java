import java.util.Arrays;

public class StartAndEndPosition {
    public static void main(String[] args) {
        int[] myArr = {1,2,7,7,7,7,7,7,9};
        System.out.println(Arrays.toString(search(myArr,7)));


    }
    static int[] search(int[]arr ,int target){
        int [] ans = {-1,-1};
        int startIndex = find(arr,target,true);
        ans[0]=startIndex;
        int endIndex = find(arr,target,false);
        ans[1] = endIndex;
        return ans;

    }
    static int find(int[]arr , int targetElement,boolean FindStartIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(end>=start){
            int mid  = start+(end-start)/2;
            if(targetElement>arr[mid]){
                start = mid+1;
            } else if (targetElement<arr[mid]) {
                end = mid-1;

            }else{
                ans = mid;
                if(FindStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
