package app;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class QueueData {
    //QUEUE DATA DI SEBUT JUGA DENGAN ANTRIAN, DATA PERTAMA YG DIMASUKKAN AKAN BERADA DI DEPAN
    public static void main(String[] args) {
        //CARA MEMBUAT DATA QUEUE
        Queue<String> names = new LinkedList<>();
        //CARA MENAMBAH DATA QUEUE
        names.offer("ghoffar");
        names.offer("hilman");
        names.offer("sandhika");
        names.offer("kurniawan");
        //poll() DIGUNAKAN UNTUK MENGAMBIL DATA SEKALIGUS MENGHAPUSNYA
        //peak() DIGUNAKAN UNTUK MENGAMBIL DATA TETAPI TIDAK MENGHAPUSNYA
        //CONTOH ALGORITHMA MENGAMBIL DAN MENGHAPUS SEMUA DATA PADA QUEU
        for (String data = names.poll(); data != null; data = names.poll()){
            System.out.println(data);
        }
        //DAN LIHAT DISINI DATANYA SUDAH 0 ATAU KOSONG
        System.out.println(names.size());
    }
}
