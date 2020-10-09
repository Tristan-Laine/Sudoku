package com.company;

public class Story6 {


    public static void backtracing(int[][] Tableau) {

        for (int j = 0; j < 9; j++) {       //init le j (colonne)
            for (int i = 0; i < 9; i++) {    //init le i (ligne)
                if (Tableau[i][j] == 0) {  //si le nombre du tableau = 0
                    boolean bol = false;
                    while (bol == false) {   //alors le nombre du tableau prend pour valeur 1
                    }
                    //verifer le sudoku
                    //if (sudoku valide)
                    //
                }
            }


        }


    }




    public static void main(String[] args) {

        int[][] boardEasy = {
                {4, 0, 0, 1, 0, 2, 6, 8, 0},
                {1, 0, 0, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0}
        };



    }
}
