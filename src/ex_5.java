import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String Name;
    private Double Score;
    private Double Age;

    Student(String Name, Double Score, Double Age) {
        this.Age = Age;
        this.Name = Name;
        this.Score = Score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }

}
class StudentCompare implements Comparator<Student> {
    @Override
    public int compare(Student student, Student student1) {
        if (student.getScore() - student1.getScore()==0) {
            return student.getName().compareTo(student1.getName());
        } else {
            return (int) (student.getScore() - student1.getScore());

        }
    }
}

public class ex_5 {
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(new Student("JOHNSON",87.00,18.00));
        arr.add(new Student("SURESH",90.00,17.00));
        arr.add(new Student("AKSHAY",87.00,17.00));
        arr.add(new Student("AJAY",90.00,17.00));
        arr.add(new Student("RAMESH",60.00,18.00));
        Collections.sort(arr,new StudentCompare() );

        for(Student s:arr){
            System.out.println(s.getName()+"    "+s.getAge()+"      "+s.getScore());
        }

    }
}
