/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.prueba;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;


public class Main {
    
    public static void main(String[] args){
        Sede sedeCuenca=new Sede(0, "Sede Cuenca", "El Vecino", "0787654321");
        
        Carrera computacion=new Carrera(0, "Computacion", 10, 40, "Ingeniero en Sistemas");
        Carrera telematica=new Carrera(1, "Telematica", 10, 40, "Ingeniero en Telematica");
        Carrera mecatronica=new Carrera(2, "Mecatronica", 10, 20, "Ingeniero en Mecatronica");
        
        Materia calculo= new Materia(0, "Calculo", 3, 160, 1);
        Materia programacion= new Materia(1, "Programacion Aplicada", 5, 180,3);
        Materia matematicas=new Materia(2, "Matemarica", 3, 180, 3);
        Materia etica=new Materia(3, "Etica", 3, 60, 1);
        Materia teoriaCritica= new Materia(4, "Teoria Critica", 3, 60, 1);
        Materia algebra= new Materia(5, "Algebra Linea", 3, 60, 1);
        
        Profesor profesor1=new Profesor("Ingeniero", 1500, "Jefe de Area", 0, "Gustavo Bravo", "0376376743", "073468364", "Orquideas", "fpatog@est.ups.edu.ec");
        Profesor profesor2=new Profesor("Ingeniero", 1300, "Profesor", 1, "Franklin Orellana", "0137461736", "074343423", "El Vecino", "forellana@est.ups.edu.ec");
        
        Estudiante estudiante1=new Estudiante(0, "Carlos Condor", "0107551012", "2934320", "Pasacalle", "ccondorp@est.ups.edu.ec");
        Estudiante estudiante2=new Estudiante(1, "Eduardo Franklin", "0104353535", "2353535", "Totoracocha", "hjuliop@est.ups.edu.ec");
        Estudiante estudiante3=new Estudiante(2, "Diego Pina", "0177372932", "242284278", "Miraflores", "hargudo@est.ups.edu.ec");
        Estudiante estudiante4=new Estudiante(3, "Sebas Marcelo", "0108373747", "0926462824", "Piranclor", "smarcelo@est.ups.edu.ec");
        
        Grupo grupo1=new Grupo(0, "Grupo 1", 30);
        Grupo grupo2=new Grupo(1, "Grupo 2", 40);
        
        sedeCuenca.agregarCarrera(computacion);
        sedeCuenca.agregarCarrera(telematica);
        sedeCuenca.agregarCarrera(mecatronica);
        
        computacion.agregarMateria(calculo);
        computacion.agregarMateria(matematicas);
        
        
        telematica.agregarMateria(teoriaCritica);
        telematica.agregarMateria(etica);
        
        mecatronica.agregarMateria(programacion);
        mecatronica.agregarMateria(algebra);
        
        calculo.agregarGrupo(grupo1);
        calculo.agregarProfesor(profesor1);
        
        programacion.agregarGrupo(grupo1);
        programacion.agregarProfesor(profesor2);
        
        matematicas.agregarGrupo(grupo2);
        matematicas.agregarProfesor(profesor2);
        
        etica.agregarGrupo(grupo2);
        etica.agregarProfesor(profesor2);
        
        teoriaCritica.agregarGrupo(grupo1);
        teoriaCritica.agregarProfesor(profesor1);
        
        algebra.agregarGrupo(grupo1);
        algebra.agregarProfesor(profesor2);
        
        estudiante1.setCarrera(mecatronica);
        estudiante2.setCarrera(computacion);
        
        System.out.println(sedeCuenca.toString());
        System.out.println(computacion.toString());
        System.out.println(telematica.toString());
        System.out.println(mecatronica.toString());
        System.out.println(calculo.toString());
        System.out.println(programacion.toString());
        System.out.println(matematicas.toString());
        System.out.println(etica.toString());
        System.out.println(teoriaCritica.toString());
        System.out.println(algebra.toString());
        System.out.println(profesor1.toString());
        System.out.println(profesor2.toString());
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println(estudiante4.toString());
        System.out.println(grupo1.toString());
        System.out.println(grupo2.toString());
        
        //2 profesores 4 estudiantes 2 grupos
    }
}
