public class SmallestChar {
    public static void main(String[] args) {
        char[] cc = {'a','b','c'};
        char d  =returnSmall(cc,'z');
        System.out.println(d);

    }
    static char returnSmall(char[] myChar,char target){
        int start = 0;
        int end = myChar.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((int)target>(int)myChar[mid]){
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return myChar[start%myChar.length];
    }
}
