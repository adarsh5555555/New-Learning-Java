import java.util.Arrays;

public class LinearSearchAlgorithemIn1DArray {
    public static void main(String[] args) {
//        // :::FINDING MAXIMUM NUMBER PRESENT IN ARRAY:::
//        int [] myArray = {1,2,3,4,5};
//        int max =myArray[0];
//        for (int i = 1; i < myArray.length; i++) {
//            if (max < myArray[i]) {
//                max = myArray[i];
//            }
//            i++;
//
//        }
//        System.out.printf("max element in the array is %d",max);

        // ::FINDING MAXIMUM ELEMENT IN THE ARRAY WITHIN A SPECIFIED RANGE::
        // return max is included for this programme only
//        int[] myInt = {1,3,4,5,6};
//        System.out.println(returnMax(myInt,0,2));


 //       :::::LINEAR SEARCH ALGORITHEM FOR ARRAYS:::::
        /*given a array and i have to find if the required elememt which is inputted weather
        it is present in the array or not...it yess then return the index of that perticular element
        else return -1 coz -1 cant be a index of an array
        ..now we can perform multiple operations in linear search beased on the need
        such as .......returning that perticular element itself
        using for each loop to iterate over arrray
        returning boolean value and etc...
         */
//        int[] myInt = {1,2,3,4,5,6};
//        System.out.println(linearSearh(myInt,5));;

        /*
        :::: SEARCHING IN STRING ::::
        coz string can be considered as array of characters
        so iterating upon string for specefic chacter and return either
        boolean value if it exists in string or not or returning
        index of the char or return that perticular char itself
        that does it exists in string or not
        :::linearly searching in string

         */
//        String ss = "Darsh";
//       System.out.println( stringSearch(ss,'a'));

//        System.out.println(Arrays.toString(ss.toCharArray()));




    }
//    static int returnMax(int[] array,int start,int end) {
//        // here start and end are the indexes within which we have to find max number
//        // int the array
//        int max =0;
//        for(int i=0;i<=end;i++){
//            if(max<array[i]){
//                max=array[i];
//            }
//            i++;
//        }
//        return max;
//
//    }
//    static int linearSearh(int[] array , int elementToSearch){
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]==elementToSearch){
//                return i;
//            }
//        }
//        return -1;
//    }

 //   ::::THIS METHOD IS SPECIFICALLY DESIGNED FOR LINEAR SEARCH IN STRING::::
    /*
    if that char is present int the string this method retiurns the index of that
    char in the String
     */

//    static int stringSearch(String str,char toSearch){
//        for(int i=0;i<str.length();i++){
//            char isThere = str.trim().charAt(i);
//            if(isThere==toSearch){
//                return i;
//            }
//        }
//        return -1;
//    }
    //char to array means converting string into array of its characters

//    static boolean SearchString(String str , char charToSearch){
//        for (char c :str.toCharArray()) {
//            if(c==charToSearch){
//                return true;
//            }
//
//        }
//        return false;
//    }




}
