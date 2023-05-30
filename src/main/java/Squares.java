public class Squares {
    public static int computeSquareOfSum(int num){
        int total = 0;
        for(int i=1; i<=num; i++){
            total += i;
        }
        double answer = Math.pow(total, 2);
        return ((int) answer);
    }
    public static int computeSumOfSquaresTo(int num){
        double total = 0;
        for(int i=1; i<=num; i++){
            total += Math.pow(i, 2);
        }
        return ((int) total);
    }

    public static int computeDifferenceOfSquares(int num){
        return computeSquareOfSum(num) - computeSumOfSquaresTo(num);
    }

    public static void main(String[] args) {
        System.out.println(computeSquareOfSum(10));
        System.out.println(computeSumOfSquaresTo(10));
        System.out.println(computeDifferenceOfSquares(10));
    }
}
