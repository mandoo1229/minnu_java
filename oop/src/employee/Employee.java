package employee;

public class Employee {
    private int id;
    private String firstName = "";
    private String lastName;
    private int salary;

    public Employee (int i, String f, String l, int s ) {
        this.id = i;
        this.firstName = f;
        this.lastName = l;
        this.salary = s;
    }
    public int getID() {
        return id;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }
    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary * percent /100;
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format ("Employee[id = %s, name = %s, salary = %d]", id, getName(), salary);
    }
}
