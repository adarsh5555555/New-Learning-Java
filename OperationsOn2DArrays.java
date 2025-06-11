import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class OperationsOn2DArrays {
    public static void main(String[] args) {
        // ::DECLARATION OF 2D ARRAY AND ITRATING ON IT
//        int[][] myArray = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for(int column=0;column< myArray.length;column++){
//            for(int rows=0;rows<myArray[column].length;rows++){
//                System.out.print(myArray[column][rows]+" ");
//
//            }
//            System.out.println("");
//
//        }
        // ::INPUTING A 2D ARRRAY FROM A USER


         // ::::::HERE VERY IMPORTATNT THING IS TO TAKE CARE OF NULL POINTER EXCEPTION WHICH CAN OCCUR
        //         IF COLUMNS ARE NOT INITIALISED WHILE INITIALISING ARRAY:::::
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of rows :");
//        int rows =  input.nextInt();
//        System.out.print("Enter the max number of columns you want to  be in the array:");
//        int collumns = input.nextInt();
//        int[][] myArray = new int[rows][collumns];
//        for(int row =0;row<rows;row++){
//            for(int collumn =0;collumn<collumns;collumn++){
//                System.out.printf("Enter element in %d column of %d row",collumn+1,row+1);
//                myArray[row][collumn]= input.nextInt();
//            }
//        }
//


        // output of a 2d arrray which we took input by using toString() method



//        for(int i=0;i<rows;i++){
//            System.out.println(Arrays.toString(myArray[i]));
//        }



        //output or iterating on the same array which we took input by the user without using  toString()


//        for(int row=0;row<rows;row++){
//            for(int column =0;column<collumns;column++){
//                System.out.print(myArray[row][column]+" ");
//            }
//            System.out.println("");
//        }


       }
    }
