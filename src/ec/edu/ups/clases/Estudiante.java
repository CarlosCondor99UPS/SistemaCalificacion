package ec.edu.ups.clases;

public class Estudiante extends Persona{

    private Carrera carrera;

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
