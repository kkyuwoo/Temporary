package day1;

import java.util.ArrayList;
import java.util.List;

public class Number {

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPerfectNumber(int num) {
        int result = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) result += i;
        }
        if (result == num) return true;
        return false;
    }

    public static String factors(int num) {
        List factor = new ArrayList<Integer>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) factor.add(i);
        }
        return factor.toString();
    }
}
