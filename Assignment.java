public class Assignment{
    String studentName;
    double assignmentMark;
    double studentMark;
    private String grade;

    public String getGrade() {
        return grade;
    }

    public double getStudentMark() {
        return studentMark;
    }

    public Assignment(){
        this.studentName = "abc";
        this.studentMark = 30;
        this.assignmentMark = 100;
    }

    public Assignment(String studentName, double assignmentMark, double studentMark){
        this.studentName = studentName;
        this.studentMark = studentMark;
        this.assignmentMark = assignmentMark;
    }

    public void setStudentMark(double studentMark){
        if(studentMark < 0 || studentMark > this.assignmentMark)
            System.out.println("Student mark should be between 0 and " + this.assignmentMark);
        else
            this.studentMark = studentMark;
    }

    public void calculateGrade(){
        double percentage = this.studentMark / this.assignmentMark * 100;
        if(percentage < 50.00)
            this.grade = "Fail";
        else if(percentage >= 50.00 && percentage<= 64.00)
            this.grade = "Pass";
        else if(percentage >= 65.00 && percentage<= 74.00)
            this.grade = "Credit";
        else if(percentage >= 75.00 && percentage<= 84.00)
            this.grade = "Distinction";
        else if(percentage >= 85)
            this.grade = "High Distinction";
    }
}


