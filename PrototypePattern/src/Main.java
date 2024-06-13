public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee1 = new Employee(100, "aaa", 100);
        Employee employee2 = (Employee)employee1.clone(); // shallow copy

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.setSalary(33);
        employee1.addSkillList("DND");

        System.out.println(employee1);
        System.out.println(employee2);
    }
}