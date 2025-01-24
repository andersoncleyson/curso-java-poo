package introducaoPOO.domain;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        double taxIncrease = (this.grossSalary * percentage) / 100;
        this.grossSalary += taxIncrease;

    }

    @Override
    public String toString() {
        return "Employee: " + this.name +
                ", $ " + String.format("%.2f", netSalary());
    }
    
}
