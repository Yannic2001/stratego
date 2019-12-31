package stratego;

import java.util.Random;

import stratego.Veld;

public class StrategoDemo {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] spelveld = new String[10][10];

        for (int r = 0; r < spelveld.length; r++) {
            for (int j = 0; j < spelveld.length; j++) {
                if (((r == 4 || r == 5) && (j == 2 || j == 3)) || ((j == 6 || j == 7) && (r == 4 || r == 5))) {
                    spelveld[r][j] = String.valueOf(99);
                } else {
                    spelveld[r][j] = String.valueOf(0);
                }
            }

//            Pion[] pionnen = {
//                    new Pion(1, "Spion", false, 1,false),
//                    new Pion(2, "Verkenner", false, 8,false),
//                    new Pion(3, "Mineur", false, 5,false),
//                    new Pion(4, "Sergeant", false, 4,false),
//                    new Pion(5, "Luitenant", false, 4,false),
//                    new Pion(6, "Kapitein", false, 4,false),
//                    new Pion(7, "Majoor", false, 3,false),
//                    new Pion(8, "Kolonel", false, 2,false),
//                    new Pion(9, "Generaal", false, 1,false),
//                    new Pion(10, "Maarschalk", false, 1,false),
//                    new Pion(11, "Vlag", false, 1,false),
//                    new Pion(12, "Bom", false, 6,false),
//            };


//            for (int i = 0; i < pionnen.length; i++) {
//                //System.out.println(pionnen[i]);
//                for (int j = 0; j < pionnen[i].getMaxKeer(); j++) {
//                    int rij = random.nextInt(10);
//                    int kolom = random.nextInt(4);
//                    System.out.printf("%5s", spelveld[i][j]);
//                    spelveld[rij][kolom] = pionnen[i].getWaarde();
//
//                }
//                System.out.println();
//            }
//
//            for (int i = 0; i < spelveld.length; i++) {
//                for (int j = 0; j < spelveld.length; j++) {
//                    System.out.printf("%5s", spelveld[i][j]);
//                }
//                System.out.println();
//            }

        }


// maken van het veld
//        String[][] vlak = new String[10][10];
//        for (int i = 0; i < vlak.length; i++) {
//            for (int j = 0; j < vlak.length; j++) {
//                if (((i == 4 || i == 5) && (j == 2 || j == 3)) || ((j == 6 || j == 7) && (i == 4 || i == 5))) {
//                    vlak[i][j] = "*";
//                } else {
//                    vlak[i][j] = "x";
//                }
//                System.out.print(vlak[i][j]);
//                //veld.standaardOpstelling(pionnen);
//
//            }
//            System.out.println();
//        }

    }}

