public class leetCodeProblem2 {
    public static void main(String[] args) {

    }
    static int richestWealth(int[][] myArr){
        int rowSum = Integer.MIN_VALUE;
        for(int[] arr :myArr){
            int sum = 0;
            for(int i=0;i< arr.length;i++){
                sum += arr[i];
            }
            if(sum>rowSum){
                rowSum =sum;
            }

        }
        return rowSum;

    }
}
