package com.company;

public class StoryTroisBis {
    static int compt = 0;

    public static void TableauAffichage(int[][] Tableau) {

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                System.out.print(" " + Tableau[row][column]);
            }
            System.out.println();
        }
        compt++;
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
        compt++;
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
        compt++;
        return nombre;
    }
    public static boolean ContrainteSousSectionGros1(int[][] Tableau, int nb) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection1( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros1(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }
    public static boolean ContrainteSousSectionGros2(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 0; i < 3 ; i++) {
            for (int j = 3; j < 6; j++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection2( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros2(Tableau, i)){
                isValid = true;
                System.out.println("ok");
            }
        }
        compt++;
        return isValid;
    }
    public static boolean ContrainteSousSectionGros3(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection3( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros3(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }
    public static boolean ContrainteSousSectionGros4(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 3; i < 6; i++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection4( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros4(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }
    public static boolean ContrainteSousSectionGros5(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 6; i < 9; i++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection5( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros5(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }
    public static boolean ContrainteSousSectionGros6(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection6( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros6(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }
    public static boolean ContrainteSousSectionGros7(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection7( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros7(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }
    public static boolean ContrainteSousSectionGros8(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection8( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros8(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }
    public static boolean ContrainteSousSectionGros9(int[][] Tableau, int nb) {
        boolean nombre = true;
        int compteur = 0;
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
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
        compt++;
        return nombre;
    }

    public static boolean ContrainteSousSection9( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros9(Tableau, i)){
                isValid = true;
            }
        }
        compt++;
        return isValid
                ;
    }


    public static void ContainteGrille(int[][] Tableau) {
        boolean nombre = true;
        for (int i = 0; i < 8; i++){
        }
    }

    public static boolean TouteLesSousSection(int[][] Tableau){
        boolean MegaBool = true;
        boolean MegaBool1 = true;
        boolean MegaBool2 = true;
        boolean MegaBool3 = true;
        boolean MegaBool4 = true;
        boolean MegaBool5 = true;
        boolean MegaBool6 = true;
        boolean MegaBool7 = true;
        boolean MegaBool8 = true;
        boolean MegaBool9 = true;
        MegaBool1 = ContrainteSousSection1(Tableau);
        MegaBool2 = ContrainteSousSection2(Tableau);
        MegaBool3 = ContrainteSousSection3(Tableau);
        MegaBool4 = ContrainteSousSection4(Tableau);
        MegaBool5 = ContrainteSousSection5(Tableau);
        MegaBool6 = ContrainteSousSection6(Tableau);
        MegaBool7 = ContrainteSousSection7(Tableau);
        MegaBool8 = ContrainteSousSection8(Tableau);
        MegaBool9 = ContrainteSousSection9(Tableau);

        if (!(MegaBool1)||!(MegaBool2)||!(MegaBool3)||!(MegaBool4)||!(MegaBool5)||!(MegaBool6)||!(MegaBool7)||!(MegaBool8)||!(MegaBool9)){
            MegaBool = false;
        }
        System.out.println(MegaBool);
        return MegaBool;
    }



    public static void main(String[] args) {
        int[][] boardEasy = {
                {4, 4, 0, 1, 0, 2, 6, 8, 0},
                {1, 0, 0, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0}
        };
        TableauAffichage(boardEasy);
        //ContrainteLigne(boardEasy);
        //ContrainteColonne(boardEasy);
        /*ContrainteSousSection1(boardEasy);
        ContrainteSousSection2(boardEasy);
        ContrainteSousSection3(boardEasy);
        ContrainteSousSection4(boardEasy);
        ContrainteSousSection5(boardEasy);
        ContrainteSousSection6(boardEasy);
        ContrainteSousSection7(boardEasy);
        ContrainteSousSection8(boardEasy);
        ContrainteSousSection9(boardEasy);*/

        TouteLesSousSection(boardEasy);
    }
}