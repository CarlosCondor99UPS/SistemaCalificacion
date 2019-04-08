package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private List<Grupo> grupos;
    private List<Profesor> profesores;

    public Materia(int codigo, String nombre, int numeroCreditos, int numeroHoras, int nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroHoras = numeroHoras;
        this.nivel = nivel;
        grupos=new ArrayList();
        profesores=new ArrayList();
    }
    
    public void agregarGrupo(Grupo grupo){
        this.grupos.add(grupo);
    }
    
    public void agregarProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras + ", nivel=" + nivel + ", grupos=" + grupos + ", profesores=" + profesores + '}';
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

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Grupo> getGrupo() {
        return grupos;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupos = grupo;
    }

    public List<Profesor> getProfesor() {
        return profesores;
    }

    public void setProfesor(List<Profesor> profesor) {
        this.profesores = profesor;
    }

    

}
