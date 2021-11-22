package com.company;

public class Rook extends Piece {
    private boolean inCheck;
    private Boolean hasCastled;

    //Rook features
    public Rook(int row, char col, boolean isBlack) {
        super("Rook", row, col, isBlack);
    }

    //symbol representing the rook
    public char getSymbol() {
        return 'R';
    }
}
