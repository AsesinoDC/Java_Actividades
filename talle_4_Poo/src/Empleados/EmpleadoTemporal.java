package Empleados;

public class EmpleadoTemporal extends Empleado{
    public String tipoEmpleado = "temporal";
    public EmpleadoTemporal(String nombre, int edad, Integer idEmpleado, double salario, String tipoEmpleado){
        super(nombre, edad, idEmpleado, salario,tipoEmpleado);
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
