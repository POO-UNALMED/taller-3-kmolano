package taller3.televisores;

public class Marca {
    String nombre; //Nombre

    //Constructor
    public Marca(String nombre) {
        this.nombre = nombre;
    }
    //Metodos GET
    public String getNombre() {
        return nombre;
    }

    //Metodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
