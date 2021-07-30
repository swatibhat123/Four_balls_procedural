package model;

public class CoordinateSystem {

    private float xCoordinate;
    private float yCoordinate;

    private static int ratio = 0;

    public CoordinateSystem(int x, int height, int items) {
        ++ratio;
        this.xCoordinate = setXCoordinate(x, items);
        this.yCoordinate = setYCoordinate(height, items);
    }

    private float setXCoordinate(int x, int items) {
        return x * getRatio(items);
    }

    private float setYCoordinate(int height, int items) {
        float heightRatio = 0.2F;
        return height * getRatio(items) * heightRatio;
    }

    public float getXCoordinate() {
        return xCoordinate;
    }

    public float getYCoordinate() {
        return yCoordinate;
    }

    private float getRatio(int items) {
        return ratio % items != 0 ? ratio % items : items;
    }

}
