import java.time.LocalDate;
import java.time.LocalTime;
public class zestaw1
{

public static void main(String[] args)
{
//    Wypisz swoje imie i nazwisko na ekranie
    String imie = "Łukasz";
    String nazwisko = "Syrewicz";
    System.out.println(imie + " " + nazwisko);

//    Wypisz dlugosc imienia i nazwiska
    int dlugoscImienia = imie.length();
    int dlugoscNazwisko = nazwisko.length();
    System.out.println("Dlugosc imienia: " + dlugoscImienia);
    System.out.println("Dlugosc nazwisko: " + dlugoscNazwisko);

//    Polacz 3 wyrazy w jeden i wyswietl go na ekranie
    String pierwszy = "ala";
    String drugi = "ma";
    String trzeci = "kota";
    String czwarty = pierwszy + " " + drugi+ " " + trzeci;
    System.out.println(czwarty);

//    W zdaniu czwarty zmien litery a na e
    String poZmianie = czwarty.replace('a', 'e');
    System.out.println(poZmianie);

//    W zdaniu czwarty zmien male litery na wielkie i odwrotnie
    String naWielkie = czwarty.toUpperCase();
    String naMale = czwarty.toLowerCase();
    System.out.println(naWielkie);
    System.out.println(naMale);

//    W zdaniu "Grzesiek nie wiedzial dlaczego ... jest tak drapieznym ... mimo, ze jego ... na to nie wskazuje" w miejscu kropek wstaw dowolne slowa
    String zdanie = "Grzesiek nie wiedzial dlaczego %s jest tak drapieznym %s mimo, ze jego %s na to nie wskazuje";
    zdanie = String.format(zdanie, "pierwsze_słowo", "drugie_słowo", "trzecie_słowo");
    System.out.println(zdanie);

//    W zdaniu wpisz swoje slowa
    String zdanieDrugie = "%s to najlepsza ksiazka napisana przez %s";
    zdanieDrugie = String.format(zdanieDrugie,"Harry Potter", "J.K Rowling");
    System.out.println(zdanieDrugie);

//    Wypisz obok siebie wyraz "wodrze" 5 razy
    for(int i = 0; i < 5; i++)
    {
        System.out.print("wodrze");
        System.out.println("");
    }

//    Napisz zdanie "Dzis jest (dd-mm-rrrr) godzina(hh:mm:ss) wstawiajac odpowiednie dane
//    import java.time.LocalDate;
//    import java.time.LocalTime;
    LocalDate data = LocalDate.now();
    LocalTime time = LocalTime.now();
    System.out.println("Dziś jest " + data + " godzina " + time);
}
}
