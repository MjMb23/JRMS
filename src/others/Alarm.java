
package others;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Alarm {
    private LocalTime alarmTime;

    public Alarm(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }
    public LocalTime getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }
    
    

    public static void main(String[] args) {
        Alarm alarm =new Alarm(LocalTime.MIN);
        alarm.setAlarmTime(LocalTime.now().minusHours(3));
        System.out.println(alarm.getAlarmTime().truncatedTo(ChronoUnit.MINUTES));
    }
    
}
