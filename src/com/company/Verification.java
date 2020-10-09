package com.company;

public class Verification {

    public static void TableauAffichage(int [][] Tableau){

        for (int Colonne = 0; Colonne < 9; Colonne ++){
            for (int Ligne = 0; Ligne < 9; Ligne ++){
                System.out.print(" " + Tableau[Colonne][Ligne] + " ");
            }
            System.out.println();
        }
    }

    public static boolean ContraintesLigneTOUT(int [][] Tableau){
        boolean Nombre = true;

        for (int j=0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                for (int nb = i + 1; nb < 9; nb++) {
                    if ((Tableau[j][i] == Tableau[j][nb]) && (Tableau[j][i] != 0) && (i != nb)) {
                        int FAUX = Tableau[j][i];
                        Nombre = false;
                        System.out.print(FAUX + " est déjà sur la ligne. ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println(Nombre);
        System.out.println();
        return Nombre;
    }

    public static boolean ContraintesColonneTOUT(int [][] Tableau){
        boolean Nombre = true;
        for (int i=0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int nb = j + 1; nb < 9; nb++) {
                    if ((Tableau[j][i] == Tableau[nb][i]) && (Tableau[j][i] != 0) && (j != nb)) {
                        int FAUX = Tableau[j][i];
                        Nombre = false;
                        System.out.print(FAUX + " est déjà sur la colonne. ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println(Nombre);
        System.out.println();
        return Nombre;
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
        return nombre;
    }
    public static boolean ContrainteSousSection1( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros1(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection2( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros2(Tableau, i)){
                isValid = true;
                System.out.println("ok");
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection3( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros3(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection4( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros4(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection5( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros5(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection6( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros6(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection7( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros7(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection8( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros8(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
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
        return nombre;
    }
    public static boolean ContrainteSousSection9( int[][] Tableau){
        boolean isValid = false;
        for(int i = 1; i< 10; i++){
            if(ContrainteSousSectionGros9(Tableau, i)){
                isValid = true;
            }
            else{
                return false;
            }
        }
        return isValid
                ;
    }
    public static boolean TouteLesSousSection(int[][] Tableau){
        boolean MegaBool = true;
        boolean MegaBool1;
        boolean MegaBool2;
        boolean MegaBool3;
        boolean MegaBool4;
        boolean MegaBool5;
        boolean MegaBool6;
        boolean MegaBool7;
        boolean MegaBool8;
        boolean MegaBool9;
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

    public static boolean TouteLesContraintes(int[][] Tableau){
        boolean LIGNE;
        boolean COLONNE;
        boolean SOUSSECTION;
        boolean TheBoolean = true;

        LIGNE = ContraintesLigneTOUT(Tableau);
        COLONNE = ContraintesColonneTOUT(Tableau);
        SOUSSECTION = TouteLesSousSection(Tableau);

        if (!(LIGNE)||!(COLONNE)||!(SOUSSECTION)){
            TheBoolean = false;
        }
        System.out.println(TheBoolean);
        return TheBoolean;
    }



    public static void main(String[] args) {

            int[][] boardEasy = {
                {4, 0, 0, 1, 0, 2, 6, 8, 0},
                {1, 0, 0, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 5, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0}
            };


            TableauAffichage(boardEasy);

            TouteLesContraintes(boardEasy);




    }
}
