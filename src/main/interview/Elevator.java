package main.interview;

/**
 * Created by wong on 2019/4/21.
 */
public class Elevator {

    public static class Task {
        public double cirTime;
        public double avgCarry;

        public Task(double cirTime, double avgCarry) {
            this.cirTime = cirTime;
            this.avgCarry = avgCarry;
        }
    }

    private static double peoplePerFloor = 100.0;
    public static int timePerFloor = 5;
    public static int timePerWait = 20;

    public static double rushHour = 3600.0;

    public static int floorCount = 12;
    public static int elevatorCount = 3;

    private static double[] building = new double[floorCount];

    public static void initBuilding() {
        for (int i = 0; i < 12; i++) {
            building[i] = peoplePerFloor;
        }
    }

    public static Task eleLoop(int[] e, int i) {
        double floorsServiced = e[i] - e[i - 1] + 1;
        double cirTime = timePerFloor * e[i] * 2;
        cirTime += timePerWait * floorsServiced;
        double avgCarry = cirTime * peoplePerFloor / rushHour * floorsServiced;
        return new Task(cirTime, avgCarry);
    }


    public static int[] addFloor(int[] e) {
        double best = 9999;
        int elevatorNumber = 0;
        for (int i = 1; i < e.length; i++) {
            Task task = eleLoop(e, i);
            if (task.cirTime + ((task.cirTime / 100) * task.avgCarry) < best) {
                elevatorNumber = i;
                best = task.cirTime + ((task.cirTime / 100) * task.avgCarry);
            }

        }
        for (int i = elevatorNumber; i < e.length; i++) {
            e[i] += 1;
        }
        return e;
    }

    public static void printApprox(double[] building) {
        String str = "[  ";
        for (int i = 0; i < building.length; i++) {
            str += String.format("%06.3f  ", building[i]);
            str += "]";
        }
        System.out.println(str);
    }

    public static void printeleLoop(int[] e) {
        System.out.println(" ");
        System.out.println(e);
        System.out.println(" ");
        for (int i = 1; i < e.length; i++) {
            double floorsServiced = e[i] - e[i - 1] + 1;
            double curr = timePerFloor * e[i] * 2;
            curr += timePerWait * floorsServiced;
            double avgCarry = curr * peoplePerFloor / rushHour * floorsServiced;
            String str = "Elevator " + i + " time for loop seconds, " + curr;
            str += "carrying an average of ";
            str += String.format("%3.2f people per carry'", avgCarry);
            System.out.println(str);
            System.out.println(" ");
        }
    }

    public static int[] elevatorAllocation(double[] building, int elevatorCount) {
        int[] elevator = new int[elevatorCount];
        for (int i = 0; i < elevatorCount; i++) {
            elevator[i] = 0;
        }
        for (int j = 0; j < floorCount; j++) {
            elevator = addFloor(elevator);
        }
        printeleLoop(elevator);
        return elevator;
    }

    public static void simulate(int[] e, double[] building) {
        String str = "[  ";
        for (double floor : building) {
            str += "floor  " + floor + 1;
        }
        str += "]";
        System.out.println(str);
        double[] eCircuit = new double[100];
        for (int i = 1; i < e.length; i++) {
            Task task = eleLoop(e, i);
            eCircuit[i] = task.cirTime;
        }

        int emptyFloors = 0;
        double iteration = 0;
        int finalFloor = 0;

        while (emptyFloors < building.length) {
            emptyFloors = 0;
            iteration += 1;
            for (int i = 1; i < e.length; i++) {
                for (int j = e[i - 1]; j < e[i]; j++) {
                    if (building[j] > 0.0) {
                        double persons = eCircuit[i] * peoplePerFloor / rushHour;
                        building[j] = building[j] - persons;
                    }
                    if (0 >= building[j]) {
                        building[j] = 0.0;
                        emptyFloors += 1;
                        finalFloor = j;
                    }
                }
            }
            printApprox(building);

        }
        System.out.println(" ");
        for (int i = 0; i < e.length; i++) {
            if (e[i] > finalFloor) {
                iteration = eCircuit[i] * iteration / 60;
                System.out.println("Total Time:" + iteration + "minutes\n");
            }
        }
    }


    public static void main(String[] args) {
        initBuilding();
        int[] elevator = elevatorAllocation(building, elevatorCount);
        simulate(elevator, building);

    }
}
