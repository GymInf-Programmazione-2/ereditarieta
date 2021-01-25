import model.Coniglio;
import model.Volpe;

public class Test {
    public static void main(String[] args) {
        Coniglio c = new Coniglio();
        Volpe v = new Volpe();
        v.setConsideraUvaAcerbi();
        c.nascondi();
    }
}
