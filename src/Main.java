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

        company.add(empleado);
        Empleado empleado2 = new Empleado(company,"María","Fernandez",1000f);

        company.add(empleado2);
        Empleado empleado3 = new Empleado(company,"Manolo","CabezaBolo",1000f);
        company.add(empleado3);


        System.out.println(empleado.getId());
        System.out.println(empleado2.getId());
        System.out.println(empleado3.getId());


        System.out.println(company.totalSalary());
        System.out.println(company.size());



    }
}
