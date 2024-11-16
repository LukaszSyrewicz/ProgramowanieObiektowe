public class ciag
{
    public static void main(String[] args) {
        // Przykładowa tablica
        int[] tablica = {1, 2, 1, -2, -3, 4, 5, -1, -2, -3, -4, 6};

        // Licznik unikalnych liczb
        int liczbaUnikalnych = 0;

        // Zmienna do śledzenia długości najdłuższego ciągu dodatnich i ujemnych
        int maxCiągDodatnich = 0;
        int maxCiągUjemnych = 0;

        // Zmienne pomocnicze do bieżącego liczenia ciągów
        int aktualnyCiągDodatnich = 0;
        int aktualnyCiągUjemnych = 0;

        // Iteracja przez tablicę
        for (int i = 0; i < tablica.length; i++) {
            boolean czyUnikalna = true;

            // Sprawdzanie unikalności liczby
            for (int j = 0; j < i; j++) {
                if (tablica[i] == tablica[j]) {
                    czyUnikalna = false;
                    break;
                }
            }

            // Jeśli liczba jest unikalna, zwiększ licznik
            if (czyUnikalna) {
                liczbaUnikalnych++;
            }

            // Liczenie ciągów dodatnich i ujemnych
            if (tablica[i] > 0) {
                aktualnyCiągDodatnich++;
                aktualnyCiągUjemnych = 0; // Zerujemy, bo przeszliśmy do liczb dodatnich
            } else if (tablica[i] < 0) {
                aktualnyCiągUjemnych++;
                aktualnyCiągDodatnich = 0; // Zerujemy, bo przeszliśmy do liczb ujemnych
            } else {
                // Liczba zero przerywa oba ciągi
                aktualnyCiągDodatnich = 0;
                aktualnyCiągUjemnych = 0;
            }

            // Aktualizacja najdłuższego ciągu
            maxCiągDodatnich = Math.max(maxCiągDodatnich, aktualnyCiągDodatnich);
            maxCiągUjemnych = Math.max(maxCiągUjemnych, aktualnyCiągUjemnych);
        }

        // Wyświetlanie wyników
        System.out.println("Liczba unikalnych liczb w tablicy: " + liczbaUnikalnych);
        System.out.println("Najdłuższy ciąg liczb dodatnich: " + maxCiągDodatnich);
        System.out.println("Najdłuższy ciąg liczb ujemnych: " + maxCiągUjemnych);
    }
}
