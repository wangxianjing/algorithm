package main.interview;

/**
 * Created by wong on 18/7/1.
 */
public class Sql {
    /**
     * name xueke score
     * a     英语   43
     * a     语文   32
     * b     英语   44
     * b     语文   35
     *
     * 根据学生的每个学科总分进行排名
     *
     */
    private static final String sql1 = "SELECT table1.student_name,table1.total_score from( SELECT student_name,sum(score) as total_score from score_table GROUP BY student_name) as table1 order by table1.total_score DESC ;";
}
