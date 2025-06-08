import java.util.Scanner;

public class numberOperation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number in which you want to find :");
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
        String num  = inp.next();
        System.out.println("Enter the digit whose number of occurence you have to find :");
        int num2 = inp.nextInt();
        int i=0;
        while(i<num.length()){
            char c = num.trim().charAt(i);
            if(c==num2){
                i++;
            }
            i++;
        }
        System.out.printf("the number of occurence of %d is %d",num,i);
    }
}
