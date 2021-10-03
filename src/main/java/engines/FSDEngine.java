package engines;

public class FSDEngine implements Engine {

    public String FSDprepare(){
        return "Prepared";
    }
    @Override
    public String makeRotation() {
        return "60 ly/s";
    }
}
