package app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListImmutable {
    //DATA TYPE LIST YANG IMMUTABLE TIDAK BISA DIMODIFIKASI SEPERTI DITAMBAH ATAU DIUPDATE
    public static void main(String[] args) {
        //BEBERAPA CONTOH CARA PEMBUATAN DATA TYPE LIST IMMUTABLE
        List<String> animal = Collections.singletonList("crochodile");//CONTOH 01 UNTUK DATA TYPE LIST YANG SINGGLE
        List<String> car =  Collections.emptyList();//CONTOH 02 UNTUK DATA TYPE LIST YANG INGIN KOSONG TANPA ADA ISINYA
        List<String> name = new ArrayList<>();//CONTOH 03 DENGAN CARA MENGUNCI DATA TYPE LIST DENGAN METHOD unmodifiableList()
        name.add("goffar");
        name.add("rizal");
        name.add("hisbul");
        List<String> setBeImmutable = Collections.unmodifiableList(name);/*set immutable list 03*/
        List<String> nationals = List.of("germany", "south corea", "indonesia", "china", "japan");//CONTOH 04 DENGAN MEMBUAT DATA TYPE LIST SECARA PATEN
    }
}
