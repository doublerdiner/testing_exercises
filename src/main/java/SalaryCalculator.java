public class SalaryCalculator {

    public static double multiplierPerDaysSkipped(int daysSkipped) {
        double calculatedPercentage = 1 - ((daysSkipped - 5) * .15);
        return daysSkipped > 5 ? calculatedPercentage : 1;
    }

    public static void main(String[] args) {
        System.out.println(multiplierPerDaysSkipped(5));
        System.out.println(multiplierPerDaysSkipped(2));
        System.out.println(multiplierPerDaysSkipped(7));

    }
}
