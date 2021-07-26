import processing.core.PApplet;

public class FourBalls extends PApplet {

    int speed = 1;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(480, 640);
    }

    @Override
    public void draw() {
        ellipse(speed, (float) (640 * 0.2), 10, 10);
        ellipse(speed * 2, (float) (640 * 0.4), 10, 10);
        ellipse(speed * 3, (float) (640 * 0.6), 10, 10);
        ellipse(speed * 4, (float) (640 * 0.8), 10, 10);
        speed++;
    }
}
