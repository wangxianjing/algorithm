package main.sstring;

import java.util.*;

/**
 * 字符串由2-9组成，每个数字对应手机上九宫格上的字母，数字可以用上面对应的任意字母替代，求所有的替代结果
 * Created by wong on 2018/11/30.
 */
public class MLetterCombinationsPhoneNumber {


    public static List<String> letterCombinations(String digits) {
        Map<String, List<String>> map = new HashMap<>();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        map.put("2", list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("d");
        list3.add("e");
        list3.add("f");
        map.put("3", list3);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("g");
        list4.add("h");
        list4.add("i");
        map.put("4", list4);

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("j");
        list5.add("k");
        list5.add("l");
        map.put("5", list5);

        ArrayList<String> list6 = new ArrayList<>();
        list6.add("m");
        list6.add("n");
        list6.add("o");
        map.put("6", list6);

        ArrayList<String> list7 = new ArrayList<>();
        list7.add("p");
        list7.add("q");
        list7.add("r");
        list7.add("s");
        map.put("7", list7);

        ArrayList<String> list8 = new ArrayList<>();
        list8.add("t");
        list8.add("u");
        list8.add("v");
        map.put("8", list8);

        ArrayList<String> list9 = new ArrayList<>();
        list9.add("w");
        list9.add("x");
        list9.add("y");
        list9.add("z");
        map.put("9", list9);

        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < digits.length(); i++) {
            String s = digits.substring(i, i + 1);
            List<String> list1 = map.get(s);
            ArrayList<String> newList = new ArrayList<>();
            for (String s1 : list1) {
                if (flag) {
                    newList.add(s1);
                } else {
                    for (String s2 : list) {
                        newList.add(s2 + s1);
                    }
                }
            }
            flag = false;
            list = newList;
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
