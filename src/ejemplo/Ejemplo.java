package ejemplo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import ejemplo.academico.*;


/**
 *
 * @author oscarquinteros
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("Programa Ejemplo");
       
       Alumno a = new Alumno();
       
       a.setApellido("Perez");
       a.setNombre("Juan");
       a.setMatricula("123");
       
       Alumno b = new Alumno();
       
       b.setApellido("Rodriguez");
       b.setNombre("Pablo");
       b.setMatricula("454");
       
       Persona p = new Persona();
       
       p.setApellido("Alvarez");
       p.setNombre("Julio");
       
       Persona j = a;
       
       
       
       System.out.println("Apellido y Nombre: "+a.getApellidoNombre()+" "+a.getMatricula());
    }
    
}
