package app;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionData {
    public static void main(String[] args) {
        //cara membuat type data collection
        Collection<String> car = new ArrayList<>();
        car.add("ferrari");
        car.add("lamborgini");
        car.add("mercedez ben");
        car.add("avanza");
        //cara menghapus type data collection
        car.remove("lamborgini");
        //CARA MENGETAHUI DATA VALUE TYPE COLLECTION TERSEDIA ATAU TIDAK
        System.out.println("chek data ini ada ngk: " +car.contains("ferrari"));
        //CARA ITERATION DATA TYPE COLLECTION
        System.out.println("TAMPILKAN DATA COLLECTION");
        for (String i : car){
            System.out.println(i);
        }
        //cara mengetahui banyaknya jumlah data di type data collection
        System.out.println("berapa data collection: " + car.size());
    }
}
