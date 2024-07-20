package Cursos;

import java.util.ArrayList;

public class Cursos {
    private String nombreCurso;
    public String codigoCurso;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public Cursos(String curso, String codigoCurso){
        this.nombreCurso = curso;
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getCurso(){
        return "Codigo: " + codigoCurso + "|       Nombre del Curso: " + nombreCurso;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiantes(Estudiante listaEstudiantes) {
        estudiantes.add(listaEstudiantes);
    }
}
