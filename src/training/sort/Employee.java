package training.sort;

public class Employee implements Comparable<Employee> {
    private String dept;
    private String name;
    private int age;

    public Employee(String dept, String name, int age) {
        this.dept = dept;
        this.name = name;
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
