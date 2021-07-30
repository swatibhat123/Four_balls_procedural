import model.CoordinateSystem;
import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 480;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 10;
    public static final int TOTAL_NUMBER_OF_BALLS = 4;

    private int x = 1;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int index = 0; index < TOTAL_NUMBER_OF_BALLS; index++) {
            CoordinateSystem coordinates = new CoordinateSystem(x, HEIGHT, TOTAL_NUMBER_OF_BALLS);
            drawCircle(coordinates);
        }
        x++;
    }

    public void drawCircle(CoordinateSystem coordinates) {
        ellipse(coordinates.getXCoordinate(), coordinates.getYCoordinate(), DIAMETER, DIAMETER);
    }

}
