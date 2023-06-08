package app;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetData {
    //SET DATA TYPE ADALAH TURUNAN DARI DATA ITERABLE DAN COLECTION
    //SET DATA TYPE ADALAH DATA YG TIDAK BISA DIBUAT DUPLICAT ATAU SAMA
    public static void main(String[] args) {
        //CARA MEMBUAT SET DATA TYPE
        Set<String> animals  = new LinkedHashSet<>();
        //CARA MENAMBAH SET DATA TYPE
        animals.add("dog");
        animals.add("horse");
        animals.add("crochodile");
        animals.add("lyon");
        //CARA MENGHAPUS SET DATA TYPE
        animals.remove("dog");
        //CARA MENGETAHUI  SET DATA TYPE
        System.out.println("chek data ini ada ngk: " +animals.contains("lyon"));
        // CARA ITERATION SET DATA TYPE
        System.out.println("MENAMPILKAN DATA SET");
        for (String i : animals){
            System.out.println(i);
        }
        //CARA MENGETAHUI JUMLAH SET DATA TYPE
        System.out.println("berapa data set: " + animals.size());
    }
}
