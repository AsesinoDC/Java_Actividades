package Cursos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionCursos {

    public void gestionCursos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gestion de cursos");

        ArrayList<Cursos> cursos = new ArrayList<>();

        int codigoCurso = 1;
        String opcion = "";
        do {
            System.out.println("""
                    1. Agregar curso
                    2. Poner estudiantes en cursos
                    3. Mostrar lista de estudiantes por curso
                    4. Salir
                    """);
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                cursos.add(agregarCurso(scanner, codigoCurso));
                codigoCurso++;
                break;

                case "2":
                System.out.println();
                System.out.println("Ingresar estudaintes a los cursos: ");
                mostrarCurso(cursos);
                agregarEstudiante(scanner, cursos);
                break;

                case "3":
                mostrarCurso(cursos);
                mostrarEstudiantesPorCurso(scanner, cursos);
                break;

                case "4":
                System.out.println("Saliste del programa");
                return;
            
                default:
                    break;
            }
        } while (opcion != "4");
    }

    public void mostrarEstudiantesPorCurso(Scanner scanner, ArrayList<Cursos> cursos){
        System.out.println("Ingrese el codigo del curso: ");
        String nombreCurso = scanner.nextLine().toLowerCase();
        for (Cursos curso : cursos) {
            if(curso.getCodigoCurso().equals(nombreCurso)){
                System.out.println("Estudiantes del curso: " + curso.getNombreCurso());
                
                for (Estudiante estudiante : curso.getEstudiantes()) {
                    System.out.println(estudiante.getEstudiante());    
                }
            }
        }
    }

    public void agregarEstudiante(Scanner scanner, ArrayList<Cursos> cursos){
        System.out.println("En que curso quieres ingresar a los estudiantes (Con el codigo)");
        String curso = scanner.nextLine().toLowerCase();
        Integer idEstudiante = 1;
        for (int i = 0; i < cursos.size(); i++) {
            if(cursos.get(i).getCodigoCurso().equals(curso)){
                System.out.println("Ingrese la cantidad de estudiantes que quieres ingresar");
                int cantidad = scanner.nextInt();
                for (int j = 0; j < cantidad; j++) {
                    cursos.get(i).agregarEstudiantes(estudiantes(scanner, idEstudiante));
                    idEstudiante++;
                }
            }
        }
    }

    public Estudiante estudiantes (Scanner scanner, Integer idEstudiante){
        Estudiante estudiantes = null;

        System.out.println("Nombre del estudiante");
        String nombre = scanner.nextLine().toLowerCase();
        scanner.nextLine();

        System.out.println("Email del estudiante");
        String email = scanner.nextLine().toLowerCase();
        scanner.nextLine();

        estudiantes = new Estudiante(idEstudiante, nombre, email);
        
        return estudiantes;
    }

    public Cursos agregarCurso(Scanner scanner, int codigoCurso) {
        System.out.println("Agregar curso");
        System.out.println("Ingrese el nombre del curso");
    
        String nombre = scanner.nextLine().toLowerCase();
        
        String codigoString = String.valueOf(codigoCurso);
    
        Cursos curso = new Cursos(nombre, codigoString);
    
        return curso;
    }
    
    public void mostrarCurso(ArrayList<Cursos> cursos){
        for (Cursos curso : cursos) {
            System.out.println(curso.getCurso());
            System.out.println();
        }
    }
}
