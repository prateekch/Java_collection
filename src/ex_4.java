import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee  {
   private Double Age;
   private Double Salary;
   private String Name;

    Employee(Double Age, Double Salary, String Name) {
        this.Age = Age;
        this.Salary = Salary;
        this.Name = Name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getAge() {

        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }

}

class EmployeeSalary implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary());
    }

}

public class ex_4 {
    public static void main(String[] args) {
        ArrayList<Employee> arr=new ArrayList<Employee>();
        arr.add(new Employee(26.00,30000.00,"AKASH"));
        arr.add(new Employee(32.00,50000.00,"AKHIL"));
        arr.add(new Employee(21.00,15000.00,"KAPIL"));
        arr.add(new Employee(28.00,10000.00,"DEEPAK"));
       Collections.sort(arr,new EmployeeSalary().reversed());
        System.out.println("NAME        AGE     SALARY");
       for(Employee e:arr){
           System.out.println(e.getName()+"       "+e.getAge()+"    "+e.getSalary());
       }
    }
}
