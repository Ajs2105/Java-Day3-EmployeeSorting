
import java.util.*;

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

    }
    @Override
    public String toString(){
         return "Employee{name='"+name+"',age="+age+",salary="+salary+"}";
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

     public static void main(String[] args) {
        // Step 3: Store multiple employees in ArrayList
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ashwin", 23, 55000));
        employees.add(new Employee("Poonam", 25, 65000));
        employees.add(new Employee("Ramesh", 28, 45000));
        employees.add(new Employee("Kiran", 22, 50000));

        System.out.println("Original List:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Step 4: Sort by salary (descending)
        Collections.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\nSorted by Salary (Descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Step 5: Sort by name (ascending)
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nSorted by Name (Ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
