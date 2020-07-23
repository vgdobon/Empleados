public class Empleado {
    //id: int, firstName, lastName, salary
    private int id=0;
    private String firstName;
    private String lastName;
    private float salary;

    public Empleado(Company company,String firstName, String lastName, float salary) {
        this.setId(company.idNuevoEmpleado());
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
    }


    public float getAnnualSalary() {
        return this.salary * 12;
    }

    public void raiseSalary(int percent) {
        this.setSalary(this.getSalary() * percent/ 100 + this.getSalary());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
