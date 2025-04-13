

public class Student {

    private int student_id;
    private String student_name;
    private String grades = ""; 

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int id) {
        student_id = id;
    }


    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String name) {
        student_name = name;
    }


    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            if (grades.isEmpty()) {
                grades = Double.toString(grade);
            } else {
                grades += ", " + grade;
            }
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }


    public void printGrades() {
        System.out.println("Grades: " + grades);
    }


    public static void main(String[] args) {
    
     System.out.println(" did by M.N.H.O.K .MANOJ  CSE - C CSE24214 "); 
        Student s = new Student();

        s.setStudentId(1);
        s.setStudentName("manoj");

        s.addGrade(90);
        s.addGrade(75.5);
        s.addGrade(105); 
        s.addGrade(-5);  

        System.out.println("ID: " + s.getStudentId());
        System.out.println("Name: " + s.getStudentName());
        s.printGrades();
    }
}

        
   