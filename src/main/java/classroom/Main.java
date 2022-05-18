package classroom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mainigie");

        //EN:Integer - LV: Vesels skaitlis
        int x = 5;
        int y = 10;

        System.out.println("x ir vienads ar:");
        System.out.println(x);
        System.out.println("y ir vienads ar:");
        System.out.println(y);
        System.out.println("x+y ir vienads ar:");
        System.out.println(x+y);

//        Vardi un teikumi JAVA valoda tiek saglabati mainiga tipa "string"
//        [Mainiga tips] [mainiga nosaukums] = [vertiba]

        String dogName = "Reksis";

//        Veseli skaitli tiek defineti as mainiga tipu "int"
        int dogAge = 10;

//         dalskaitli  tiek defineti as mainiga tipu "double" vai "float"
        double dogWeight = 15.5;

        String dogBreed = "VAS";

//        Ja ne jautajums tiek definets ar mainiga tipu "boolean"
        boolean isHungry = true;

//        vienu simbolu define ar mainiga tipu "char"
        char dogGender = 'M';

        char currency = '$';
        int dogPrice = 100;

        System.out.println("Suna vards: " + dogName);
        System.out.println("Suna vecums: " + dogAge);
        System.out.println("Suna svars: " + dogWeight);
        System.out.println("Suna skirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis: " + isHungry);
        System.out.println("Dzimums: " + dogGender);
        System.out.println("Suna kuceni maksa: " + dogPrice + currency);

        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        System.out.println(pirmaisSkaitlis + "+" + otraisSkaitlis + "=" + summa);

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;

        System.out.println("starpiba " + starpiba);
        System.out.println("summa " + summa);
        System.out.println("dalijums " + dalijums);
        System.out.println("reizinajums " + reizinajums);
        System.out.println("atlikums " + atlikums);











    }
}
