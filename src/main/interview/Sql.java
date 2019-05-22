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
    String sql1 = "SELECT table1.student_name,table1.total_score from( SELECT student_name,sum(score) as total_score from score_table GROUP BY student_name) as table1 order by table1.total_score DESC ;";

    /**
     *  student(sno,sname,sage,ssex)学生表
     *  course(cno,cname,tno) 课程表
     *  sc(sno,cno,score) 成绩表
     *
     *  teacher(tno,tname) 教师表
     */

    /**
     * 查询课程1比课程2分数高的学号
     */
    String sql2 = "select a.sno from (select sno,score where cno=1) a,  (select sno,score where cno=1) b where a.score>b.score and a.sno=b.sno";

    /**
     * 查处平均分大于60的学号和平均分
     */
    String s3="select avg()";
}
