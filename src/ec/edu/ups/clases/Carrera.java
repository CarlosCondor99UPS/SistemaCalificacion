package ec.edu.ups.clases;

import java.util.List;

public class Carrera {

    private int codigo;
    private String nombre;
    private List<Materia> materias;
    private int numeroSemestres;
    private int numeroEstudiantes;
    private String titulo;

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", materias=" + materias + ", numeroSemestres=" + numeroSemestres + ", numeroEstudiantes=" + numeroEstudiantes + ", titulo=" + titulo + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int getNumeroSemestres() {
        return numeroSemestres;
    }

    public void setNumeroSemestres(int numeroSemestres) {
        this.numeroSemestres = numeroSemestres;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}