import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String organization = "";

    public void visit(Employee employee) {
        System.out.println(organization + ": " + employee);
    }

    public void visit(Department department) {
        System.out.println(organization + " | " + department);
        System.out.println("-----------------------------------");
        String saveInfo = organization;
        organization = organization + "-> " + department.getName();
        Iterator<Company> iterator = department.iterator();
        while (iterator.hasNext()) {
            Company company = iterator.next();
            company.accept(this);
        }
        System.out.println("-----------------------------------");
        organization = saveInfo;
    }
}