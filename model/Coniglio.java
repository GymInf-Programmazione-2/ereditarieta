package model;
import model.Animale;

public class Coniglio extends Animale {
    private boolean nascosto;

    public void nascondi() {
        System.out.println("Sono nascosto");
        nascosto = true;
    }
}
