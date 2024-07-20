package Empleados;

public class Empleado extends Persona{
    private Integer idEmpleado;
    private double salario;
    private String tipoEmpleado;

    public Empleado(String nombre, int edad, Integer idEmpleado, double salario, String tipoEmpleado){
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
    } 

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public String getEmpleado(){
        return " Id:" + idEmpleado + " Nombre: " + super.getNombre() 
        + " Edad: " + super.getEdad() + " Salario: " + salario + " Estado: " + tipoEmpleado;
    }
}
