package main.sql;

public class SQL {
    private String secondHighestScore = "select Max(Salary) as SecondHighestSalary from Employee where (select Max(Salary) from Employee) > Salary;";
    private String scoreSort = "select Score, (select count(distinct Score) from Scores where Score >= s.Score ) Rank from Scores s Order by Score desc;";
    private String leftJoin = "SELECT FirstName, LastName ,City, State from Person LEFT JOIN Address on Person.PersonId = Address.PersonId;";

    /**
     * CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
     * BEGIN
     *   SET N=N-1;
     *   RETURN (
     *       # Write your MySQL query statement below.
     *       SELECT DISTINCT Salary FROM Employee GROUP BY Salary ORDER BY Salary DESC LIMIT 1 OFFSET N
     *   );
     * END
     */
    public void nHighestScore(){}
}
