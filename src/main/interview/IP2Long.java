package main.interview;

/**
 * Created by wong on 2019/4/21.
 */
public class IP2Long {

    public static long solution(String IP) throws Exception {
        String[] strings = checkIP(IP);
        return transformIP(strings);
    }

    private static long transformIP(String[] strings) {
        return 256 * 256 * 256 * Long.valueOf(strings[0]) + 256 * 256 * Long.valueOf(strings[1]) +
                256 * Long.valueOf(strings[2]) + Long.valueOf(strings[3]);
    }

    private static String[] checkIP(String IP) throws Exception {
        if (IP == null || IP.length() == 0) {
            throw new Exception("IP格式错误");
        }

        String[] strings = IP.split("\\.");
        if (strings.length != 4 || !(0 <= Integer.valueOf(strings[0]) && Integer.valueOf(strings[0]) <= 255 &&
                0 <= Integer.valueOf(strings[1]) && Integer.valueOf(strings[1]) <= 255 &&
                0 <= Integer.valueOf(strings[2]) && Integer.valueOf(strings[2]) <= 255 &&
                0 <= Integer.valueOf(strings[3]) && Integer.valueOf(strings[3]) <= 255)) {
            throw new Exception("IP格式错误");
        }
        return strings;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(solution("192.68.0.1"));
        System.out.println(solution("10.10.2.1"));
//        System.out.println(solution("192. 189.2.1"));
//        System.out.println(solution("10 .189.2.1"));
        System.out.println(solution("183.62.169.146"));
    }
}
