import java.util.Scanner;
public class PO1 {
    public static void main(String[] args) {
//        Object wynik = 23.0 + 76;
//        Object wynik1 = 41 * 2.0 + 3;
//        Object wynik2 = 5 - 33;
//        Object wynik3 = 109 % 3;
//        Object wynik4 = 50 / 2;
//        Object wynik5 = 4 | 2;
//        Object wynik6 = Math.pow(3, 5);
//        Object wynik7 = 7 & 9;
//
//        System.out.println(wynik.getClass());
//        System.out.println(wynik1.getClass());
//        System.out.println(wynik2.getClass());
//        System.out.println(wynik3.getClass());
//        System.out.println(wynik4.getClass());
//        System.out.println(wynik5.getClass());
//        System.out.println(wynik6.getClass());
//        System.out.println(wynik7.getClass());
//
//
//        double wynik8 = ((Math.sqrt(7) - 1) / 2) + Math.pow(3, 3) % 2;
//        int wynikInt = (int) wynik8;
//        System.out.println("Wynik wyrażenia jako int: " + wynikInt);
//        double wynik9 = 1999/(4*4);
//        int wynikInt = (int) wynik9;
//        System.out.println("Wynik wyrażenia jako int: " + wynikInt);
//        double wynikPierwszy= (3 + Math.sqrt(3))/((Math.sqrt(5)/2/3)) + 1;
//        int wynikInt = (int) wynikPierwszy;
//        System.out.println(wynikInt);
        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj 3 liczby");
//        //13/6/4
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double d = a%b%c;
//        int wynikInt = (int) d;
//        System.out.println(wynikInt);
//        System.out.println("Podaj imie");
//        String imie = sc.nextLine();
//        System.out.println("Podaj nazwisko");
//        String nazwisko = sc.nextLine();
//        int a = imie.length();
//        int b = nazwisko.length();
//        double wynik = (a%b+1)/Math.pow(2,1/4);
//        int wynikInt = (int) wynik;
//        System.out.println(wynikInt);
//
//        System.out.println("Podaj imie");
//        String imie = sc.nextLine();
//        System.out.println("Podaj nazwisko");
//        String nazwisko = sc.nextLine();
//        System.out.println("Imie: " + imie + " nazwisko: " + nazwisko);
//        System.out.println("Podaj pierwsza liczbe");
//        double pierwsza = sc.nextDouble();
//        System.out.println("Podaj druga liczbe");
//        double druga = sc.nextDouble();
//        System.out.println("Podane liczby to: " + pierwsza + "Druga " + druga);
//        double wynikDodawania = pierwsza + druga;
//        double wynikOdejmowania = pierwsza - druga;
//        double wynikMnozenia = pierwsza * druga;
//        double wynikDzielenia = pierwsza / druga;
//        System.out.println("Wynik dodawania: " + wynikDodawania);
//        System.out.println("Wydnik odejmowania: " + wynikOdejmowania);
//        System.out.println("Wynik mnozenia: " + wynikMnozenia);
//        System.out.println("Wynik dzielenia: " + wynikDzielenia);

        System.out.println("Podaj liczbe");
        double trzecia = sc.nextDouble();
        System.out.println(trzecia + 140);
        System.out.println(trzecia - 31);
        System.out.println(trzecia * 7);
        System.out.println(trzecia / 13);
        System.out.println(trzecia % 7);
        System.out.println((int)trzecia / 4);
        System.out.println((long)Math.pow(trzecia,45));
        System.out.println((int)trzecia & 67);
        System.out.println((int)trzecia | 67);
        System.out.println((int)trzecia ^ 23);
        int z = ((int)trzecia << 5);
        System.out.println(Integer.toBinaryString(z));
        int y = ((int)trzecia >> 6);
        System.out.println(Integer.toBinaryString(z));




    }

}
