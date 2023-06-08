package app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListSorthing {
    //UNTUK MELAKUKAN SORT PADA DATA LIST MAKA DATA TYPE LIST HARUS MUTABLE JIKA IMMUTABLE MAKA AKAN ERROR
    public static void main(String[] args) {
        //MEMBUAT DATA LIST
        List<String> name = new ArrayList<>();
        //MENAMBAH DATA LIST
        name.add("ghoffar");
        name.add("ronaldo");
        name.add("messi");
        name.add("neymar");
        name.add("ibrahimovic");

        //CONTOH CARA SORTHING DATA TYPE LIST
        Collections.sort(name);
        //ITERATION DATA TYPE LIST YANG SUDAH DI SORTHING
        System.out.println("MENAMPILKAN DATA LIST");
        for(String i : name){
            System.out.println(i);
        }
    }
}
