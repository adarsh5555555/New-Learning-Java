public class SmallestChae {
    public static void main(String[] args) {
    }
    static char returningSmall(char[] arr , char targetCHar){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(targetCHar>arr[mid]){
                start = mid+1;
            } else if (targetCHar<arr[mid]) {
                end = mid-1;
            }
        }
        return arr[start];
    }
}
