import java.io.IOException;
import java.util.Scanner;

public class numberOperation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //       System.out.print("Enter the number in which you want to find :");
        /*

        this was by simple algorithem and operation on numbers

         */

//        long num  = inp.nextInt();
//        System.out.print("Enter the digit you want to find number of occurence of :");
//        int num2 = inp.nextInt();
//        int i=0;
//        while(num>0){
//            long n = num%10;
//            if(n==num2){
//                i++;
//            }
//            num /=10;
//        }
//        System.out.printf("number of occurence of %d is %d",num2,i);
        /*

        now doing the same problem by String operation

         */
//        String num  = inp.next();
//        System.out.println("Enter the digit whose number of occurence you have to find :");
//        String num2 = inp.next();
//        char numm = num2.trim().charAt(0);
//        System.out.println(numm);
//        int j=0;
//        int i=0;
//        while(i<num.length()){
//            char c = num.trim().charAt(i);
//            if(c==numm){
//                j++;
//            }
//            i++;
//   }
        //logic to reverse a number
//        System.out.print("ENTER THE NUMBER YOU WANT TO REVERSE :");
//        int number = inp.nextInt();
//        int reversedDigit = 0;
//        while(number>0){
//            reversedDigit  = reversedDigit*10+number%10;
//            number /= 10;
//        }
//        System.out.printf("your reversed digit is %d",reversedDigit);
        
        
      //      creating calculator


//
//        System.out.println("Enter the two numbers");
//        int num1 = inp.nextInt();
//        int num2 = inp.nextInt();
//
//        while (true) {
//            System.out.println("Enter the operator you want to operate with :");
//            char operator = inp.next().trim().charAt(0);
//            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
//                if (operator == '+') {
//                    System.out.println(num1 + num2);
//                } else if (operator == '-') {
//                    System.out.println(num1 - num2);
//                } else if (operator == '*') {
//                    System.out.println(num1 * num2);
//                } else if (operator == '/') {
//                    if (num2 != 0) {
//                        System.out.println(num1 / num2);
//                    } else {
//                        System.out.println("the divesion is invalied");
//                    }
//                }
//
//            } else if (operator == 'x' || operator == 'X') {
//                break;
//            }
//        }

        //using switch operator

//        System.out.print("Enter the name of any fruit :");
//        String fruit =inp.next();
//        switch(fruit){
//            case "Mango":
//                System.out.println("king of friuts");
//                break;
//            case "apple":
//                System.out.println("a red round fruit");
//                break;
//
//
//            }

        // SWAP ELEMENTS


//
//        }
//        static void swap(int a,int b){
//        int c=b;
//        b=a;
//        a=c;
//            return; a,b;
//        String name = "kunal";
//        char first = ret(name);
//        System.out.println(first);
//        }
//        static char ret(String naam){
//       return naam.trim().charAt(0);


        //PRIME NUMBER CHECKER

//
//        System.out.print("Enter the number that you wanna check :");
//        int number = inp.nextInt();
//       boolean isPrime = isPrime(number);
//       if(isPrime){
//           System.out.printf("yess the number %d is a prime number",number);
//       }else{
//           System.out.printf("noo the number %d is not a prime number",number);
//       }
//
//        }
//        static boolean isPrime(int num){
//        int number =2;
//        while(number<=num/2){
//            int result = num%number;
//            if(result!=0){
//                number ++;
//            }else{
//                return false;
//            }
//        }
//        return true;


 //      :: ARMSTRONG NUMBER CHECKER::
        System.out.print("Enter the number that you wanna check :");
        int number  = inp.nextInt();
        boolean isArmstrong = isArmstrong(number);
        if(isArmstrong){
            System.out.printf("Yess the number %d is an armstrong number",number);
        }else{
            System.out.printf("Noo the number %d is not an armstrong number",number);
        }
        //printing all armstrong numbers betwween specified range lets assume it to be b/w 100 to 1000
        // or all three digits armstrong numbers
        System.out.println("\n");
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){

                System.out.print(i+" ");
            }
        }


        }
        static boolean isArmstrong(int num){
        int numcopy = num;
        int result =0;
        while(num>0){
            double digit = num%10;
            digit = Math.pow(digit,3);
            result += digit;
            num /= 10;
        }
        return result==numcopy;

        }


    }





