import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class FourBalls extends PApplet {

    public static final int WIDTH = 480;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 10;
    public static final int TOTAL_NUMBER_OF_BALLS = 4;
    private int speed = 1;
    private List<Integer> speedRateOfBalls = Arrays.asList(1, 2, 3, 4);
    private List<Float> heightRatioFromTop = Arrays.asList(0.2F, 0.4F, 0.6F, 0.8F);

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
            drawCircle(getXCoordinate(speed, speedRateOfBalls.get(index)), getYCoordinate(heightRatioFromTop.get(index)));
        }
        speed++;
    }

    private void drawCircle(float xCoordinate, float yCoordinate) {
        ellipse(xCoordinate, yCoordinate, DIAMETER, DIAMETER);
    }

    private float getYCoordinate(float heightRatioFromTop) {
        return HEIGHT * heightRatioFromTop;
    }

    private int getXCoordinate(int speed, int speedRate) {
        return speed * speedRate;
    }
}
