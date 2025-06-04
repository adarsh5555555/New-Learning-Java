import java.util.List;

public class Generic{
    public static void main(String[] args) {
        List<Integer> myList = List.of(1,2,3,4,5);
     double add =    myList.stream()
                .map(a->Math.pow(a,2))
                .reduce(1.0,(a,b)->a*b);
        System.out.println(add);

    }
}