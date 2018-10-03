package main.aarray;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * <p>
 * Created by wong on 2018/10/1.
 */
public class MergeIntervals {
    /**
     * https://leetcode.com/problems/merge-intervals/discuss/21222/A-simple-Java-solution
     * @param intervals
     * @return
     */
    public static List<Interval> otherGoodSolution(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return intervals;
        }
        List<Interval> list = new ArrayList<>();
        sort(intervals);
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval interval : intervals) {
            if (end >= interval.start) {
                end = Math.max(end, interval.end);
            } else {
                list.add(new Interval(start, end));
                end = interval.end;
                start = interval.start;
            }
        }
        list.add(new Interval(start, end));
        return list;
    }

    public static void sort(List<Interval> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).start > list.get(j).start) {
                    Interval temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Interval interval1 = new Interval(1, 3);
        Interval interval2 = new Interval(2, 6);
        Interval interval3 = new Interval(8, 10);
        Interval interval4 = new Interval(15, 18);
        List<Interval> list = new ArrayList<>();
        list.add(interval1);
        list.add(interval2);
        list.add(interval3);
        list.add(interval4);
        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());
        list = otherGoodSolution(list);
        System.out.println(list.toString());
    }


    public static class Interval {
        int start;
        int end;

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

}
