public class EmployeeManagementSystem {

    static class Employee {
        int employeeId;
        String name;
        String position;
        double salary;

        public Employee(int employeeId, String name, String position, double salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        public void display() {
            System.out.println("ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
        }
    }

    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee array is full.");
        }
    }

    public void searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                System.out.println("Employee found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void traverseEmployees() {
        System.out.println("All Employees:");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    public void deleteEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1]; 
                }
                employees[--count] = null; 
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(1, "Akil", "Senior Developer", 70000));
        ems.addEmployee(new Employee(2, "Brindha", "Junior Developer", 50000));
        ems.addEmployee(new Employee(3, "Charu", "HR", 45000));

        ems.traverseEmployees();

        ems.searchEmployee(2);
        ems.deleteEmployee(2);
        ems.searchEmployee(2);
        ems.traverseEmployees();
    }
}
