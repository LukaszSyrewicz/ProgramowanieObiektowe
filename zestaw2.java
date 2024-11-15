import java.util.Scanner;
public class zestaw2
{
    public static void main(String[] args)
    {
//        Okresl jaki bedzie typ zmiennej po operacji
        Object wynik = 23.0 + 76;
        Object wynik1 = 41 * 2.0 + 3;
        Object wynik2 = 5 - 33;
        Object wynik3 = 109 % 3;
        Object wynik4 = 50 / 2;
        Object wynik5 = 4 | 2;
        Object wynik6 = Math.pow(3, 5);
        Object wynik7 = 7 & 9;
        System.out.println(wynik.getClass());
        System.out.println(wynik1.getClass());
        System.out.println(wynik2.getClass());
        System.out.println(wynik3.getClass());
        System.out.println(wynik4.getClass());
        System.out.println(wynik5.getClass());
        System.out.println(wynik6.getClass());
        System.out.println(wynik7.getClass());

//        Okresl wynik dzialania a nastepnie zrzutuj na int
        double wynik8 = ((Math.sqrt(7)-1)/2)+ (Math.pow(3,3)%2);
        int wynik9 = (int)wynik8;
        System.out.println("Wynik w double: " + wynik8);
        System.out.println("Wynik w int: " + wynik9);

        double wynik10 = 1999/(4*4);
        int wynik11 = (int)wynik10;
        System.out.println("Wynik w double: " + wynik10);
        System.out.println("Wynik w int: " + wynik11);

        double wynik12 = (3 + Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        int wynik13 = (int)wynik12;
        System.out.println("Wynik w double: " + wynik12);
        System.out.println("Wynik w int: " + wynik13);

//        Napisz program ktory bedzie pobieral 2 slowa od uzytkownika i wypisywal je na ekranie
//        import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj slowo");
        String slowo = sc.nextLine();
        System.out.println("Podaj drugie slowo");
        String slowoDwa = sc.nextLine();
        System.out.println(slowo + " " + slowoDwa);

//        Napisz program który bedzie pobieral 2 liczby calkowite i zwracal sume,roznice,iloraz,iloczyn
        System.out.println("Podaj liczbe");
        int liczba = sc.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2 = sc.nextInt();
        int suma = liczba + liczba2;
        int roznica = liczba - liczba2;
        int iloczyn = liczba * liczba2;
        int iloraz = liczba / liczba2;
        System.out.println("Suma to: " + suma);
        System.out.println("Różnica to: " + roznica);
        System.out.println("Iloczyn to: " + iloczyn);
        System.out.println("Iloraz to: " + iloraz);

//        Napisz program ktory bedzie pobieral liczbe od uzytkownika i wypisywal ta liczbe:
        System.out.println("Podaj liczbe");
        double trzecia = sc.nextDouble();
//        Powiekszona o 140
        System.out.println(trzecia + 140);
//        Pomniejszona o 31
        System.out.println(trzecia - 31);
//        Pomnożona razy 7
        System.out.println(trzecia * 7);
//        Podzielona przez 13
        System.out.println(trzecia / 13);
//        Modulo 7
        System.out.println(trzecia % 7);
//        Czesc calkowita z dzielenia przez 4
        System.out.println((int)trzecia / 4);
//        Podniesiona do 45 potegi
        System.out.println((long)Math.pow(trzecia,45));
//        Iloraz bitowy z 67
        System.out.println((int)trzecia & 67);
        System.out.println((int)trzecia | 67);
        System.out.println((int)trzecia ^ 23);
        int z = ((int)trzecia << 5);
        System.out.println(Integer.toBinaryString(z));
        int y = ((int)trzecia >> 6);
        System.out.println(Integer.toBinaryString(z));
    }
}
