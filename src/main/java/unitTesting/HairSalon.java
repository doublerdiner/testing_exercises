package unitTesting;

public class HairSalon {

    private String[] openingDays = {"Monday", "Tuesday"};
    private int haircutPrice = 30;
    private Calculator calculator = new Calculator();

    public String[] getOpeningDays(){
        return this.openingDays;
    }

    public boolean isOpen(String weekDay){
        if(!weekDay.endsWith("day")){
            throw new IllegalArgumentException("Day entered must end in d-a-y (Monday, Tuesday etc.)");
        }
        for(String day : this.openingDays){
            if(weekDay == day){
                return true;
            }
        }
        return false;
    }


    public int getHaircutPrice() {
        return this.haircutPrice;
    }

    public int applyDiscount() {
        int firstCalc = calculator.divide(getHaircutPrice(), 2);
        return calculator.sum(firstCalc, 5);
    }
}
