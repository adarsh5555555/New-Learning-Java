import java.util.Scanner;

public class Findcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String which you want to find :");
        char k;
        do{
            System.out.print("Try with new word:");

            k=input.next().trim().charAt(0);


        }while((k>='a')&&(k<='z'));
        System.out.println("yess you reached it");
    }
}
