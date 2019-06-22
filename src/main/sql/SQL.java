package main.sql;

public class SQL {
    //第二高薪水
    private String secondHighestScore = "select Max(Salary) as SecondHighestSalary from Employee where (select Max(Salary) from Employee) > Salary;";
    //分数排序
    private String scoreSort = "select Score, (select count(distinct Score) from Scores where Score >= s.Score ) Rank from Scores s Order by Score desc;";
    //左join
    private String leftJoin = "SELECT FirstName, LastName ,City, State from Person LEFT JOIN Address on Person.PersonId = Address.PersonId;";
    //从不订购的客户
    private String neverOrderCustomers = "SELECT Name AS Customers FROM Customers " +
            "WHERE Id NOT IN (SELECT CustomerId FROM Orders);";
    //超过经理收入的员工
    private String salaryHigherThenManager = "select e1.Name as Employee from Employee e1,Employee e2 where e1.ManagerId=e2.Id and e1.Salary>e2.Salary;";
    //查找重复的电子邮箱
    private String searchRepeatEmail = "select Email from Person group by Email having count(Email)>1;";
    //删除重复的电子邮箱
    private String deleteRepeatEmail = "delete p1 from Person p1,Person p2 where p1.Email=p2.Email and p1.Id>p2.Id;";
    //!!部门工资最高的员工
    private String maxSalaryInDepartment = "select d.Name as Department, e.Name as Employee, e.Salary from Department d,Employee e where e.DepartmentId=d.Id and e.salary= (select max(salary) from Employee where DepartmentId=d.Id);";
    //!!连续出现的数字
    private String consecutiveNums = "select distinct(l1.Num) as ConsecutiveNums from Logs l1,Logs l2,Logs l3 where l2.Id= l1.Id+1 and l3.Id=l1.Id+2 and l1.Num=l2.Num and l1.Num=l3.Num;";

    /**
     * CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
     * BEGIN
     * SET N=N-1;
     * RETURN (
     * # Write your MySQL query statement below.
     * SELECT DISTINCT Salary FROM Employee GROUP BY Salary ORDER BY Salary DESC LIMIT 1 OFFSET N
     * );
     * END
     */
    public void nHighestScore() {
    }
}
