package Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmplados {
    public void gestionEmpleados(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Integer idEmpleado = 1;

        String opcion = "";
        do {
            System.out.println("""
                    1. Agregar empleado
                    2. Mostrar empleado
                    3. Eliminar empleado
                    4. Salir
                    """);

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                System.out.println("Ingresar empleados");
                System.out.println("Cuantos empleados quieres ingresar");
                int cantidad = scanner.nextInt();
                for (int i = 0; i < cantidad; i++) {
                    listaEmpleados.add(añadirEmpleado(scanner,idEmpleado));
                    idEmpleado++;
                }
                break;

                case "2":
                System.out.println("Lista de empleados");
                mostrarEmpleados(listaEmpleados);
                break;

                case "3":
                System.out.println("Eliminar empleado");
                eliminarEmpleado(scanner, listaEmpleados);
                break;

                case "4":
                System.out.println("Saliste del programa");
                return;
            
                default:
                    break;
            }
            
        } while (opcion != "4");
    }

    public Empleado añadirEmpleado(Scanner scanner, Integer idEmpleado){
        Empleado empleado = null;
        System.out.println("Nombre:");
        String nombre = scanner.next().toLowerCase();
        
        System.out.println("Edad:");
        int edad = scanner.nextInt();
        
        System.out.println("Sueldo:");
        double sueldo = scanner.nextDouble();

        System.out.println("Tipo de empleado: (0)temporal - (1)-permanente");
        String tipo = scanner.next().toLowerCase();

        
        if (tipo.equals("temporal") || tipo.equals("0")){
            tipo = "temporal";
            empleado = new EmpleadoTemporal(nombre, edad, idEmpleado, sueldo, tipo);
            //emplados.add(empleado);
        }
        else if (tipo.equals("permanente") || tipo.equals("1")){
            tipo = "permanente";
            empleado = new EmpleadoPermanente(nombre, edad, idEmpleado, sueldo, tipo);
            //emplados.add(empleado);
        }
        else{
            System.out.println("Tipo de empleado no valido");
        }
        
        return empleado;
        
    }

    public void mostrarEmpleados(ArrayList<Empleado> emplados){
        for (Empleado empleado : emplados) {
            System.out.println(empleado.getEmpleado());
        }
    }

    public void eliminarEmpleado(Scanner scanner, ArrayList<Empleado> emplados){
        System.out.println("Ingrese el id del empleado a eliminar:");
        int idEmpleado = scanner.nextInt();
        boolean find = false;
        for (int i = 0; i < emplados.size(); i++) {
            if(emplados.get(i).getIdEmpleado() == idEmpleado){
                emplados.remove(i);
                find = true;
                System.out.println("Empleado removido exitosamente");
            }
        }

        if (!find) {
            System.out.println("No se encontro algun empleado con el id: " + idEmpleado);
        }
    }

}
