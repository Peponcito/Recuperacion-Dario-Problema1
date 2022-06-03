public class Archivo {
    private String nombre = "";
    private String tamano = "";

    public Archivo(String nombre, String tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Tamaño: " + tamano + "\n";
    }
}
