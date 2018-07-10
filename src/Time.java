
import java.time.LocalDateTime;

public class Time {
    public static void main(String[] args) {
        int second = 99;
        int cycles =0;
        int mhz=0;
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int lastsecond = second;
            second = now.getSecond();
            cycles++;

            if (lastsecond != second) {
                String format = "%d:%d %d";
                String output = String.format(format, hour, minute, second);
                System.out.println(output);
                mhz = cycles/1_000_000;
                System.out.println("Operating at " + mhz +" megahertz");
                cycles=0;
            }
        }
    }
}