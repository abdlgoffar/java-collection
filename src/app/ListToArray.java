package app;
import java.util.Arrays;
import java.util.List;
public class ListToArray {
    public static void main(String[] args) {
        List<String> names = List.of("hsibul", "goffar", "rizal");

        //CARA MENGUBAH DATA TYPE LIST KE ARRAY
        String[] names2 = names.toArray(new String[]{});

        System.out.println(Arrays.toString(names2));
    }
}
