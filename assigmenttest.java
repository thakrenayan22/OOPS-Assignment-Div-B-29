public class AssignmentTest {
public static void  main(String[] args){
    Assignment assignment1 = new Assignment("abc",20,15);
    assignment1.calculateGrade();
    System.out.println("Assignment 1 results : \nStudent Mark : " + assignment1.getStudentMark() + "\nGrade : " + assignment1.getGrade());
}
}
