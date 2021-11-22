package com.company;

public class Pawns extends Piece {
    private boolean inCheck;
    private boolean hasCastled;

    //Pawns features
    public Pawns(int row, char col, boolean isBlack) {
        super("Pawns", row, col, isBlack);
    }

    //Symbol representing the Pawns
    public char getSymbol() {
        return 'P';
    }
}
