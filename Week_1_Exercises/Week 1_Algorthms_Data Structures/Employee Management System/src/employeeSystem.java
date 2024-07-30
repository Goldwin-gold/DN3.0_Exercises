public class employeeSystem {
    private Employee[] employees;
    private int size;

    public employeeSystem(int load){
        employees=new  Employee[load];
        size=0;
    }
    public void add(Employee employee){
        if(size<employees.length){
            employees[size++]=employee;
        }else{
            System.out.println("the size of the array is full");
        }
    }

    public Employee search(int employee){
        for(int i=0;i<size;i++){
            if(employees[i].getEmployeeId()==employee){
                return employees[i];
            }
        }
        return null;
    }

    public void travers(){
        for(int i=0;i<size;i++){
            System.out.println(employees[i]);
        }
    }

    public void delete(int employee){
        for(int i=0;i<size;i++){
            if(employees[i].getEmployeeId()==employee){
                for(int j=i;j<size-1;j++){
                    employees[j]=employees[j+1];
                }
            }else{
                System.out.println(" not found");
            }
        }
    }
}
