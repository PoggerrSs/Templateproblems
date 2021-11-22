package com.company;

public class Board {
    public class Board {
        public Piece[][] grid;

        public Board() {
            grid = new Piece[8][8];
        }

        public void display() {
            //print out the Board
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(" "); //padding
                    if (grid[i][j] != null) {
                        //display piece
                    } else {
                        System.out.print(".");
                    }
                    System.out.print(" "); //padding
                }
                System.out.println();
            }
        }

        public void placePiece(Piece p, int row, char col) {
            grid[row][columnNumber] = p;

        }
    }
}
