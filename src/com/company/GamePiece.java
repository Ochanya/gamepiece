package com.company;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public GamePiece(String name, String color) {
        positionX = 0;
        positionY = 0;
        frozen = false;
        this.name = name;
        this.color = color;
    }

    public void moveIfPossible(int x, int y) {
        if (frozen != true) {
            positionX = x;
            positionY = y;
            System.out.println("x-coordinate is "+positionX+ " and y-coordinate is "+positionY +" for "+name+"." );

        }else{
            System.out.println("x-coordinate is "+positionX+ " and y-coordinate is "+positionY +" for "+name+"." );

        }
    }

    public void freeze(){
        frozen= true;
        System.out.println("It's "+frozen+" that the "+ name +" is frozen.");

    }
    public void unfreeze(){
        frozen= false;
        System.out.println("It's "+frozen+" that the "+ name +" is frozen.");

    }
}
