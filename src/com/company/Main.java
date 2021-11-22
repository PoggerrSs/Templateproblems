package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Chess!");
        Board chessBoard = new Board();
        King whiteKing = new King(1, 'e', false);
        chessBoard.grid[4] [7] = whiteKing;
        chessBoard.display();
    }
}