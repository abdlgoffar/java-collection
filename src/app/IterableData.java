package app;

import java.util.Iterator;
import java.util.List;

public class IterableData {

    public static void main(String[] args) {
        //CARA MEMBUAT DATA ITERABLE
        Iterable<String> animals = List.of("tiger", "lyon", "horse", "elephant");
        //CATA ITERATION DATA ITERABLE
        System.out.println("CARA MENDAPAT DATA ITERABLE DENGAN LOOPING");
        for (String i : animals){
            System.out.println(i);
        }

        //CATA ITERATION DATA ITERABLE SECARA MANUAL, MAKA HARUS CONVERT KE DATA TYPE ITERATOR DAHULU
        System.out.println("CARA MENDAPAT DATA ITERABLE DENGAN ITERATOR/MANUAL");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            String data = iterator.next();
            System.out.println(data);
        }
    }

}
