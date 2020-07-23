public class Main {

    // Empleado [PENDINTE]
    //Crear una clase Empleado que tenga:
    //- Constructor (id: int, firstName, lastName, salary)
    //- setters y getters
    //- getAnnualSalary() (salary * 12)
    //- raiseSalary(percent: int) (% sobre su salario)
    //- toString() ["Employee[id=?,name=firstName, lastName....]"]

    public static void main(String[] args) {
        Company company = new Company();


        Empleado empleado = new Empleado(company,"Javier","Fernandez",1000f);
        System.out.println(empleado.getId());

        Empleado empleado2 = new Empleado(company,"Javier","Fernandez",1000f);
        System.out.println(empleado.getId());

        System.out.println(company.idNuevoEmpleado());
        company.add(empleado);
        System.out.println(company.idNuevoEmpleado());
        company.add(empleado2);
        System.out.println(company.idNuevoEmpleado());
        System.out.println(empleado.getId());
        System.out.println(empleado2.getId());


        System.out.println(company.totalSalary());
        System.out.println(company.size());



    }
}
