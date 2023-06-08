package helper;
import data.Person;
import java.util.Comparator;
/*CREATE COMPARATOR MANUAL UNTUK PENYORTINGAN DATA*/
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2)/*01 DUA DATA YANG AKAN DIBANDINGKAN*/{
        return o1.getName().compareTo(o2.getName());/*02 MEMBANDINGKAN DATA*/
    }
}
