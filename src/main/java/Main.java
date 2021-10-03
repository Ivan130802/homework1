import beepers.*;
import engines.Engine12V;
import engines.FSDEngine;

public abstract class Main {
    public static void main(String[] args) {
        Horn horn = new Horn();
        AlarmBeeper alarmbeeper = new EmergencyBeep();
        Beeper music = new FancyMusic();
        Beeper magic = new MagicSparks();
        Engine12V engine12v = new Engine12V();
        Lambo lambo = new Lambo(magic, engine12v,alarmbeeper);
        Viper viper = new Viper(music, new FSDEngine(), alarmbeeper);
        Bus bus = new Bus22(music, engine12v,alarmbeeper);
        Gruzovik gruzovik = new KAMAZ (music, new FSDEngine(),alarmbeeper);

        lambo.checkSpeed();
        lambo.checkAlarm();

    }

}


/*
        ArrayList<Car> carlist= new ArrayList<Car>();
        carlist.add(viper);
        carlist.add(lambo);

        for (int i = 0 ; i <carlist.size(); i++){
             System.out.println(carlist.get(i).checkBeep());
        }
*/

