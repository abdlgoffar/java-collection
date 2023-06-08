package app;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
public class ListDefaultMethod {
    public static void main(String[] args) {

        //MEMBUAT DATA TYPE LIST BERJUMLAH 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        //METHOD DEFAULT SATU PARAMETER DENGAN RETURN VALUE SAMA SEPERTI JENIS DATA TYPE LISNYA
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        });

        System.out.println(numbers);//01

        //METHOD DEFAULT ITERATION ATAU LOOPING DATA TYPE LIST
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //METHOD DEFAULT SATU PARAMETER DENGAN RETURN VALUE BOOLEAN
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 500;
            }
        });

        System.out.println(numbers);//03

    }
}
