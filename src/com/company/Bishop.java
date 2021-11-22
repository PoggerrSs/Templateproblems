package com.company;

public class Bishop extends Piece {
    private boolean inCheck;
    private boolean hasCastled;

    //features for Bishop
    public Bishop(int row, char col, boolean isBlack) {
        super("Bishop", row, col, isBlack);
    }

    //symbol representing the bishop
    public char getSymbol() {
        return 'B';
    }
}
