package main.aarray;

import java.util.*;

/**
 * Created by wong on 2018/9/22.
 */
public class SubSets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        ArrayList<Integer> emptyList = new ArrayList<>();
        lists.add(emptyList);
        if (nums == null || nums.length == 0) {
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            ArrayList<ArrayList<Integer>> tempLists = new ArrayList<ArrayList<Integer>>();
            for (List<Integer> list : lists) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.addAll(list);
                tempLists.add(temp);
            }

            for (ArrayList<Integer> list : tempLists) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.addAll(list);
                temp.add(nums[i]);
                lists.add(temp);
            }

        }
        return lists;
    }

    public static List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        ArrayList<Integer> emptyList = new ArrayList<>();
        lists.add(emptyList);
        if (nums == null || nums.length == 0) {
            return lists;
        }

        for (int i = 0; i < nums.length; i++) {
            int size = lists.size();
            for (int j = 0; j < size; j++) {
                lists.add(new ArrayList<Integer>(lists.get(j)));
                lists.get(lists.size() - 1).add(nums[i]);
            }
        }
        return lists;
    }


    public static void print(List<List<Integer>> subsets) {
        for (List<Integer> list : subsets) {
            System.out.println(list.toString());
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        List<List<Integer>> subsets = subsets1(a);
        print(subsets);
    }
}
