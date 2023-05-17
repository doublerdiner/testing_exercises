public class EmployeeSalary {

    public static double calculateSalary(int daysOff, int hours, double hourlyPay){
        int timeAway = daysOff * 8;
        int yearlyHours = hours * 52;
        double annualPay = (yearlyHours - timeAway) * hourlyPay;
        return annualPay;
    }
    public static void main(String[] args) {
        double chrisBarclaySalary = calculateSalary(5, 35, 15);
        System.out.println("Chris Barclay's salary for this year is £ " + chrisBarclaySalary);

    }
}
