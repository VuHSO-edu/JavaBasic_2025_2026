package lesson09;

/**
 * @author VuHSO
 * @created 5/18/2026
 */
public class TestEmployee {
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1); // toString();

        // Test Setters and Getters
        employee1.setSalary(999);
        System.out.println(employee1); // toString() sau khi set giá trị mới

        System.out.println("id is: " + employee1.getID());
        System.out.println("firstname is: " + employee1.getFirstName());
        System.out.println("lastname is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());
        System.out.println("name is: " + employee1.getName());

        // Test hàm getAnnualSalary()
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        // Test hàm raiseSalary()
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1); // Kiểm tra lại đối tượng sau khi tăng lương
    }
}