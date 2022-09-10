package course_work;

public class Employee {
    private final String employeeName;
    private int employeeSalary;
    private int employeeDepartment;

    static int counter;
    private int id = counter;

    public Employee(String employeeName,int employeeSalary,int employeeDepartment){

        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
        this.id=counter++;
    }
    public  String getEmployeeName() {

        return employeeName;
    }
    public int getEmployeeSalary() {

        return employeeSalary;
    }
    public int getEmployeeDepartment() {

        return employeeDepartment;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }




    @Override
    public String toString() {
        return  employeeName + " заработная плата:  " + employeeSalary + " "+"Департамент сотрудника:  "
                + employeeDepartment + " id сотрудника "+ id;
    }

}
