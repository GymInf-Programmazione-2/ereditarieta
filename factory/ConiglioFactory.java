package factory;
import model3.Coniglio;

public class ConiglioFactory extends AnimaleFactory {
    @Override
    public Coniglio produceAnimale() {
        return new Coniglio();
    }
}
