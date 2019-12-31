package stratego;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class enemy {
    public static void main(String[] args) {
        //zonder github

        Pion[] pionnen = {
                new Pion(1, "Spion", false, 1),
                new Pion(2, "Verkenner", false, 8),
                new Pion(3, "Mineur", false, 5),
                new Pion(4, "Sergeant", false, 4),
                new Pion(5, "Luitenant", false, 4),
                new Pion(6, "Kapitein", false, 4),
                new Pion(7, "Majoor", false, 3),
                new Pion(8, "Kolonel", false, 2),
                new Pion(9, "Generaal", false, 1),
                new Pion(10, "Maarschalk", false, 1),
                new Pion(11, "Vlag", false, 1),
                new Pion(12, "Bom", false, 6),
        };

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int x, y, naarx, naary, rand, aantalkeer = 0, aantal = 0;
        int vijandscore = 0, spelerscore = 0;
        int[][] spelveld = new int[10][10];
        int[][] vijand = new int[10][10];

        //enemy speelveld invullen
            for (int teller = 0; teller < 12; teller++) {
                for (int p = 0; p < pionnen[teller].getMaxKeer(); p++) {
                    do{
                    x = random.nextInt(4) ;
                    y = random.nextInt(10) ;
                    }while(vijand[x][y]!=0);
                    vijand[x][y] = pionnen[teller].getWaarde();
                }
            }


        //veld opvullen en tonen
        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (((i == 4 || i == 5) && (j == 2 || j == 3)) || ((j == 6 || j == 7) && (i == 4 || i == 5))) {
                    spelveld[i][j] = 99;
                    vijand[i][j] = 99;
                } else {
                    spelveld[i][j] = 0;
                    vijand[i][j] = 0;
                }
            }
        }


//        //spelers veld laten invullen
//        for (int teller = 0; teller < 12; teller++) {
//            for (int p = 0; p < pionnen[teller].getMaxKeer(); p++) {
//                System.out.printf("Op welke coordinaten wil je %s %d plaatsen?\n", pionnen[teller].getNaam(), p + 1);
//                System.out.printf("Welke x coordinaat wil je (7-10)?\n");
//                x = keyboard.nextInt() - 1;
//                System.out.printf("Welke y coordinaat wil je (1-10)?\n");
//                y = keyboard.nextInt() - 1;
//                if (spelveld[x][y] == 0) {
//                    spelveld[x][y] = pionnen[teller].getWaarde();
//                } else {
//                    System.out.println("fout");
//                }
//            }
//        }
        //tijdelijk spelers veld opvullen
        for (int teller = 0; teller < 12; teller++) {
            for (int p = 0; p < pionnen[teller].getMaxKeer(); p++) {
                do{
                    x = random.nextInt(4)+6 ;
                    y = random.nextInt(10) ;


                }while(spelveld[x][y]!=0);
                spelveld[x][y] = pionnen[teller].getWaarde();
            }
        }


     //volledig speelveld tonen
        for (int r = 0; r < 10; r++) {
            for (int k = 0; k < 10; k++) {
                if (spelveld[r][k]==11){
                System.out.printf("%5c", 'V');}
//                else if (spelveld[r][k]==0 || spelveld[r][k]==99){
//                    System.out.printf("%5d", vijand[r][k]);}
                else if(spelveld[r][k]==12){
                    System.out.printf("%5c",'B');}
                else if(spelveld[r][k]==0 && vijand[r][k]==0){
                    System.out.printf("%5c", ' ');}
                else if (vijand[r][k]==0){
                    System.out.printf("%5d", spelveld[r][k]);}
                else if (vijand[r][k]>0 && vijand[r][k]<99){
                    System.out.printf("%5c", 'x');}
                else if(spelveld[r][k]==99){
                    System.out.printf("%5c", '*');
                }

            }
            System.out.println();
        }

     //enemy score optellen
     for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 10; j++) {
             vijandscore += vijand[i][j];
         }
     }
     System.out.println("de vijandelijke score is: " + vijandscore);



     //spelers score optellen
     for (int i = 6; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
             spelerscore += spelveld[i][j];
         }
     }
     System.out.println("de spelers score is: " + spelerscore);



     //de pionen verplaatsen
         System.out.printf("welke pion wil je verplaatsen?\n");
         System.out.printf("Welke x coordinaat?\n");
         x = keyboard.nextInt() - 1;
         System.out.printf("Welke y coordinaat?\n");
         y = keyboard.nextInt() - 1;
         System.out.printf("Naar welke positie wil je deze verplaatsen?\n");
         System.out.printf("Welke x coordinaat?\n");
         naarx = keyboard.nextInt() - 1;
         System.out.printf("Welke y coordinaat?\n");
         naary = keyboard.nextInt() - 1;



     if (vijand[naarx][naary] == 0) {
         spelveld[naarx][naary] = spelveld[x][y];
         spelveld[x][y] = 0;
     } else if (vijand[naarx][naary] == 99) {
         System.out.printf("Deze postitie is foutief, gelieve een andere postie te kiezen.\n");
     } else if (spelveld[x][y] < vijand[naarx][naary]) {
         System.out.printf("Je bent dood!\n");
         spelveld[x][y] = 0;
     } else if (spelveld[x][y] > vijand[naarx][naary]) {
         System.out.printf("je bent gewonnen!\n");
         spelveld[naarx][naary] = spelveld[x][y];
         spelveld[x][y] = 0;
         vijand[naarx][naary] =0;
     }

     //volledig speelveld tonen
        for (int r = 0; r < 10; r++) {
            for (int k = 0; k < 10; k++) {
                if (spelveld[r][k]==0 || spelveld[r][k]==99){
                    System.out.printf("%5d", vijand[r][k]);}
                else if (vijand[r][k]==0 || spelveld[r][k]==99){
                    System.out.printf("%5d", spelveld[r][k]);}
            }
            System.out.println();
        }
}}
