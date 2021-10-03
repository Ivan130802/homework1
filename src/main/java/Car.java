import beepers.AlarmBeeper;
import beepers.Beeper;
import engines.Engine;

public abstract class Car {

    private Beeper beeper;
    private Engine engine;
    private AlarmBeeper alarmbeeper;

   public Car(Beeper beeper,Engine engine,AlarmBeeper alarmbeeper){
       this.beeper = beeper;
       this.engine = engine;
       this.alarmbeeper = alarmbeeper;
   }

    public String checkBeep() {
       return beeper.makeSound();
   }
    public String checkSpeed(){return engine.makeRotation();}
    public String checkAlarm(){return alarmbeeper.makeAlarm();}
}
