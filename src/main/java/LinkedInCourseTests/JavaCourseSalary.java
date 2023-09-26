package LinkedInCourseTests;

public class JavaCourseSalary {

    public static double salaryCalculator(int hours, double rate, int vacationDays){
        int holidays = vacationDays * 8;
        double baseSalary = (hours * rate) * 52;
        return baseSalary - holidays;
    }


    public static void main(String[] args) {
        System.out.println(salaryCalculator(20, 10, 2));
    }

}
