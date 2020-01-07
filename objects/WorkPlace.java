package objects;

import java.util.ArrayList;
import java.util.List;

public class WorkPlace {
    private Department classType;
    private Boss boss;
    private List<Employee> employee;

//Constructor
    public WorkPlace(Department classType, Boss boss) {
        this.classType = classType;
        this.boss = boss;
        employee = new ArrayList<>();
    }

//Functionality
    public void addEmployee(Employee employee){
        this.employee.add(employee);
    }

//Getters and Setters
    public Department getClassType() {
        return classType;
    }

    public void setClassType(Department classType) {
        this.classType = classType;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "WorkPlace{" +
                "classType=" + classType +
                ", boss=" + boss +
                ", employee=" + employee +
                '}';
    }
}
