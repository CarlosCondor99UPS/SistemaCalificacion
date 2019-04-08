package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Sede {

    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Carrera> carreras;

    public Sede(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        carreras = new ArrayList<>();
    }

    
    
    public Sede() {
        carreras = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Sede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", carreras=" + carreras + '}';
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public void agregarCarrera(Carrera carreras1) {
        this.carreras.add(carreras1);

    }
}
