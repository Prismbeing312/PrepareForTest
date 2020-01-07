package objects;

import java.util.HashSet;

public class Company {
    private String name;
    private HashSet<WorkPlace> workPlace;

    public Company(String name) {
        this.name = name;
        workPlace = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<WorkPlace> getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(HashSet<WorkPlace> workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", workPlace=" + workPlace +
                '}';
    }
}
