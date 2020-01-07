package objects;

import java.util.ArrayList;
import java.util.List;

public class Salary {
    private List<Integer> salaries;

    public Salary() {
        this.salaries = new ArrayList<>(12);
    }

    public void addSalary(int salaryAdd){
        salaries.add(salaryAdd);
    }

    public List<Integer> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Integer> salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salaries=" + salaries +
                "}\n";
    }
}
