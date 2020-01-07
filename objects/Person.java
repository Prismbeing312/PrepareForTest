package objects;

public class Person {
    private String name;
    private int age;
    protected Salary salary;
//Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        salary = new Salary();
    }


//Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "The Salaries are: " + salary;
    }
}
