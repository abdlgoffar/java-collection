package app;
import java.util.Deque;
import java.util.LinkedList;
public class DequeData {
    //DEQUE BIASA DISEBUT JUGA DENGAN TUMPUKAN DATA, DATA PALING AKHIR DI TAMBAH MAKA AKAN ADA PADA URUTAN PALING ATAS
    public static void main(String[] args) {
        Deque<String> names = new LinkedList<>();
        //CARA MENAMBAH DATA DEQUE
        names.addLast("goffar");
        names.addLast("hilman");
        names.addLast("sandhika");
        names.addLast("kurniawan");
        //CARA ITERATION DATA DEQUE
        System.out.println("MENAMPILKAN DATA DEQUE");
        for (String i : names){
            System.out.println(i);
        }
        System.out.println("ambil data pertama: " + names.pollFirst());
        System.out.println("ambil data terakhir: " + names.pollLast());
    }
}
