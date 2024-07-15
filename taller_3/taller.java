import java.util.Scanner;

public class taller {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //primera dimencion es numero total de empleados y su nombre
            //segundo es si tiene carro o moto: moto(0) y carro(1);
            //tercera es si que representa: 
            //0:marca
            //1:modelo
            //2:año
            //3:estado(pendiente, en reparacion, reparado)
            System.out.println("Ingrese la capacidad del taller: ");
            int capacidadTaller = scanner.nextInt();
            
            System.out.println("Ingrese la cantidad de trabajos: ");
            int cantidadTrabajos = scanner.nextInt();
            
            int vehiculo = 1;
            int tarabajosRegistrados = 0;
            String[][][] employees = new String[cantidadTrabajos][vehiculo][6];
            
            generarLista(employees, cantidadTrabajos ,capacidadTaller, tarabajosRegistrados);
            //mostrarEmployees(employees);
            //actualizarEstado(employees,scanner);
            //mostrarEmployees(employees);
            //buscar(employees,scanner);
            //contarEstado(employees);

            String opcion = "";
            
            if(cantidadTrabajos < capacidadTaller){
                opciones();
                System.out.print("Ingrese una opcion: ");
                opcion = scanner.nextLine();
            }
            
                
                while (opcion != "5") {
                    if(cantidadTrabajos > capacidadTaller){
                        System.out.println("La cantidad de trabajo es mayor a la capacidad del taller.");
                        return;
                    }
                    
                    switch (opcion) {
                        case "1":
                        System.out.println("Lista de vehiculos: ");
                        if(tarabajosRegistrados >= 0){
                            mostrarEmployees(employees);
                        }
                        else{
                            System.out.println("No hay vehiculos registrados");
                            opciones();
                        }
                        break;
                        
                        case "2":
                            System.out.println("Busqueda: ");
                            buscar(employees, scanner);
                        break;
                        
                        case "3":
                            System.out.println("Contar cuantos vehiculos hay dependiendo sus estados");
                            contarEstado(employees);
                        break;
                        
                        case "4":
                            System.out.println("Actualizar el estado de un vehiculo especifico:");
                            actualizarEstado(employees,scanner);
                        break;

                        case "5":
                            System.out.println("Saliste del programa");
                            opcion = "5";
                        break;
                        default:
                            System.out.println("Saliste del programa");
                            opcion = "5";
                        break;
                    }
                    
                    
                }
                mostrarEmployees(employees);
                scanner.close();
        }
    }

        public static void actualizarEstado(String [][][] employees, Scanner scanner){
                System.out.println("Ingrese el numero en donde se encuetra el vehiculo que quieres actualizar");
                int numeroVehiculo = scanner.nextInt();

                System.out.println("Ingrese el nuevo estado: ");
                String estado = scanner.next().toLowerCase();


                if (numeroVehiculo > 0 && numeroVehiculo <= employees.length) {
                    if(estado.equals("pendiente") || estado.equals("en reparacion") || estado.equals("reparado")){
                        employees[numeroVehiculo - 1][0][5] = estado;
                        System.out.println("El estado del trabajo ha sido actualizado.");
                    }
                    else{
                        System.out.println("El estado ingresado no es valido.");
                    }
                }
                else{
                    System.out.println("El numero ingresado no es valido.");
                }
            
        }

        //Contar cuantos vehiculos tiene algun estado en el array
        public static void contarEstado(String[][][] employees){
            int pendientes = 0;
            int enReparacion = 0;
            int reparado = 0;
            
            for (int i = 0; i < employees.length; i++) {
                for (int j = 0; j < employees[i].length; j++) {
                    if(employees[i][j][5].equals("pendiente")){
                        pendientes++;
                    }
                    else if(employees[i][j][5].equals("en reparacion")){
                        enReparacion++;
                    }
                    else if(employees[i][j][5].equals("reparado")){
                        reparado++;
                    }
                }
            }
            
            System.out.println("Cantidad de vehiculos pendientes: " + pendientes);
            System.out.println("Cantidad de vehiculos en reparación: " + enReparacion);
            System.out.println("Cantidad de vehiculos reparados: " + reparado);
        }

        //Buscar
    public static void buscar(String[][][] employees, Scanner scanner){
                System.out.println("Ingrese la marca que quieres buscar: ");
                String marca = scanner.nextLine().toLowerCase();
                //String marca = "yamaha";
                
                System.out.println("Ingrese el modelo que quieres buscar: ");
                String modelo = scanner.nextLine().toLowerCase();
                //String modelo = "mt";
                
                for (int i = 0; i < employees.length; i++) {
                    for (int j = 0; j < employees[i].length; j++) {
                        if(employees[i][j][2].equals(marca) && employees[i][j][3].equals(modelo)){
                            System.out.println("Vehiculo encontrado: ");
                            //mostrarEmployees(employees);

                            System.out.printf("| %-9s | %-9s | %-7s | %-4s | %-9s |\n",
                            employees[i][j][1], 
                            employees[i][j][2],
                            employees[i][j][3], 
                            employees[i][j][4],
                            employees[i][j][5]);
                            return;
                        }
                        else{
                            continue;
                        }
                    }
                }
        }
        
    //Generar
    public static void generarLista(String[][][] employees, int cantidadTrabajos, int capacidadTaller, int realizados){
            try (Scanner scanner = new Scanner(System.in)) {
                //employees = new String[capacidadTaller][1][6];
                
                if(cantidadTrabajos > capacidadTaller){
                    System.out.println("La cantidad de trabajo es mayor a la capacidad del taller.");
                    return;
                }
                
            for (int i = 0; i < employees.length; i++) {
                for (int j = 0; j < employees[i].length;) {
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine().toLowerCase();
                    scanner.nextLine();

                    System.out.println("Ingrese el tipo de vehiculo (moto(0) o carro(1)): ");
                    String tipoVehiculo = scanner.nextLine().toLowerCase();

                    if (!"0".equalsIgnoreCase(tipoVehiculo) && !"1".equalsIgnoreCase(tipoVehiculo)) {
                        System.out.println("El tipo de vehiculo debe ser moto o carro.");
                        return;
                    }
                    else{
                        if(tipoVehiculo.equals("0")){
                            tipoVehiculo = "moto";
                        }
                        else{
                            tipoVehiculo = "carro";
                        }
                    }


                    System.out.println("Ingrese la marca del vehiculo: ");
                    String marcaVehiculo = scanner.nextLine().toLowerCase();

                    System.out.println("Ingrese el modelo del vehiculo: ");
                    String modeloVehiculo = scanner.nextLine().toLowerCase();

                    System.out.println("Ingrese el año del vehiculo: ");
                    int anioVehiculo = scanner.nextInt();
                    scanner.nextLine();

                    if(anioVehiculo >= 1990 && anioVehiculo <= 2024){
                        System.out.println("");
                    }
                    else{
                        System.out.println("El año del vehiculo debe ser entre 1990 y 2024");
                        return;
                    }

                    System.out.println("Ingrese el estado del vehiculo (pendiente, en reparacion, reparado): ");
                    String estadoVehiculo = scanner.nextLine().toLowerCase();

                    employees[i][j][0] = nombreEmpleado;
                    employees[i][j][1] = tipoVehiculo;
                    employees[i][j][2] = marcaVehiculo;
                    employees[i][j][3] = modeloVehiculo;
                    employees[i][j][4] = String.valueOf(anioVehiculo);
                    employees[i][j][5] = estadoVehiculo;

                    //employees[i][j] = new String[]{nombreEmpleado, tipoVehiculo, marcaVehiculo, modeloVehiculo, String.valueOf(anioVehiculo), estadoVehiculo};
                    
                    System.out.println("Empleado registrado correctamente.");
                    System.out.println("");
                    realizados++;
                    break;
                }
            }

            scanner.close();
        }
        
    }

    public static void mostrarEmployees(String[][][] employees) {
        System.out.println("   Vehículo:    Marca:    Modelo:   Año:   Estado:");
        System.out.println("|-----------|-----------|---------|------|----------|");
    
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                // Imprimir cada fila de datos del empleado y vehículo
                System.out.printf("| %-9s | %-9s | %-7s | %-4s | %-9s |\n",
                        employees[i][j][1], 
                        employees[i][j][2],
                        employees[i][j][3], 
                        employees[i][j][4],
                        employees[i][j][5]);
                //System.out.println("Nombre " + employees[i][j][0]);
                //System.out.println("Vehiculo" + employees[i][j][1]);
                //System.out.println(Arrays.toString(employees[i][j]));
                
            }
        }
    }

    public static void opciones() {
        System.out.println("""
                Menu de opciones:
                1. Mostrar lista de vehiculos
                2. Buscar informacion con su marca y modelo
                3. Contar vehiculos por estado
                4. Actualizar el estado de un vehiculo
                5. Salir
                """);
    }
    
}