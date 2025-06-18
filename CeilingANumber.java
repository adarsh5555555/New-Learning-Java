public class CeilingANumber {
    public static void main(String[] args) {
        int [] myArr=  {1,2,3,4,5,6,8,12};
        System.out.println(ceilNumber(myArr, 7));
        System.out.println(floorNumber(myArr,7));

    }
    /*
    HERE CEILING A NUMBER MEANS IF A TARGET NUMBER IS GIVEN THE A METHOD SHOULD RETURN
    THE INDEX OF THE TARGET NUMBER ITSELF PRESENT IN THE ARRAY OR ELSE THE INDEX OF THE
    SMALLEST NUMBER GREATER THAN  TARGET NUMBER PRESENT IN THE ARRAY

     */
  static int ceilNumber(int[] array,int targetElement){
        int start = 0;
        int end  = array.length-1;
        while(start<=end){
            int mid = start+(end-start/2);
            if(targetElement>array[mid]){
                start = mid+1;
            } else if (targetElement<array[mid]) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return start;
  }
  /*
  FLOORING A NUMBER IS JUST THE OPPOSITE OF CEILING A NUMBER
   */
    static int floorNumber(int[] array,int targetElement){
        int start = 0;
        int end  = array.length-1;
        while(start<=end){
            int mid = start+(end-start/2);
            if(targetElement>array[mid]){
                start = mid+1;
            } else if (targetElement<array[mid]) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return end;
    }
}

