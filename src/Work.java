import java.beans.beancontext.BeanContext;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Work {
    /**
     * Задание №15
     * Найдите первые 10 чисел, больших Long.MAX_VALUE, которые кратны 5 или 6.
     */


    public static void main(String[] args) {


        BigInteger number = new BigInteger(String.valueOf(BigInteger.valueOf(Long.MAX_VALUE)));
        int count = 0;
        BigInteger one = new BigInteger("1");

        while (count < 10) {
            if (number.mod(BigInteger.valueOf(5)).equals(BigInteger.valueOf(0)) ||
                    number.mod(BigInteger.valueOf(6)).equals(BigInteger.valueOf(0))) {
                System.out.println(number);
                count++;
            }

            number = number.add(one);

        }
    }
}






