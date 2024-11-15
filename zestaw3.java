public class zestaw3
{
    public static void trojkiPitagorejskie(int n)
    {
        for(int a = 1; a <= n; a++)
//        przechodze najpierw przez 1
        {
            for( int b = a; b <= n; b++)
//            1/1,2,3,4,5,6,7,8,9 itd.
            {
                int c = (int)Math.sqrt(a*a + b*b);
                if(c <=n && (a*a + b*b == c*c))
                {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
    }
    public static void funKwaRozwiazania(int n)
    {
        int suma = 0;
        for (int a = -n; a <= n; a++)
        {
            for(int b = -n; b <= n; b++)
            {
                for(int c = -n; c <= n; c++)
                {
                    if(a!=0)
                    {
                        int delta = b*b - 4*a*c;
                        if(Math.sqrt(delta) >= 0)
                        {
                            System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                            suma++;
                        }
                    }
                }
            }
        }
        System.out.println(suma);
    }
    public static void funKwaDelta(int n)
    {
        for(int a = -n; a <= n; a++)
        {
            for(int b = -n; b <= n; b++)
            {
                for(int c = -n; c <= n; c++)
                {
                    if(a != 0)
                    {
                        double delta = b*b - 4*a*c;
                        if(delta >= 0)
                        {
                            double delta2 = Math.sqrt(delta);
                            if(delta2 == (int)delta2)
                            {
                                System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                            }
                        }
                    }
                }
            }
        }
    }
    public static void liczbaPierwsza(int n)
    {

    }


    public static void main(String[] args)
    {
//        trojkiPitagorejskie(5);
//        funKwaRozwiazania(1);
        funKwaDelta(3);

    }
}
