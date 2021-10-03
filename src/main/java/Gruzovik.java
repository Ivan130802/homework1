import beepers.AlarmBeeper;
import beepers.Beeper;
import engines.Engine;

public abstract class Gruzovik extends Car implements WorkTransport  {
    private int Totalgruz = 0;
    public Gruzovik(Beeper beeper, Engine engine, AlarmBeeper alarmbeeper) {
        super(beeper, engine,alarmbeeper);
    }

    @Override
    public void load (int weight){
        Totalgruz += weight;
        if (Totalgruz >= 1000) {
            System.out.println("It's too hard!!!");
        }else {
            System.out.println(Totalgruz + "kg in trailer");
        }
    }

}
