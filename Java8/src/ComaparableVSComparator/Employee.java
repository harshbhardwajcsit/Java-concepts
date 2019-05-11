package ComaparableVSComparator;

public class Employee implements Comparable<Employee> {

    private  Integer age;
    private  String name;
    private  Double salary;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(Integer age, String name, Double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public int compareTo(Employee o) {
        if(this.age.equals(o.age)){
            return 0;

        }else if(this.age > o.age) {
            return 1;
        }else {
            return -1;
        }
    }
}
