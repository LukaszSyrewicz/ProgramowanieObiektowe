import java.util.ArrayList;
class Elf
{
    private String imie;
    private int wiek;
    private String stanowisko;

    public void przedstawSie()
    {
        System.out.printf("Cześć, nazywam sie "+ imie + " ,mam " + wiek + " lat, a moje stanowisko to " + stanowisko);
    }
    public void setWiek(int wiek)
    {
        if(wiek > 0)
        {
            this.wiek = wiek;
        }
        else
        {
            System.out.println("Wiek nie moze byc mniejszy od 0");
        }
    }
    public int getWiek()
    {
        return wiek;
    }
    public void setImie(String imie)
    {
        this.imie = imie;
    }
    public String getImie()
    {
        return imie;
    }
    public void setStanowisko(String stanowisko)
    {
        this.stanowisko = stanowisko;
    }
    public String getStanowisko()
    {
        return stanowisko;
    }
}
class Fabryka
{
    private ArrayList<Elf>listaElfow = new ArrayList<>();
    private double szGeo;
    private double dlGeo;

    public void dodajPracownika(Elf elf)
    {
        listaElfow.add(elf);
    }
    public void usunPracownika(Elf elf)
    {
        listaElfow.remove(elf);
    }
    public Elf najstarszyPracownik()
    {
        return listaElfow.stream().max((a,b) -> Integer.compare(a.getWiek(), b.getWiek())).orElse(null);
    }

    public double getDlGeo()
    {
        return dlGeo;
    }
    public void setDlGeo(double dlGeo)
    {
        if(dlGeo >= -180 && dlGeo <= 180)
        {
            this.dlGeo = dlGeo;
        }
        else
        {
            throw new IllegalArgumentException("dlGeo musi byc miedzy -180 a 180");
        }
    }

    public double getSzGeo()
    {
        return szGeo;
    }
    public void setSzGeo(double szGeo)
    {
        if(szGeo >= -90 && szGeo <= 90)
        {
            this.szGeo = szGeo;
        }
        else
        {
            throw new IllegalArgumentException("szGeo musi byc miedzy -180 a 180");
        }
    }
}

class Renifer
{
    private String imie;
    private int predkosc;

    public void nakarmRenifera()
    {
        System.out.println("Nakarmiono renifera jego predkosc wzrosla o 5");
        this.predkosc +=5;
    }
    public String getImie()
    {
        return imie;
    }
    public int getPredkosc()
    {
        return predkosc;
    }
    public void setPredkosc(int predkosc)
    {
        if(predkosc > 0)
        {
            this.predkosc = predkosc;
        }
        else
        {
            System.out.println("Predkosc nie moze byc mniejsza od 0");
        }
    }
    public void setImie(String imie)
    {
        this.imie = imie;
    }
}
class Sanie
{
    private ArrayList<Renifer> listaReniferow = new ArrayList<>();
    public void dodajRenifera(Renifer renifer)
    {
        listaReniferow.add(renifer);
    }
    public int sumaPredkosci()
    {
        return listaReniferow.stream().mapToInt(Renifer::getPredkosc).sum();
    }
    public Renifer najwolniejszyRenifer()
    {
        return listaReniferow.stream().min((a,b) -> Integer.compare(a.getPredkosc(), b.getPredkosc())).orElse(null);
    }
}













public class Main
{
    public static void main(String[] args)
    {
        Elf a = new Elf();
        Elf b = new Elf();
        Elf c = new Elf();

//        a.przedstawSie();
        a.setImie("Bahir");
        a.setWiek(150);
        a.setStanowisko("Pakowacz");
        a.przedstawSie();
//        System.out.println("");
//        System.out.println(a.getImie());
//        System.out.println(a.getWiek());
//        System.out.println(a.getStanowisko());



        Renifer rudolf = new Renifer();
        System.out.println("");
        rudolf.setImie("Rudolf");
        rudolf.setPredkosc(400);
        System.out.println(rudolf.getImie());
        System.out.println(rudolf.getPredkosc());
//
//        System.out.println(rudolf.getPredkosc());
//        rudolf.nakarmRenifera();
//        System.out.println(rudolf.getPredkosc());
//        Fabryka f = new Fabryka();
//        f.setDlGeo(160);
//        f.setSzGeo(50);
//        System.out.println(f.getDlGeo());
//        System.out.println(f.getSzGeo());
//        f.dodajPracownika(a);
//        f.dodajPracownika(b);
//        f.dodajPracownika(c);
//        System.out.println(f.najstarszyPracownik());




    }
}