package com.company;

public class StoryTrois {

    public static void TableauAffichage(int[][] Tableau) {

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                System.out.print(" " + Tableau[row][column]);
            }
            System.out.println();
        }
    }

    public static boolean ContrainteLigne(int[][] Tableau) {
        boolean nombre = true;
        for (int i = 0; i < 9; i++) {
            for (int nb = i + 1; nb < 9; nb++) {
                if ((Tableau[0][i] == Tableau[0][nb]) && (Tableau[0][i] != 0) && (i != nb)) {
                    int Faux = Tableau[0][i];
                    nombre = false;
                }
            }
        }
        System.out.println();
        System.out.println("La ligne est : " + nombre);
        return nombre;
    }
    public static boolean ContrainteColonne(int[][] Tableau) {
        boolean nombre=true;
        for(int j=0;j < 9;j++){
            for(int nb=j+1;nb < 9; nb++){
                if((Tableau[j][0] == Tableau[nb][0]) && (Tableau[j][0] !=0) && (j != nb)){
                    int Faux = Tableau[j][0];
                    nombre = false;
                }
            }
        }
        System.out.println();
        System.out.println("la Cologne est : " + nombre);
        return nombre;
    }
    public static boolean ContrainteSousSection(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(Tableau[i][j] == nb ) {
                    compteur++;

                }
            }
        }
        if(compteur > 1){
            nombre=false;
        }
        System.out.println();
        System.out.println("la sous-section est : " + nombre);
        return nombre;
    }

    public static boolean ContrainteSousSection2( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSection(Tableau, i)){
                isValid = true;
            }
        }
        return isValid
                ;
    }


    public static void ContainteGrille(int[][] Tableau) {
        boolean nombre = true;
        for (int i = 0; i < 8; i++){
        }
    }

    public static void main(String[] args) {
        int[][] boardEasy = {
                {4, 0, 0, 1, 0, 2, 6, 8, 0},
                {4, 0, 0, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0},
        };
        TableauAffichage(boardEasy);
        //ContrainteLigne(boardEasy);
        //ContrainteColonne(boardEasy);
        ContrainteSousSection2(boardEasy);
    }
}