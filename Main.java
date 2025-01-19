import java.util.Arrays;
class Storage <T>
{
    private T item;
    public void store(T item)
    {
        this.item = item;
    }
    public T retrieve()
    {
        return item;
    }
}


public class Main
{
    public static void main(String[] args)
    {
        House house = new House(10,"Zielony" , 4);
        System.out.println("Wysokosc domu: " + house.getHeight());
        System.out.println("Kolor domu: " + house.getColor());
        System.out.println("Liczba pokoi "+ house.getNumberOfRooms());
        Storage<String> magazynStringow = new Storage<>();
        magazynStringow.store("Siema");
        System.out.println("Przechowywany item: " + magazynStringow.retrieve());

        Storage<Integer> magazynLiczb = new Storage<>();
        magazynLiczb.store(12356775);
        System.out.println("Przechowywany obiekt: " + magazynLiczb.retrieve());
    }
}