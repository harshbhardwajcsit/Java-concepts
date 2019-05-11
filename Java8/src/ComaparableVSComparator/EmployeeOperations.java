package ComaparableVSComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeOperations {
    public static void main(String[] args) {


        Employee e1 = new Employee(25, "harsh", 1000.0);
        Employee e2 = new Employee(22, "harsh1", 1200.0);
        Employee e3 = new Employee(23, "harsh2", 1300.0);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        for (Employee e : employees) {
            System.out.println(e.getAge());
        }


        Collections.sort(employees);

        System.out.println("sorting on the basis of age");

        for (Employee e : employees) {
            System.out.println(e.getAge());
        }

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() == o2.getSalary()){
                    return 0;
                }else if(o1.getSalary() > o2.getSalary()){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Collections.sort(employees,comparator);
        System.out.println("sorting on the basis of salary");

        for (Employee e : employees) {
            System.out.println(e.getSalary());
        }
    }
}
