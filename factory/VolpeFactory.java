package factory;
import model3.Volpe;

public class VolpeFactory extends AnimaleFactory {
    @Override
    public Volpe produceAnimale() {
        return new Volpe();
    }
}
