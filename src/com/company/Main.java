package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece gamePiece = new GamePiece( "elf", "green");
        gamePiece.freeze();
        gamePiece.unfreeze();
        gamePiece.moveIfPossible(50, 100);


    }
}
