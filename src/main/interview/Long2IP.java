package main.interview;

/**
 * Created by wong on 2019/4/21.
 */
public class Long2IP {
    public static String solution(Long ip) {
        long a = ip % 256;
        long b = (ip - a) / 256 / 256 / 256;
        long c = (ip - a - b * 256 * 256 * 256) / 256 / 256;
        long d = (ip - a - b * 256 * 256 * 256 - c * 256 * 256) / 256;
        return String.valueOf(b) + "." + String.valueOf(c) + "." + String.valueOf(d) + "." + String.valueOf(a);
    }

    public static void main(String[] args) {
        System.out.println(solution(3074337170L));
    }
}
