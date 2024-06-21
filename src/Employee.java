import java.util.Objects;

public class Employee {
    private int id;
    private int department;
    private String firstName;
    private String lastName;
    private String additiveName;
    private double monthSalary;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdditiveName(String additiveName) {
        this.additiveName = additiveName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdditiveName() {
        return additiveName;
    }

    public int getDepartment() {
        return department;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Код(id)=" + id +
                ", Отдел(department)=" + department +
                ", Фамилия(lastName)='" + firstName + '\'' +
                ", Имя(firstName)='" + lastName + '\'' +
                ", Отчество(additiveName)='" + additiveName + '\'' +
                ", Месячный оклад(monthSalary)=" + monthSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Double.compare(monthSalary, employee.monthSalary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(additiveName, employee.additiveName);
    }

    @Override
    public int hashCode() {
        System.out.println(id);
        return Objects.hash(id, department, firstName, lastName, additiveName, monthSalary);
    }
}
