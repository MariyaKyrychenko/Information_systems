import java.util.ArrayList;
import java.util.Iterator;

public class Department extends Company {

    private String name;
    private String salary;
    private ArrayList<Company> dir = new ArrayList();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String getSalary() {
    return salary;
    }
    
    public Company add(Company company) {
        dir.add(company);
        return this;
    }

    public Iterator<Company> iterator() {
        return dir.iterator();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}