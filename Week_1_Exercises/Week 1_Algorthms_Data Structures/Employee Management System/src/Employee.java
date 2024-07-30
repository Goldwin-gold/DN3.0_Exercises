public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    public Employee(int employeeId, String name, String position, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "employeeId=" + employeeId +
                ", name='" + name +
                ", position='" + position  +
                ", salary='" + salary  +
                ']';
    }

    public static void main(String[] args) {
        employeeSystem ems=new employeeSystem(5);
        ems.add(new Employee(1,"parker","developer",2000));
        ems.add(new Employee(2,"peter","manager",500000));
        System.out.println("traversing");
        ems.travers();
        System.out.println("Searching");
        Employee found=ems.search(2);
        System.out.println(found);
        System.out.println("deleting");
        ems.delete(1);
    }

}
