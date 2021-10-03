package beepers;

public class EmergencyBeep implements AlarmBeeper{
    @Override
    public String makeAlarm() {
        return  "Emergency Stop!!!";
    }
}
