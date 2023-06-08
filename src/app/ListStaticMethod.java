package app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListStaticMethod {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.addAll(List.of("abdul goffar", "fauzan", "alvin", "robi", "afkhan", "hanifa"));
        System.out.println("list : " + name);

        //CATATAN: UNTUK BISA MENGGUNAKAN STATIC METHOD DI COLLECTION PADA DATA TYPE LIST, MAKA CONVERT DATA LIST KE COLLECTION DAHULU
        //reverse() METHOD UNTUK MEMBALIKKAN URUTAN DATA TYPE LIST
        Collections.reverse(name);
        System.out.println( "list : " +name);
        //*shuffle() METHOD UNTUK MENGACAK URUTAN DATA TYPE LIST
        Collections.shuffle(name);
        System.out.println("list data diacak : " +name);
    }
}
