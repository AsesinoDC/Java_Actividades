package Empleados;

public class EmpleadoPermanente extends Empleado{
    public String tipoEmpleado = "permanente";

    public EmpleadoPermanente(String nombre, int edad, Integer idEmpleado, double salario, String tipoEmpleado){
        super(nombre, edad, idEmpleado, salario, tipoEmpleado);
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    /* public String getEmpleado(){
        return " Id:" + super.getIdEmpleado() + " Empleado: " + super.getNombre() 
        + " Edad: " + super.getEdad() + " Salario: " + super.getSalario() + " Estado: " + tipoEmpleado;
    } */
}
