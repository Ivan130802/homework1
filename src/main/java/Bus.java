import beepers.AlarmBeeper;
import beepers.Beeper;
import engines.Engine;

public abstract class Bus extends Car implements PublicTransport {
    private int peopleTotalCount = 0;
    public Bus(Beeper beeper, Engine engine, AlarmBeeper alarmbeeper) {
        super(beeper, engine,alarmbeeper);

    }

    @Override
    public void stop (int peopleCount){
    peopleTotalCount += peopleCount;
    System.out.println(peopleTotalCount + " people in bus");
    }
}
