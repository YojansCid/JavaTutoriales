package Ejemplo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
/*Esta clase  sera la que "simulara" la tabla de la BD en forma de objeto y asi 
poder manejar los diferentes aspectos del programa. El objeto al igual que la 
Tabla en la BD a utilizar contiene un ID y un NOMBRE y sus respectivos get()
y set()*/
public class Persona {
    
    int id;
    String  nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
