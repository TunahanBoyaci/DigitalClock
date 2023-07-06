import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM:dd:yy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("kk:mm:ss");

        LocalDate date = LocalDate.now();

        System.out.println("Date: " + date);

        while(true) {
            LocalTime time = LocalTime.now();
            System.out.print("\r" + time.format(dateTimeFormatter2));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
