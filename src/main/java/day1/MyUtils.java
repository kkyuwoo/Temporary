package day1;

public class MyUtils {
    public static void game369EX() {
        int cnt = 333;
        String result = is369(cnt);
        System.out.println((cnt + result));
    }
    public static void game369() {
        for (int i = 0; i < 100; i++) {
            int cnt = 0;
            if (i%10 == 3 || i%10 == 6 || i%10 == 9)
                cnt++;
            if (i/10 == 3 || i/10 == 6 || i/10 == 9)
                cnt++;
            System.out.printf("%02d", i);
            for (int j = 0; j < cnt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static String is369(int num) {
        int a = num / 10;
        int b = num % 10;
        String str = (b % 3 == 0 && b != 0) ? "*" : "";
        if (a == 0)
            return str;

        return str + is369(a);
    }
}
