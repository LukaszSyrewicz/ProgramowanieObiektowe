import java.util.Random;
public class Main
{

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
        public static void podciag(int n)
        {
            Random random = new Random();
            int []table = new int[n];
            int aktualnyCiagMalejacych = 0;
            int aktualnyCiagRosnacych = 0;
            for (int i = 0; i < n; i++)
            {
                table[i] = random.nextInt(10);
                System.out.print(table[i] + " ");
                if(table[i] > table[i+1])
                {
                    aktualnyCiagMalejacych++;
                    aktualnyCiagRosnacych = 0;
                    if(i == n)
                    {
                        break;
                    }
                }
                if(table[i] < table[i+1])
                {
                    aktualnyCiagRosnacych++;
                    aktualnyCiagMalejacych = 0;
                    if(i == n)
                    {
                        break;
                    }
                }

            }




        }
        public static void pierwiastek(int s)
        {
            int x = s-1;
            int srednia = (x + (s/x))/2;
            for(int i = 0; i < s; i++)
            {

            }
            System.out.println(srednia);

        }




    public static void main(String[] args)
    {
//        czyPodanaLiczbaJestPalindronem(121);
//        palindromLiczbowy(3);
        podciag(6);
//        pierwiastek(5);

    }
}
