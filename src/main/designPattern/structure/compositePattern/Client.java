package main.designPattern.structure.compositePattern;

/**
 * 要点：用于表示"部分-整体"的树形结构·
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        Employee ceo = new Employee("wong", "all", 1000000);
        Employee techLeader = new Employee("zhang", "tech", 20000);
        Employee engineerA = new Employee("wu", "tech", 3000);
        Employee engineerB = new Employee("li", "tech", 3000);
        ceo.addEmployee(techLeader);
        techLeader.addEmployee(engineerA);
        techLeader.addEmployee(engineerB);

        System.out.println(ceo.toString());
    }
}
