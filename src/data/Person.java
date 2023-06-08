package data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Person {
    public String name;
    private List<String> hobbies;/*TYPE DATA LIST*/
    /*CONSTRUCTOR*/
    public Person(String name){
        this.name = name;
        this.hobbies = new ArrayList<>();
    }
    /*METHOD ADD DATA*/
    public void addHobbies(String data){
        this.hobbies.add(data);
    }
    /*METHOD MENAMPILKAN DATA*/
    public List<String> getHobbies(){
        return Collections.unmodifiableList(this.hobbies);/* LIST DATA IMMUTABLE ATAU TIDAK BISA DI UBAH UBAH*/
    }
    public String getName() {
        return name;
    }
}
