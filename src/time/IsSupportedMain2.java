package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean isSupported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("isSupported = " + isSupported);
        if(isSupported){
            int minute = now.get(ChronoField.SECOND_OF_MINUTE); // Unsupported field: SecondOfMinute
            System.out.println("minute = " + minute);
        }
    }
}
