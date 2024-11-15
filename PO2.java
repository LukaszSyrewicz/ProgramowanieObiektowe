import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class PO2
{
    public static void znajdzTrojkiPitagorejskie(int n)
    {
        int suma = 0;
        for (int a = 1; a <= n; a++)
        {
            for (int b = a; b <= n; b++)
            {
                int c = (int)Math.sqrt(a * a + b * b);
                if (c <= n && (a * a + b * b == c * c))
                {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                    suma += 1;
                }
            }
        }
        System.out.println(suma);
    }

    public static void funKwaRozwiazania(int n)
    {
        int suma = 0;
        for (int a = -n; a <= n; a++)
        {
            for (int b = -n; b <= n; b++)
            {
                for (int c = -n; c <= n; c++)
                {
                    if (a != 0) //warunek dotyczacy istnienia fun.kwadratowej
                    {
                        int delta = b * b - 4 * a * c;
                        if (delta >= 0)
                        {
                            System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                            suma += 1;
                        }
                    }
                }
            }
        }
        System.out.println("Razem wszystkich mozliwych kombinacji wspolczynnikow jest " + suma);
    }
    public static void funKwaDelta(int n)
    {
        int suma = 0;
        for(int a = -n; a <= n; a++)
        {
            for(int b = -n; b <= n; b++)
            {
                for(int c = -n; c <= n; c++)
                {
                    if(a != 0)
                    {
                        int delta = b * b - 4 * a * c;
                        if(delta>0)
                        {
                            int pierwiastekZDelty = (int)Math.sqrt(delta);
                            if(pierwiastekZDelty*pierwiastekZDelty == delta)
                            {
                                System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", delta: " + delta);
                                suma += 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("W podanym zakresie takich rozwiazan jest: " + suma);
    }

//    ==================================================================================================================
    public static boolean czyLiczbaPierwsza(int liczba)
    {
        if (liczba < 2)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(liczba); i++)
        {
            if (liczba % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void liczbyPierwsze(int n)
    {
        if (n < 2)
        {
            System.out.println("Nie ma liczb pierwszych mniejszych niż 2");
        }
        else
        {
            for (int i = 2; i <= n; i++)
            {
                if (czyLiczbaPierwsza(i))
                {
                    System.out.println(i + " jest liczbą pierwszą.");
                }
            }
        }
    }
    //===================================================================
    public static void liczbyPodzielne(int m, int n)
    {
        //zakres liczb
        int min = (int)Math.pow(10,m - 1);
        int max = (int)Math.pow(10,m)-1;
        System.out.println("Liczby " + m + "-cyfrowe podzielne przez " + n + " to:");
        for (int i = min; i <= max; i++)
        {
            if (i % n == 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void piramida (int n,String znak)
    {
        switch (znak)
        {
            case "Pierwszy":
                for (int i = 1; i <= n; i++)
                {
                // Wypisywanie spacji
                    for (int j = i; j < n; j++)
                    {
                        System.out.print(" ");
                    }
                // Wypisywanie gwiazdek
                    for (int k = 1; k <= 2 * i - 1; k++)
                    {
                        System.out.print("*");
                    }
                System.out.println();
                }
                break;
            case "Drugi":
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

        }
    }
//    public static void silnia(int n)
//    {
//        int iloraz = 1;
//        for(int i = 1; i <= n; i++)
//        {
//            iloraz *=i;
//        }
//        System.out.println(iloraz);
//    }
    public static void silniaMta(int n, int m)
    {
        int iloraz = 1;
        for(int i = 0; i < m; i++)
        {
            iloraz *=(n-i);
        }
        System.out.println(iloraz);
    }

    public static void dwumianNewtona(int n, int k)
    {
        int ilorazN = 1;
        int ilorazK = 1;
        int ilorazNK = 1;
        for(int i = 1; i <= n; i++)
        {
            ilorazN *= i;
        }
        for(int i = 1; i <= k; i++)
        {
            ilorazK *= i;
        }
        int nk = n - k;
        for (int i = 1; i <= nk; i++)
        {
            ilorazNK *= i;
        }
        int wynik = ilorazN/(ilorazK*ilorazNK);
        System.out.println("Wynik dwumianu Newtona dla liczb: n="+ n +" k="+k+" to: "+ wynik);
    }

    public static void ciagFibonaciego(int n)
    {
        int a = 0;
        int b = 1;

        if(n >= 1)
        {
            System.out.print(a+ " ");
        }
        if(n>=2)
        {
            System.out.print(b+" ");
        }
        for(int i = 3; i <= n; i++)
        {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
    public static void sumaNaturalnych(int n)
    {
        int suma = 0;
        for(int i = 0; i <= n; i++)
        {
            suma += i;
        }
        System.out.println(suma);
    }
    public static void sumaParzystych(int n)
    {
        int suma = 0;
        for (int i = 0 ; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                suma += i;
            }
        }
        System.out.println(suma);
    }
    public static void sumaNieParzystych(int n)
    {
        int suma = 0;
        for (int i = 0 ; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                suma += i;
            }
        }
        System.out.println(suma);
    }

    public static void sumaKwadratowLiczbNaturalnych(int n)
    {
        int suma = 0;
        for (int i = 0 ; i <= n; i++)
        {
            suma += Math.pow(i, 2);
        }
        System.out.println(suma);
    }

    public static void sumaSzescianowLiczbNaturalnych(int n)
    {
        int suma = 0;
        for (int i = 0 ; i <= n; i++)
        {
            suma += Math.pow(i,3);
        }
        System.out.println(suma);
    }
    public static void czyPalindrom (String wyraz)
    {
        wyraz = wyraz.toLowerCase();
        boolean czyPalindrom = true;
        int dlugosc = wyraz.length();
        for (int i = 0; i < dlugosc/2; i++)
        {
            if (wyraz.charAt(i) != wyraz.charAt(dlugosc-i-1))
            {
                czyPalindrom = false;
                break;
            }
        }
        if(czyPalindrom)
        {
            System.out.println("Wyraz jest palindronem");
        }
        else
        {
            System.out.println("Wyraz nie jest palindronem");
        }
    }
    //===================================================================================
    public static void trojkatPascala(int n)
    {

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++)
            {
                if (k == 0)
                {
                    System.out.print(1 + " ");
                }
                else
                {
                    int wynik = silnia(i)/(silnia(k)*silnia(i-k));
                    System.out.print(wynik + " ");
                }
            }
            System.out.println();
        }
    }
    public static int silnia(int n)
    {
        int iloraz = 1;
        for(int i = 1; i <= n; i++)
        {
            iloraz *=i;
        }
        return iloraz;
    }
//===================================================================================
    public static void czyPodanaLiczbaJestPalindronem(int n)
    {
        int num = n;
        int pierwotnyNumer = num;
        int odwroconyNumer = 0;

        while(num != 0)
        {
            odwroconyNumer = odwroconyNumer*10 + num%10;
            num /= 10;
        }
        if(odwroconyNumer == pierwotnyNumer)
        {
            System.out.println("Liczba jest palindronem");
        }
        else
        {
            System.out.println("Liczba nie jest palindronem");
        }
    }



    public static int czyPodanaLiczbaJestPierwsza(int liczba)
    {
        if (liczba > 2)
        {
            for (int i = 2; i <= Math.sqrt(liczba); i++)
            {
                if (liczba % i == 0)
                {
                    System.out.println("Liczba nie jest pierwsza");
                }
                else
                {
                    System.out.println("Liczba jest pierwsza");
                }
            }
        }
        return liczba;
    }

    public static void wczytajTablice(int n)
    {
        Scanner sc = new Scanner(System.in);
        int[]tab = new int[n];
        for(int i = 0; i < n; i++)
        {
            tab[i] = sc.nextInt();
        }
        for(int j = 0; j < n; j++)
        {
            System.out.print(tab[j]+ " ");
        }
    }

    public static void czyDoskonała(int n)
    {
        if(n <= 1)
        {
            System.out.println("Nie ma liczby doskonalej mniejszej badz rownej 1");
        }
        int sumaDzielnikow = 0;
        for (int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sumaDzielnikow += i;
            }
        }
        if(sumaDzielnikow == n)
        {
            System.out.println("Liczba jest doskonala");
        }
        else
        {
            System.out.println("Liczba nie jest doskonala");
        }
    }

    public static void NWD(int a, int b)
    {
        while(b != 0)
        {
          int temp = b;
          b = a % b;
          a = temp;
        }
        System.out.println(a);
    }




public static void generujTablice(int n, int min, int max)
{
    if(min == max)
    {
        System.out.println("Wartosc min nie moze byc rowna wartosci max");

    }
    else if(min > max)
    {
        System.out.println("Wartosc min nie moze byc wieksza niz max");
    }
    else
    {
        Random random = new Random();
        int[] tab = new int[n];
        tab[0] = min;
        tab[n-1] = max;
//        int minZakres = min++;
//        int maxZakres = max--;


        for (int i = 0; i < n; i++)
        {
            if(i > 0 && i != n-1)
            {
                tab[i] = random.nextInt(max - min + 1) + min;
            }
            System.out.print(tab[i]+ " ");
        }
    }
}




public static void podwajaSie(int n){

}





















    public static void main(String[] args)
    {
//        znajdzTrojkiPitagorejskie(15);
//        silnia(5);
        funKwaRozwiazania(5);
//        funKwaDelta(2);
//        liczbyPierwsze(25);
//        liczbyPodzielne(3,23);
//        piramida(5,"Pierwszy");
//        silniaMta(5,3);
//        dwumianNewtona(10,3);
//        ciagFibonaciego(7);
//        sumaNaturalnych(10);
//        sumaParzystych(10);
//        sumaNieParzystych(10);
//        sumaKwadratowLiczbNaturalnych(4);
//        sumaSzescianowLiczbNaturalnych(4);
//        czyPalindrom("kuba");
//        trojkatPascala(4);
//        czyPalindromLiczba(12313215);
//        czyPodanaLiczbaJestPierwsza(5);
//        czyPodanaLiczbaJestPalindronem(121212121);
//        NWD(282,78);
//        generujTablice(5,1,10);
    }
}
