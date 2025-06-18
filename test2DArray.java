import java.util.Arrays;
import java.util.Scanner;

public class test2DArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of rows you want to be in the array :");
//        int rows = input.nextInt();
//        System.out.println("Enter the maximum number of columns you want to be in the array :");
//        int collumns = input.nextInt();
//        int [][] myArray = new int[rows][collumns];
//        for (int row = 0; row < myArray.length; row++) {
//            for(int column =0;column<myArray[row].length;column++){
//                System.out.printf("Enter the %d element of %d row :",column+1,row+1);
//                myArray[row][column] = input.nextInt();
//            }
//        }
//        for(int[] arr :myArray){
//            for(int i :arr){
//                System.out.print(i+" ");
//            }
//            System.out.println("");
//        }
//        for(int i=0;i<myArray.length;i++){
//            for(int j=0;j<myArray[i].length;j++){
//                System.out.print(myArray[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        int[] array = {1,2,3,4,5,6};
//        System.out.println(isPresent(array,5));
        String ss = "Darsh";
        boolean isPresent = isPresent(ss, 'n');
        if (isPresent) {
            System.out.println("yes the character is present in the string");
        } else {
            System.out.println("noo the character is not there in the array");
        }


    }
//    static int isPresent(int[] arr ,int num){
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]==num){
//                return i;
//            }
//        }
//        return -1;
//    }
//    static boolean isThere (String str , char toFind){
//        for(int i=0;i<str.length();i++){
//            char c = str.trim().charAt(i);
//            if(c==toFind){
//                return true;
//            }
//        }
//        return false;
//    }
    static boolean isPresent(String ss , char c){
        for(char d :ss.toCharArray()){
            if(d==c){
                return true;
            }

        }
        return false;
    }
}
