package homework;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //1.uzd
        int x = 1;
        if (x > 0) {
            System.out.println(false);
        } else if (x > 5 && x <= 10) {
            System.out.println(true);
        } else if (!(x > 0) || x == 5 || x > 10) {
            System.out.println(true);
        } else if (x == 0 || x == 10) {
            System.out.println(false);
        } else if (x * x > 10) {
            System.out.println(true);
        }

        //2.uzd
        int month = 56;
        switch (month){
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis " + " nav definēts");
        }
        //3.uzd

        int a=4;
        int b=5;
        int c=48;

        if (a>b && a>c)
        {
            System.out.println(a + " ir lielākais skaitlis");
        }
        else if (b>a && b>c) {
            System.out.println(b + " ir lielākais skaitlis");
        } else if (c>a && c>b) {
            System.out.println(c + " ir lielākais skaitlis");

        }
        // 4.uzd

        luksafors("sarkana");

        //5.uzd
        printBussinessCardTwo();
        printBussinessCardTwo();


        // 6.uzd
        printBussinessCard("Sandis", "Elsts", "123456", "1990");
        printBussinessCard("Test", "Surename", "1234433", "1994");
        printBussinessCard("Name", "Test", "12345246", "1997");

        //7.uzd
        System.out.println(summa(5,4));

        //8.uzd
        System.out.println(avarage(3,10,6));


    }
    public static void luksafors(String krasa){
        if (krasa.equals("sarkana")){
            System.out.println("Stop. Stāvi!");
        } else if(krasa.equals("zala")){
            System.out.println("Ej!");
        } else if (krasa.equals("dzeltena")){
            System.out.println("Uzmanību, gatavojies");
        } else {
            System.out.println("Krāsa nav definēta");
        }
        }



    static void printBussinessCard (String name, String surname, String telephone, String dateOfBirth){
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds " + name);
        System.out.println("Uzvārds " + surname);
        System.out.println("Telefons " + telephone);
        System.out.println("Dzim. dat. " + dateOfBirth);
    }

    static void printBussinessCardTwo () {
        String name = "Test";
        String surname = "Testy";
        String telephone = "73737737373";
        int dateOfBirth = 1234;
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds " + name);
        System.out.println("Uzvārds " + surname);
        System.out.println("Telefons " + telephone);
        System.out.println("Dzim. dat. " + dateOfBirth);
    }

    static int summa (int a, int b) {
        return a + b;

        }
    static double avarage (double x, double y,double q ){
        return (x + y + q)/3;
        }
    }
