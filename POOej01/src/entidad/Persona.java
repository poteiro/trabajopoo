
package entidad;


public class Persona {
    int edad;
    String nombre;
    String apellido;
    
    public Persona(){
}
    public Persona(int edad,String nombre,String apellido){

    this.edad =edad;
    this.nombre=nombre;
    this.apellido=apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  
    
}
