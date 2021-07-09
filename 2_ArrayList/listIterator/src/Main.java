import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ll = new ArrayList<>();
        ll.add("sayak");
        ll.add("shahjahan");
        ll.add("akash");

        Iterator<String> it = ll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
