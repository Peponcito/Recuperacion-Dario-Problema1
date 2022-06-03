import java.util.ArrayList;

public class Impresora {
    private boolean estado;
    private ArrayList<Archivo> ColaDeImprsion = new ArrayList<Archivo>();

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Archivo> getColaDeImprsion() {
        return ColaDeImprsion;
    }

    public void setColaDeImprsion(ArrayList<Archivo> colaDeImprsion) {
        ColaDeImprsion = colaDeImprsion;
    }

    public void anadirArchivo(Archivo archivo) {
        if (this.estado) {
            ColaDeImprsion.add(archivo);
        } else {
            System.out.println("Documento rechazado. Impresora apagada");
        }
    }
    public int tamano (){
        return ColaDeImprsion.size();
    }
    public Archivo eliminar(){
        return ColaDeImprsion.remove(0);
    }

    @Override
    public String toString() {
        return "Archivos: " + ColaDeImprsion;
    }
}
