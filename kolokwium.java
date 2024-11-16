public class kolokwium
{

    public static int najblizszySasiad(int S)
    {
        int pierwiastek = (int) Math.sqrt(S);
        int mniejszy = pierwiastek * pierwiastek;
        int wiekszy = (pierwiastek + 1) * (pierwiastek + 1);

        if (S - mniejszy <= wiekszy - S)
        {
            return pierwiastek;
        }
        else
        {
            return pierwiastek + 1;
        }
    }
    public static double pierwiastek(double S, int n, double k) {
        double mniejszy = 0;
        double wiekszy = S;
        double srodkowy = 0;

        while (wiekszy - mniejszy > k) {
            srodkowy = (mniejszy + wiekszy) / 2;
            if (Math.pow(srodkowy, n) < S) {
                mniejszy = srodkowy;
            } else {
                wiekszy = srodkowy;
            }
        }
        return (mniejszy + wiekszy) / 2;
    }
    public static int podciag(int[] tab) {
        int maxDlugosc = 1;
        int obecnaDlugosc = 1;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < tab[i - 1]) {
                obecnaDlugosc++;
                maxDlugosc = Math.max(maxDlugosc, obecnaDlugosc);
            } else {
                obecnaDlugosc = 1;
            }
        }
        return maxDlugosc;
    }
    public static int podciag(int[] tab, int r)
    {
        int maxDlugosc = 1;
        int obecnaDlugosc = 1;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i - 1] - tab[i] == r) {
                obecnaDlugosc++;
                maxDlugosc = Math.max(maxDlugosc, obecnaDlugosc);
            } else {
                obecnaDlugosc = 1;
            }
        }
        return maxDlugosc;
    }
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

    public static void palindromLiczbowy(int m)
    {
        int start = (int) Math.pow(10, m - 1);
        int koniec = (int) Math.pow(10, m) - 1;
        for (int i = koniec; i >= start; i--)
        {
            for (int j = i; j >= start; j--)
            {
                int wynik = i * j;
                if (czyPalindrom(wynik))
                {
                    System.out.println("Liczby: " + i + " i " + j + ", Iloczyn: " + wynik);
                    return;
                }
            }
        }
        System.out.println("Nie znaleziono palindromu dla m = " + m);
    }
    public static boolean czyPalindrom(int liczba)
    {
        String numStr = String.valueOf(liczba);
        int len = numStr.length();
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        System.out.println(najblizszySasiad(20));
        System.out.println(najblizszySasiad(30));
        System.out.println(pierwiastek(27, 3, 0.001));
        System.out.println(pierwiastek(16, 2, 0.001));
        int[] tab = {5, 1};
        System.out.println(podciag(tab));
        int[] tab2 = {1, 2, 3, 2, 1, 0};
        System.out.println(podciag(tab2));
        int[] tab3 = {2, 0};
        System.out.println(podciag(tab3, 2));
        int[] tab4 = {10, 8, 6, 5, 3, 1};
        System.out.println(podciag(tab4, 2));
        czyPodanaLiczbaJestPalindronem(121);
        palindromLiczbowy(3);
    }
}

