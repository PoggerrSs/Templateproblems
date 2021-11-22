package com.company;

public class Knight extends Piece {
    private boolean inCheck;
    private boolean hasCastled;

    //features for Knight
    public Knight(int row, char col, boolean isBlack) {
        super("Knight", row, col, isBlack);
    }

    //symbol representing the Knight
    public char getSymbol() {
        return 'N';
    }
}
