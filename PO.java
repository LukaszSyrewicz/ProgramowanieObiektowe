import java.time.LocalDate;
import java.time.LocalTime;
public class PO {
    public static void main(String[] args) {
        String imie = "Łukasz";
        String nazwisko = "Syrewicz";
        System.out.println("imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        int ilosc_liter_imie = imie.length();
        int ilosc_liter_nazwisko = nazwisko.length();
        System.out.println("ilosc liter w imieniu: " + ilosc_liter_imie);
        System.out.println("ilosc liter w nazwisku: " + ilosc_liter_nazwisko);
        System.out.println("Ala " + "ma " + "kota");
        String tekst = "Ala ma kota";
        String wynik = tekst.replace('a', 'e');
        System.out.println(wynik);
        String duze = tekst.toUpperCase();
        String male = tekst.toLowerCase();
        System.out.println(duze);
        System.out.println(male);

//        Małe litery: 97-122
//        Duże litery: 65-90
//        Cyfry: 48-57
        String zdanie = "Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo że jego %s na to nie wskazuje";
        System.out.println(zdanie);
        zdanie = String.format(zdanie, "pierwsze_słowo", "drugie_słowo", "trzecie_słowo");
        System.out.println(zdanie);

        String zdanie_drugie = "... to najlepsza ksiazka napisana przez ...";
        System.out.println(zdanie_drugie);
        zdanie_drugie = zdanie_drugie.replaceFirst("\\.\\.\\.", "Java rusz głowa");
        zdanie_drugie = zdanie_drugie.replaceFirst("\\.\\.\\.", "Kathy Sierra,Bert Bates");
        System.out.println(zdanie_drugie);


        String slowo = "wodrze";
        for (int i = 0; i < 5; i++) {
            System.out.print(slowo);
        }


        LocalDate data = LocalDate.now();
        LocalTime godzina = LocalTime.now();
        String zdanie_trzecie = "Dzisiaj jest " + data + " godzina " + godzina;
        System.out.println(zdanie_trzecie);

        int[] liczby = {54, 103, 241, 67, 9999, 14, 153809};
        for (int i = 0; i < liczby.length; i++) {
            char znak = (char) liczby[i];
            System.out.println("Kod: " + liczby[i] + " -> Znak: " + znak);
        }

        char a = 'A';
        System.out.println("ASCII of 'A': " + (int) a);
        char exclamation = '!';
        System.out.println("ASCII of '!': " + (int) exclamation);
        char at = '@';
        System.out.println("ASCII of '@': " + (int) at);
        char lessThan = '<';
        System.out.println("ASCII of '<': " + (int) lessThan);
        char newLine = '\n';
        System.out.println("ASCII of '\\n' (newline): " + (int) newLine);
        char backspace = '\b';
        System.out.println("ASCII of '\\b' (backspace): " + (int) backspace);


//Strzalka z *
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 0; j < 21; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        int[] starsInLine = {14, 15, 14};
        for (int i = 0; i < starsInLine.length; i++)
        {
            for (int j = 0; j < starsInLine[i]; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 3; i >= 1; i--)
        {
            for (int j = 0; j < 21; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

//diament z *
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}