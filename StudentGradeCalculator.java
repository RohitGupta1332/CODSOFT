import java.util.Scanner;

public class StudentGradeCalculator {
    private String name;
    private int[] marks;
    private int totalMarks;

    public StudentGradeCalculator(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public int getTotalMarks(){
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
        }
        return sum;
    }
    public double calculateAverage(){
        double avg = 0.0;
        avg = (double) getTotalMarks() /marks.length;
        return avg;
    }
    public String grade(){
        double avgMarks = calculateAverage();
        String grade;
        if(avgMarks >= 90)
            grade = "AA";
        else if(avgMarks >= 80)
            grade = "A";
        else if(avgMarks >= 70)
            grade = "B";
        else if(avgMarks >= 60)
            grade = "C";
        else if(avgMarks >= 50)
            grade = "D";
        else
            grade = "E";
        return grade;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + grade());
    }
}
class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks of 5 subjects: ");
        for(int i = 0; i < 5; i++){
            marks[i] = sc.nextInt();
        }
        StudentGradeCalculator st = new StudentGradeCalculator(name, marks);
        st.display();

        sc.close();
    }
}
