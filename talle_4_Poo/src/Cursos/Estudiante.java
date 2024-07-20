package Cursos;

public class Estudiante {
    private Integer idEstudiante;
    private String nombre;
    private String email;
    
    public Estudiante(Integer id, String nombre, String email){
        this.idEstudiante = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getEstudiante(){
        System.out.println();
        return "|Id: " + idEstudiante + "|      Nombre: " + nombre + "|      Email: " + email;
    }
}
