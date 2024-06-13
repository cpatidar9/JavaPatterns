import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private int empId;
    private String empName;
    private int salary;
    private List<String> skillList;

    public Employee(int empId, String empName, int salary) {
        super();

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;

        skillList = new ArrayList<>();
        skillList.add("Java");
        skillList.add("Python");
    }

    /**
     * Creates and returns a copy of this object.  The precise meaning of "copy" may depend on the class of the object.
     * The general intent is that, for any object {@code x}, the expression:
     * <blockquote>
     * <pre>
     * x.clone() != x</pre></blockquote>
     * will be true, and that the expression:
     * <blockquote>
     * <pre>
     * x.clone().getClass() == x.getClass()</pre></blockquote>
     * will be {@code true}, but these are not absolute requirements. While it is typically the case that:
     * <blockquote>
     * <pre>
     * x.clone().equals(x)</pre></blockquote>
     * will be {@code true}, this is not an absolute requirement.
     * <p>
     * By convention, the returned object should be obtained by calling {@code super.clone}.  If a class and all of its
     * superclasses (except {@code Object}) obey this convention, it will be the case that
     * {@code x.clone().getClass() == x.getClass()}.
     * <p>
     * By convention, the object returned by this method should be independent of this object (which is being cloned).
     * To achieve this independence, it may be necessary to modify one or more fields of the object returned by
     * {@code super.clone} before returning it.  Typically, this means copying any mutable objects that comprise the
     * internal "deep structure" of the object being cloned and replacing the references to these objects with
     * references to the copies.  If a class contains only primitive fields or references to immutable objects, then it
     * is usually the case that no fields in the object returned by {@code super.clone} need to be modified.
     *
     * @return a clone of this instance.
     * @throws CloneNotSupportedException
     *         if the object's class does not support the {@code Cloneable} interface. Subclasses that override the
     *         {@code clone} method can also throw this exception to indicate that an instance cannot be cloned.
     * @implSpec The method {@code clone} for class {@code Object} performs a specific cloning operation. First,
     *         if the class of this object does not implement the interface {@code Cloneable}, then a
     *         {@code CloneNotSupportedException} is thrown. Note that all arrays are considered to implement the
     *         interface {@code Cloneable} and that the return type of the {@code clone} method of an array type
     *         {@code T[]} is {@code T[]} where T is any reference or primitive type. Otherwise, this method creates a
     *         new instance of the class of this object and initializes all its fields with exactly the contents of the
     *         corresponding fields of this object, as if by assignment; the contents of the fields are not themselves
     *         cloned. Thus, this method performs a "shallow copy" of this object, not a "deep copy" operation.
     *         <p>
     *         The class {@code Object} does not itself implement the interface {@code Cloneable}, so calling the
     *         {@code clone} method on an object whose class is {@code Object} will result in throwing an exception at
     *         run time.
     * @see Cloneable
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee)super.clone();

        // Deep copy
        employee.setSkillList(new ArrayList<>(skillList));
        return employee;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSkillList(List<String> skillList) {
        this.skillList = skillList;
    }

    public void addSkillList(String skill) {
        this.skillList.add(skill);
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", salary=" + salary + ", skillList="
                + skillList + '}';
    }
}
