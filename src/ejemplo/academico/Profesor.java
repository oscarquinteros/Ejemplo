/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo.academico;

import java.util.ArrayList;

/**
 *
 * @author oscarquinteros
 */
public class Profesor extends Persona{
    private String cargo;
    private ArrayList alumnos = new ArrayList();
    
    //private Alumno[]  alumnos = new Alumno[10];

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }
    
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
