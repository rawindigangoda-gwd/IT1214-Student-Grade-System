public class Student {
   private String studentID;
    private String studentName;
    private double marks;

    // Constructor
    public Student(String studentID, String studentName, double marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Getters
    public String getStudentID() { return studentID; }
    public String getStudentName() { return studentName; }
    public double getMarks() { return marks; }

    // Display info
    public void displayStudent() {
        System.out.println("ID: " + studentID + " | Name: " + studentName + " | Marks: " + marks);
    } 
}
