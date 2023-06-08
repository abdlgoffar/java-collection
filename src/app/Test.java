package app;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(1000);
        BigDecimal bigDecimal2 = new BigDecimal(1000);
        double v = bigDecimal2.doubleValue();
        Double d = v * 2;
       // System.out.println(d);
        BigDecimal bigDecimal4 = new BigDecimal(d);
        System.out.println(bigDecimal4);
    }
}
