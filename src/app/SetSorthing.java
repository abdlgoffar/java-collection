package app;
import data.Person;
import helper.PersonComparator;
import java.util.SortedSet;
import java.util.TreeSet;
public class SetSorthing {
    //CONTOH SORTHING DATA SET DENGAN IMPLEMENTASI CLASS COMPARATOR JAVA
    public static void main(String[] args) {
        //MEMBUAT DATA TYPE SET DAN COMPARATOR PERBANDINGANNYA
        SortedSet<Person> person = new TreeSet<>(new PersonComparator());
        person.add(new Person("abdul goffar"));
        person.add(new Person("rizal"));
        person.add(new Person("ari"));
        for (Person i : person){
            System.out.println(i.getName());
        }
        /*JIKA INGIN MEMBALIKKAN PENGURUTAN SORTHINGAN  SORTHINGAN DATA GUNAKAN METHOD reversed()*/
    }
}
