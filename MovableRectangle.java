package com.company;

import java.util.Objects;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed1, int ySpeed1, int xSpeed2, int ySpeed2) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "left=" + topLeft +
                ", right=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void Check() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed()) {
            System.out.println("Точки имеют одну и ту же скорость");
        }
        else {
            System.out.println("Точки имеют разную скорость");
        }
    }
}
