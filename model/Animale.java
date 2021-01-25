package model;

public class Animale {
    private int pos_x;
    private int pos_y;
    public void setX(int x) {
        pos_x = x;
    }
    public void setY(int y) {
        pos_y = y;
    }

    public void muovi(int x, int y) {
        pos_x += x;
        pos_y += y;
    }
}
