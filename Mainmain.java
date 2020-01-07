package runner;

import objects.*;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mainmain {
    public static void main(String[] args) {

        Random rand = new Random();
        Employee employee1 = new Employee("Omer", 23);
        Employee employee2 = new Employee("Dylan", 23);
        Employee employee3 = new Employee("Edann", 23);
        Employee employee4 = new Employee("fart", 23);
        Employee employee5 = new Employee("lalala", 23);
        Employee employee6 = new Employee("yayman", 23);
        Employee employee7 = new Employee("radical", 23);
        Employee employee8 = new Employee("muki", 23);
        Employee employee9 = new Employee("shitface", 23);
        Employee employee10 = new Employee("morlan", 23);
        Employee employee11 = new Employee("dude", 23);
        Employee employee12 = new Employee("man", 23);
        Boss devBoss = new Boss("Jake", 23);
        Boss qaBoss = new Boss("Jake2", 23);
        Boss hrBoss = new Boss("Jake3", 23);
        Boss graphicsBoss = new Boss("Jake4", 23);
        List<Employee> devList = new ArrayList<>();
        List<Employee> qaList = new ArrayList<>();
        List<Employee> hrList = new ArrayList<>();
        List<Employee> graphicsList = new ArrayList<>();
        devList.add(employee1);
        devList.add(employee2);
        devList.add(employee3);
        qaList.add(employee4);
        qaList.add(employee5);
        qaList.add(employee6);
        hrList.add(employee7);
        hrList.add(employee8);
        hrList.add(employee9);
        graphicsList.add(employee10);
        graphicsList.add(employee11);
        graphicsList.add(employee12);
        initEmployeeSalary(devList, Department.DEV);
        initEmployeeSalary(qaList, Department.QA);
        initEmployeeSalary(hrList, Department.HR);
        initEmployeeSalary(graphicsList, Department.GRAPHICS);
        initBossSalary(devBoss, Department.DEV);
        initBossSalary(qaBoss, Department.QA);
        initBossSalary(hrBoss, Department.HR);
        initBossSalary(graphicsBoss, Department.GRAPHICS);
        WorkPlace devPlace = new WorkPlace(Department.DEV, devBoss);
        devPlace.setEmployee(devList);
        WorkPlace qaPlace = new WorkPlace(Department.QA, qaBoss);
        qaPlace.setEmployee(qaList);
        WorkPlace hrPlace = new WorkPlace(Department.HR, hrBoss);
        hrPlace.setEmployee(hrList);
        WorkPlace graphicsPlace = new WorkPlace(Department.GRAPHICS, graphicsBoss);
        graphicsPlace.setEmployee(graphicsList);
        System.out.println(devPlace);
        System.out.println(qaPlace);
        System.out.println(hrPlace);
        System.out.println(graphicsPlace);
    }

    public static void initEmployeeSalary(List<Employee> employees, Department department){
        Random rand = new Random();
        for (Person employee:employees) {
            initBossSalary(employee, department);
        }
    }

    public static void initBossSalary(Person boss, Department department){
        Random rand = new Random();
        int[] minMax = whatSalary(department);
        for (int i = 0; i < Month.values().length; i++) {
            boss.getSalary().addSalary(rand.nextInt(minMax[1] - minMax[0])+minMax[0]);
        }
    }

    public static int[] whatSalary(Department department){
        int[] minMax = new int[2];

        switch (department){
            case DEV:
                minMax[0] = 14000;
                minMax[1] = 18000;
                break;
            case QA:
                minMax[0] = 8000;
                minMax[1] = 12000;
                break;
            case HR:
                minMax[0] = 10000;
                minMax[1] = 12000;
                break;
            case GRAPHICS:
                minMax[0] = 14000;
                minMax[1] = 16000;
                break;
        }
        return minMax;
    }
}

