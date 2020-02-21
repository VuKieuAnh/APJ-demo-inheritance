package person;

public class Employee {
    protected String name;
    private Float salary;

    public Employee() {
    }

    public Employee(String name, Float salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showSalry(){
        System.out.println("Day la luong cua NV");
    }
}
