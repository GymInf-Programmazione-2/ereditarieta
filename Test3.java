import model3.Animale;
import factory.AnimaleFactory;
import factory.ConiglioFactory;
import factory.VolpeFactory;

public class Test3 {
    public static void main(String[] args) {
        AnimaleFactory af = new ConiglioFactory();
        AnimaleFactory vf = new VolpeFactory();

        Animale c = af.produceAnimale();
        Animale v = vf.produceAnimale();

        System.out.println("c: " +  c.printId());
        System.out.println("v: " + v.printId());
    }
}
