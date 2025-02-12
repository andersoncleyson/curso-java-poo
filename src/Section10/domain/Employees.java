package Section10.domain;

public class Employees {
    private Integer id;
    private String name;
    private Double salary;

    public Employees(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary = salary * (1 + (percentage / 100));
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " +  String.format("%.2f", this.salary);
    }
}
