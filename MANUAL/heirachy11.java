// questiion 11 
class Employee {
    
    public void work() {
        System.out.println("Employee are singig songs and  not doinmg work ");
    }

    public double getSalary() {
        return 100000.0;  
    }
}


class HRManager extends Employee {
    
    public void work() {
        System.out.println("HR Manager is helping employee record songs ");
    }

       public void addEmployee() {
        System.out.println("HR Manager is adding a new employee who have capabilities of singing songs ");
    }
}

public class heirachy11 {
    public static void main(String[] args) {

    System.out.println(" M.N.H.O.K . MANOJ ");
        System.out.println("CSE-C  CSE24214 ");

                Employee emp = new Employee();
        emp.work(); 
        System.out.println("Employee Salary: " + emp.getSalary());

        System.out.println();
             System.out.println("------------------------------");

        HRManager hrManager = new HRManager();
        hrManager.work();  
        hrManager.addEmployee();  
        System.out.println("HR Manager Salary: " + hrManager.getSalary());      }
}
