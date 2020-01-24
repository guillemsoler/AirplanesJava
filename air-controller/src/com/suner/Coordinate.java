package com.suner;

public class Coordinate {
    private int X;
    private int Y;
    private int Z;

    public Coordinate(int x, int y, int z) {
        X = x;
        Y = y;
        Z = z;
    }
    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        Z = z;
    }

    @Override
    public String toString() {
        return Texts.getXTxt() + X +
                Texts.getYTxt() + Y +
                Texts.getZTxt() + Z;
    }
}
