public class Main {
    public static void main(String[] args) {

        Department company = new Department("Company");
        Department development = new Department("Development Department");
        Department management = new Department("Management Department");
        company.add(development);
        company.add(management);

        Employee employee_1 = new Employee("Team Leader", "15 000");
        Employee employee_2 = new Employee("Deputy Leader", "15 000");
        Employee employee_3 = new Employee("Developer", "10 000");
        Employee employee_4 = new Employee("Quality manager", "15 000");
        Employee employee_5 = new Employee("Sales Manager", "15 000");
        Employee employee_6 = new Employee("Project Manager", "10 000");
        development.add(employee_1);
        development.add(employee_2);
        development.add(employee_3);
        management.add(employee_4);
        management.add(employee_5);
        management.add(employee_6);

        company.accept(new ListVisitor());
    }
}