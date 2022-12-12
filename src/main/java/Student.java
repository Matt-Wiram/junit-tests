import java.util.ArrayList;

public class Student {

    long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList grade) {
        this.id = id;
        this.name = name;
        this.grades = grade;
    }

    // returns the student's id
    public long getId(){return this.id;}

    // returns the student's name
    public String getName(){return this.name;}

    // adds the given grade to the grades list
    public void addGrade(int grade){grades.add(grade);}

    // returns the list of grades
    public ArrayList<Integer> getGrades(){return this.grades;}

    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    };
}
