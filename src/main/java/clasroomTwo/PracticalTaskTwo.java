package clasroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {

    public static void main(String[] args) {
        //Tips  Nosaukums  Deklarācija
//        Scanner scanner = new Scanner (System.in);
//        int vecums;
//        boolean drīkstBalsot = false;
//        System.out.println("Paskaties cilvēka pasē?");
//        vecums = scanner.nextInt();
//        if (vecums>=18){
//            drīkstBalsot = true;
//        }
//        System.out.println("Vai drīkst balsot " + drīkstBalsot);

        int x = 10;
        int y = 20;

        if (y>x && x>5){
            System.out.println(true);
        }

//        int skaitlis = 5;
//
//        if (skaitlis>0){
//            System.out.println(skaitlis + " Skaitlis is pozitīvs!");
//        } else if (skaitlis<0){
//            System.out.println(skaitlis + " Skaitlis is negatīvs");
//        }else System.out.println(skaitlis + " ir Nulle");

        int skaitlis = 5;

        if (skaitlis>0){
            System.out.println(skaitlis + " Skaitlis is pozitīvs!");
        } else if (skaitlis<0){
            System.out.println(skaitlis + " Skaitlis is negatīvs");
        }else System.out.println(skaitlis + " ir Nulle");

//        int skaitlis = 15;
//
//        if(skaitlis == 10){
//            System.out.println(skaitlis +" ir 10");
//        }else if (skaitlis == 15){
//            System.out.println(skaitlis + " ir 15");
//        }else if (skaitlis == 20){
//            System.out.println(skaitlis + " ir 20");
//        }else{
//            System.out.println(skaitlis + " ir nezināms");
//        }








//        System.out.println("Ievadi savu vārdu");
////        String vards = scanner.nextLine();
////        System.out.println("Labdien " + vards + "!");
////        System.out.println("Esi sveicināts kalkulātura programmā");
//
//
////        int a;
////        int b;
////
////        System.out.println("Ievadi skaitli a");
////        a = scanner.nextInt();
////        System.out.println("Ievadi skaitli b");
////        b = scanner.nextInt();
////        System.out.println(a > b);
//        System.out.println("Šeit jābūt nepatiesam  " + (5>10));
//        System.out.println("Šeit jābūt patiesam  " + (5<10));
//        System.out.println(6==5);
//        System.out.println(6!=5);
//        System.out.println("Šeit jābūt nepatiesam: " + (5 > 10));
//        System.out.println((5 < 10));
//        System.out.println(6 == 5); //false
//        System.out.println(5 == 5);   //true
//        System.out.println(6 != 5); //true
//        System.out.println(5 != 5); //false
//        int vecums = 18;
//        System.out.println(vecums >= 18);
//        int bernaVecums = 5;
//        System.out.println(bernaVecums<=5);
//        System.out.println(vecums>bernaVecums);
//        boolean isEligibleToVote = vecums >= 18;
//        System.out.println("Vai cilvēks drīkst balsot ? " + isEligibleToVote);
//
//        String name = "Juris";
//        String nameTwo = "Juris";
//        System.out.println(name.equals(nameTwo));
//
//        System.out.println("Ievadi X");
//        int x = scanner.nextInt();
//        boolean vaiIrPatiess = (x< 5 && x>10);
//        System.out.println(vaiIrPatiess);
//
//
//



//        int summa = a + b;
//        System.out.println(String.format("%s, %s + %s = %s",vards , a, b, summa));













//        System.out.println("Šī ir otrā Javas lekcija");
//        String teksts;
//        String name = "Sandis";
//        teksts = String.format("Mani sauc %s", name);
//
//        System.out.println(teksts);
//
//        //Divi skaitļi aiz komata piem.
//        double a = 100.25;
//        int b = 10;
//
//        //System.out.println("a-b = " + (b / a));
//        System.out.println(String.format("%.2f",(b / a)));
//
//
//        //Piemērs rakstībai bez stringiem
//        String namme = "Juris";
//        String surname = "Kreilis";
//        String role = "Pasniedzējs";
//        double videjaAtzime = 7.3214;
//
//        String concatTeikums = "Mani sauc " + namme + " Mans uzvārds ir " + surname + " Es esmu " + role;
//        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f",namme,surname,role,videjaAtzime);
//
//        System.out.println(teikums);
//        System.out.println(concatTeikums);

        int month = 2;
        switch (month){
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis " + " nav definēts");
        }

        int q = 10;
            if(q>0){
                System.out.println("Skaitlis ir lielāks par nulli");
            }

        int cilvekaVecums=65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums=='V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if(dzimums=='S' && cilvekaVecums>=60){
            drikstDoties=true;
        }

        System.out.println("Cilveks drikst doties pensija " + drikstDoties);






    }
}
