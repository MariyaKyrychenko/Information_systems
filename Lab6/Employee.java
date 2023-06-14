public class Employee extends Company {

    private String name;
    private String salary;

    public Employee(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    
    public String getSalary() {
      return salary;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}