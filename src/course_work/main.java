package course_work;

public class main {
    private static final Employee[] employees = new Employee[10];


    public static void main (String[]args){


        Employee employee0 = new Employee("Смирнов Дмитрий Иванович", 257860, 2);
        Employee employee1 = new Employee("Иванов Иван Иванович", 150460, 2);
        Employee employee2 = new Employee("Семенов Семен Семёнович", 80890, 3);
        Employee employee3 = new Employee("Петров Петор Петрович", 73010, 1);
        Employee employee4 = new Employee("Криворучка Олег Олегович", 200220, 4);
        Employee employee5 = new Employee("Платонов Платон Павлович", 78930, 5);
        Employee employee6 = new Employee("Сидоров Владимир Владимирович", 98040, 1);
        Employee employee7 = new Employee("Полкин Сафокл Яковлевич", 152430, 5);
        Employee employee8 = new Employee("Люстра Екатерина Евгеньевна", 150060, 3);
        Employee employee9 = new Employee("Носов Борис Игоревич", 250060, 4);

        employees[0]= employee0;
        employees[1]= employee1;
        employees[2]= employee2;
        employees[3]= employee3;
        employees[4]= employee4;
        employees[5]= employee5;
        employees[6]= employee6;
        employees[7]= employee7;
        employees[8]= employee8;
        employees[9]= employee9;


        System.out.println("Cуммa затрат на зарплаты в месяц: "+ salarySum());
        System.out.println();
        printNameEmployee();
        System.out.println();
        printAllEmployee();
        System.out.println();
        System.out.println("Минимальная зарплата: "+minSalaryEmployee());
        System.out.println();
        System.out.println("Максимальная зарплата: "+maxSalaryEmployee());
        System.out.println();
        System.out.println("Средняя зарплата сотрудников: "+middleSalaryEmployee());
        System.out.println();

    }



    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printNameEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeName());
        }
    }
    public static int minSalaryEmployee() {
        int minSalary = employees[0].getEmployeeSalary();
        for (Employee employee : employees) {
            if (employee.getEmployeeSalary()< minSalary) {
                minSalary=employee.getEmployeeSalary();
            }
        }
        return minSalary;
    }
    public static int maxSalaryEmployee() {
        int maxSalary = employees[0].getEmployeeSalary();
        for (Employee employee : employees) {
            if (employee.getEmployeeSalary()> maxSalary) {
                maxSalary=employee.getEmployeeSalary();
            }
        }
        return maxSalary;
    }
    public static int middleSalaryEmployee() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getEmployeeSalary();
        }
        return sum/employees.length;
    }
    public static int salarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getEmployeeSalary();
        }
        return sum;
    }


}


