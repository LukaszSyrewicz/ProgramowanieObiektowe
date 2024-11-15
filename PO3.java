import java.util.Scanner;
public class PO3
{
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



    public static void generujZakres(int n,double min,double max)
    {
        double[]tab = new double[n];
        double stala = (max - min) / (n - 1);
//        n-1 bo tyle razy bedzie przeskakiwac
        System.out.println(stala);
        if(min <= max)
        {
            for (int i = 0; i < n; i++)
            {
                tab[i] = (min + i * stala);
            }
            for(int j = 0; j < n; j++)
            {
                System.out.print(tab[j]+ "  ");
            }
        }
        else
        {
            System.out.println("Wartosc minimalna nie moze byc wieksza niz maksymalna");
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








    public static void main(String[] args)
    {
//        trojkatPascala(5);
        generujZakres(7,5,20);
//        czyDoskonała(5);
    }

}
