public class leetCodeProblem {
    public static void main(String[] args) {
        int [] myArr = {12,345,2,6,7896,777,33,4444};
         System.out.println(numberOfElementsContainingEven(myArr));

    }
    static int numberOfElementsContainingEven(int[] myArr){
        int num=0;
        for (int j =0;j<myArr.length;j++) {
            int i = myArr[j];

            int count =0;
            while(i>0){
                i /=10;
                count ++;

        }
            if(count%2==0){
                num++;
            }


        }
        return num;
    }
}
