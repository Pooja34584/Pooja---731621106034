package pooja2;


class Employee{
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee() {
        System.out.println("Adding a new employee.");
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        HRManager manager = new HRManager(70000);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());

        manager.work();
        System.out.println("Manager salary: " + manager.getSalary());
        manager.addEmployee();
    }
}