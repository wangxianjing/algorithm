package main.aarray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2018\9\25 0025.
 */
public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outList = new ArrayList<List<Integer>>();
        List<Integer> innerList = null;
        for (int i = 0;i < numRows; i ++) {
            innerList = getList(innerList);
            outList.add(innerList);
        }
        return outList;
    }

    public static List<Integer> getList(List<Integer> preList) {
        if (preList == null) {
            List<Integer>  list = new ArrayList<>();
            list.add(1);
            return list;
        } else {
            List<Integer> list = new ArrayList<>(preList.size() + 1);
            for (int i = 0; i <= preList.size(); i ++) {
                if (i == 0 || i == preList.size()){
                    list.add(1);
                } else {
                    list.add(preList.get(i) + preList.get(i - 1));
                }
            }
            return list;
        }
    }

    public static List<List<Integer>> otherGoodSolution(int numRows){
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int i = 0;i <numRows; i ++) {
            row.add(0,1);
            for (int j = 1;j < row.size()-1;j++) {
                row.set(j,row.get(j) + row.get(j + 1));
            }
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }


    public static void main(String[] args) {
        List<List<Integer>> generate = otherGoodSolution(5);
        System.out.println(generate.toString());
        List<Integer> list = new ArrayList<>(4);
        System.out.println(list.size());
    }
}
