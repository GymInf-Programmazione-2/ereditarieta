package model;
import model.Animale;

public class Volpe extends Animale {
    private boolean consideraUvaAcerbi;

    public void setConsideraUvaAcerbi() {
        System.out.println("Sono acerbi");
        consideraUvaAcerbi = true;
    }
}
