package app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListSearchingInteger {
    public static void main(String[] args) {
        //PERTAMA TERDAPAT ATAU MEMBUAT DATA TYPE LIST YANG BERJUMLAH 1000
        List<Integer> dataAngka = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
            dataAngka.add(i);
        }

        //CONTOH CARA SEARCHING ATAU PENCARIAN DATA TYPE LIST INTEGER YANG RETURNNYA NOMOR INDEX DARI DATANYA
        int index = Collections.binarySearch(dataAngka, 333);
        System.out.println(index);
    }
}
