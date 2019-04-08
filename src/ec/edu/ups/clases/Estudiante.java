package ec.edu.ups.clases;

public class Estudiante extends Persona{

    private Carrera carrera;

    public Estudiante(){
        
    }
    public Estudiante(int codigo){
        super(codigo);
    }
    
    public Estudiante(int codigo, String nombre, String cedula){
        super(codigo, nombre, cedula);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
    }
        
    
    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
