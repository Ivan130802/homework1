import beepers.AlarmBeeper;
import beepers.Beeper;
import engines.Engine;

public class Viper extends Car{
    public Viper(Beeper beeper, Engine engine, AlarmBeeper alarmbeeper) {
        super(beeper, engine, alarmbeeper);
    }
    public void scoopFuel(){
        System.out.println("Fuel scoped!");
    }
    public void LandToPlanet(){
      System.out.println("Vehicle landed");
    }
}
