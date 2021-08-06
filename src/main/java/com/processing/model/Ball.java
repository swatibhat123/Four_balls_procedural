package com.processing.model;

import com.processing.service.Shapes;
import processing.core.PApplet;

public class Ball implements Shapes {

    private float xCoordinate;
    private float yCoordinate;
    private final float diameter = 25;
    private int speed;

    public Ball(float xCoordinate, float yCoordinate, int speed) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    public float getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(float xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public float getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(float yCoordinate) {
        this.yCoordinate = yCoordinate;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        xCoordinate = xCoordinate + speed;
    }

    @Override
    public void draw(PApplet applet) {
        applet.ellipse(xCoordinate, yCoordinate, diameter, diameter);

    }
}
