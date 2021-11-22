package com.company;

public class King {
    public class King extends Piece {
        private boolean inCheck;
        private boolean hasCastled; //for lols, not planning to implement

        public King(int row, char col, boolean isBlack) {
            super("King", row, col, isBlack);
        }

        public char getSymbol() {
            return 'k';
        }


    }
}
