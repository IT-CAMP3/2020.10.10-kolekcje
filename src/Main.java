import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Wielkość listy: " + list.size());
        list.add(5);

        System.out.println("Wielkość listy: " + list.size());
        list.add(10);

        System.out.println("Wielkość listy: " + list.size());
        list.add(34);

        System.out.println("Wielkość listy: " + list.size());

        System.out.println(list);
        System.out.println(list.get(0));

        list.remove(0);
        System.out.println(list);
    }
}
