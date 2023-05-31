package oldFiles;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    LocalDateTime dateTime;

    public void timeSetter(LocalDate date){
        this.dateTime = date.atTime(0, 0);
    }

    public LocalDateTime calculation(){
        return this.dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public static void main(String[] args) {
        Gigasecond gigasecond = new Gigasecond();
        gigasecond.timeSetter(LocalDate.now());
        System.out.println(gigasecond.getDateTime());

        System.out.println(gigasecond.calculation());
    }
}
