package com.company;

public class Test {
    public static void main(String[] args) {
        MovableRectangle a = new MovableRectangle(4, 2, 2, 3, 5, 3, 5, 3);
        System.out.println(a.toString());
        a.Check();
        MovableRectangle b = new MovableRectangle(4, 5, 2, 3, 4, 4, 5, 3);
        System.out.println(b.toString());
        b.Check();
    }
}
