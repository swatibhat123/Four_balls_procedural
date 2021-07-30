package model;

public class CoordinateSystem {

    private float xCoordinate;
    private float yCoordinate;

    private static int itemNumber = 0;

    public CoordinateSystem(int x, int height, int items) {
        ++itemNumber;
        this.xCoordinate = setXCoordinate(x, items);
        this.yCoordinate = setYCoordinate(height, items);
    }

    private float setXCoordinate(int x, int items) {
        return x * getItemNumber(items);
    }

    private float getItemNumber(int items) {
        return itemNumber % items != 0  ? itemNumber % items : items;
    }

    private float setYCoordinate(int height, int items) {
        float heightRatio = 0.2F;
        return height * getItemNumber(items) * heightRatio;
    }

    public float getXCoordinate() {
        return xCoordinate;
    }

    public float getYCoordinate() {
        return yCoordinate;
    }


}
