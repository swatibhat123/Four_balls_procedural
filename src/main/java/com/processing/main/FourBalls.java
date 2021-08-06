package com.processing.main;

import com.processing.model.Ball;
import com.processing.model.Box;
import com.processing.service.Shapes;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourBalls extends PApplet {

    public static final int WIDTH = 480;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 10;
    public static final int SPEED1 = 1;
    public static final int SPEED2 = 2;
    public static final int SPEED3 = 3;
    public static final int SPEED4 = 4;
    private static final int SPEED5 = 5;
    public static final int X_COORDINATE = 0;


    private List<Shapes> shapes = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("com.processing.FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Ball ball1 = new Ball(X_COORDINATE, HEIGHT * 1 / 6, SPEED1);
        Ball ball2 = new Ball(X_COORDINATE, HEIGHT * 2 / 6, SPEED2);
        Ball ball3 = new Ball(X_COORDINATE, HEIGHT * 3 / 6, SPEED3);
        Ball ball4 = new Ball(X_COORDINATE, HEIGHT * 4 / 6, SPEED4);
        Box box1 = new Box(X_COORDINATE, HEIGHT * 5 / 6, SPEED5);

        shapes = Arrays.asList(ball1, ball2, ball3, ball4, box1);
    }

    @Override
    public void draw() {

        shapes.forEach(shape -> {
            shape.move();
            shape.draw(this);
        });

    }


}
