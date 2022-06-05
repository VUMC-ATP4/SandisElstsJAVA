package clasroomThree;

import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {

        String[] gadaLaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonacciNumber = {0, 1, 1, 2, 3, 5,8, 13, 21, 34};
        double[] randomSkaitli = {21.3, 34.54, 23,3};
        System.out.println("Masiva garums ir: " + gadaLaiki.length);

        System.out.println(gadaLaiki[0]);
        System.out.println(gadaLaiki[1]);
        System.out.println(gadaLaiki[2]);
        System.out.println(gadaLaiki[3]);
        System.out.println(fibonacciNumber[3]);

        gadaLaiki[1] = "Sandis";
        System.out.println(gadaLaiki[1]);

        //Masivs ar cilveku vardiem
        String[] cilveki = {"Juris", "Peteris", "Anna"};
        int[] vecums = {33, 40, 28};
        System.out.println("Vards: " + cilveki[0] + "\n" + "Vecums: " + vecums[0]);

        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        germanCars[3] = "Opel";

        System.out.println(germanCars[3]);

        //Ievadi skaitli
        int[] mansMasivs = generateArray();
        System.out.println(mansMasivs[1] + mansMasivs[2] + mansMasivs[0]);

        int[] majasdarbuIesniegumi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int i = 0;
        while (i<5){
            System.out.println("I ir :" + i);
            i++;
        }

        int q = 10;
        while (q>1){
            System.out.println("Q ir: " + q);
            q--; //tas pats kas q = q-1
        }

        int[] bingoLotoLaimigieSkaitli={3, 4, 35, 5, 7, 32};
        int counter = 0;
        while (counter < bingoLotoLaimigieSkaitli.length){
            System.out.println(bingoLotoLaimigieSkaitli[counter]);
            counter++;
//        }
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//
//        }

//        for (int j = 2; j <=10 ; j=j+2) {
//            System.out.println(j);
//        }
            for (int j = 0; j < gadaLaiki.length; j++) {
                System.out.println(gadaLaiki[j]);

            }




        }







    }

    static int sumPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti skaitli");
        int number = scanner.nextInt();
        int summa = 0;
        while (number >= 0){
            summa = summa + number;
            System.out.println("Ieraksti skaitli");
            number = scanner.nextInt();
        }
        System.out.println("Pozitīvo skaitļu summa ir: " + summa);
        return summa;
    }


    static int[] generateArray (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli");
        int b = scanner.nextInt();
        System.out.println("Ievadi treso skaitli");
        int c = scanner.nextInt();
        int[] skatiluMasivs = {a, b, c};
        return skatiluMasivs;
    }

    static void printCilveks(String[] humans, int[] ages,int index){
        System.out.println("Vārds:" + humans[index] + "\n" + "Vecums: " + ages[index]);
    }





}
