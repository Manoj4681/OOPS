// question 14 
class Employee {

    protected String name;
    protected int employeeID;
    protected double salary;

  
    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }


    public double calculateSalary() {
        return salary;  
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + calculateSalary());
    }
}


class RegularEmployee extends Employee {
    public RegularEmployee(String name, int employeeID, double salary) {
        super(name, employeeID, salary);  
    }

 
    public double calculateSalary() {
        return salary; 
    }
}


class Manager extends Employee {
   
    private double bonus;

    public Manager(String name, int employeeID, double salary, double bonus) {
        super(name, employeeID, salary); 
        this.bonus = bonus;
    }

    
    public double calculateSalary() {
        return salary + bonus; 
    }

    public void displayDetails() {
        super.displayDetails();  
        System.out.println("Bonus: " + bonus);
    }
}

public class employee14 {
    public static void main(String[] args) { 
      System.out.println(" M.N.H.O.K . MANOJ " );
        System.out.println("CSE- C  CSE24214 " );
      
        RegularEmployee regularEmployee = new RegularEmployee("manoj", 500, 230000);
        System.out.println("Regular Employee Details:");
        regularEmployee.displayDetails();
        System.out.println();


        Manager manager = new Manager("krishna", 2222, 40000, 34000);
        System.out.println("Manager Details:");
        manager.displayDetails();
    }
}
