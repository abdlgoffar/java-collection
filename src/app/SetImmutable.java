package app;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetImmutable {
    //SET IMMUTABLE ADALAH DATA TYPE YANG TIDAK BISA DIMODIFIKASI SEPERTI DITAMBAHA ATAU DIUPDATE
    public static void main(String[] args) {
        //BEBERAPA CONTOH MEMBUAT DATA TYPE SET IMMBUTABLE
        Set<String> animal = Collections.singleton("crochodile");
        Set<String> car =  Collections.emptySet();
        Set<String> name = new LinkedHashSet<>();
        name.add("goffar");
        name.add("rizal");
        Set<String> setBeImmutable = Collections.unmodifiableSet(name);
        Set<String> nationals = Set.of("germany", "south corea", "indonesia", "china", "japan");
    }
}
