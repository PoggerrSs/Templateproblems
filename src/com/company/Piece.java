package com.company;

public class Piece {
    public class Piece {
        private String name;
        private int row;
        private char col;
        private boolean isBlack;
        private boolean isCaptured;

        public Piece(String name, int row, char column, Boolean isBlack) {
            this.name = name;
            this.row = row;
            this.col = col;
            this.isBlack = isBlack;
            isCaptured = false;
        }

        public char getSymbol() {
            return 'X'; //should never appear on a valid board
        }
    }

}
