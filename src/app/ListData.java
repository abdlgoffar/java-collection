package app;
import java.util.ArrayList;
import java.util.List;
public class ListData {
    //LIST DATA ADALAH TURUNAN DARI DATA ITERABLE DAN COLECTION
    //LIST DATA ADALAH DATA YG BISA DIBUAT DUPLICAT/SAMA DALAM SATU DATA LIST
    public static void main(String[] args) {
        //CARA MEMBUAT DATA TYPE LIST
        List<String> name = new ArrayList<>();
        //CARA MENAMBAH DATA TYPE LIST
        name.add("ronaldo");
        name.add("messi");
        name.add("neymar");
        name.add("mo salah");
        //CARA MENGUPDATE DATA TYPE LIST
        name.set(0, "abdul goffar");
        name.set(1, "cristiano ronaldo");
        //CARA MENGHAPUS DATA TYPE LIST
        name.remove(3);
        //CARA MENGAMBIL SATU DATA TYPE LIST
        System.out.println(name.get(1));
        //CARA ITERATION DATA LIST
        System.out.println("MENAMPILKAN DATA LIST");
        for(String i : name){
            System.out.println(i);
        }
    }
}
