package com.company;

public class Queen extends Piece{
    private boolean inCheck;
    private boolean hasCastled;

    //features for Queen
    public Queen(int row, char col, boolean isBlack) {
        super("Queen", row, col, isBlack);
    }

    //Symbol representing the Queen
    public char getSymbol() {
        return 'Q';
    }
}
