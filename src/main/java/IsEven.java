public class IsEven {
    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        IsEven isEven = new IsEven();
        System.out.println(isEven.isEven(2));
        System.out.println(isEven.isEven(12));
        System.out.println(isEven.isEven(22000));
        System.out.println(isEven.isEven(-1));
        System.out.println(isEven.isEven(5));
        System.out.println(isEven.isEven(153));
    }
}
