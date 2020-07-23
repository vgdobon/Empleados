import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Empleado> listaEmpleados= new ArrayList<Empleado>();

    public Company(){

    }

    public void add(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public void printAl(){
        for (Empleado empleado:listaEmpleados){
            System.out.println(empleado);
        }
        for (int i = 0; i < listaEmpleados.size(); i++) {
            listaEmpleados.get(i);
        }
    }

    public float  totalSalary(){
        float salaryTotal=0;
        for (Empleado empleado:listaEmpleados){
            salaryTotal+=empleado.getSalary();
        }

        return salaryTotal;
    }

    public int size(){
        return listaEmpleados.size();
    }

    public int idNuevoEmpleado(){
        return listaEmpleados.size()+1;


    }


}
