import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String tamano = "";
        Archivo archivo;
        Impresora impresora = new Impresora();
        String opcion = "";
        while (!opcion.equals("6")){
            System.out.println("1.  Encender impresora");
            System.out.println("2.  Apagar impresora");
            System.out.println("3.  Añadir trabajo");
            System.out.println("4.  Ver lista de trabajos");
            System.out.println("5.  Imprimir");
            System.out.println("6.  Salir");
            opcion = sc.nextLine();
            switch (opcion){
                case "1" :
                    if(impresora.isEstado()){
                        System.out.println("Ya estaba encendida totufo");
                    }else{
                        impresora.setEstado(true);
                        System.out.println("Encendiendo impresora...");
                    }
                    break;
                case "2":
                    if(!impresora.isEstado()){
                        System.out.println("Ya estaba apagada totufo");
                    }else {
                        impresora.setEstado(false);
                        System.out.println("Apagando impresora...");
                    }
                    break;
                case  "3":
                    if(impresora.isEstado()){
                        System.out.print("Nombre del archivo: ");
                        nombre = sc.nextLine();
                        System.out.print("Tamaño del archivo: ");
                        tamano = sc.nextLine();
                        archivo = new Archivo(nombre, tamano);
                        impresora.anadirArchivo(archivo);
                    }else{
                        System.out.println("La impresora está apagada");
                    }
                    break;
                case "4":
                    if(impresora.isEstado()) {
                        System.out.println(impresora);
                    }else{
                        System.out.println("La impresora está apagada");
                    }
                    break;
                case "5":
                    if(impresora.isEstado()){
                        int tamanoImpresora = impresora.tamano();
                        for (int i = 0; i < tamanoImpresora; i++) {
                            System.out.println("Imprimiendo -> " + impresora.eliminar());
                        }
                    }else{
                        System.out.println("La impresora está apagada");
                    }
                    break;
                case "6":
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Introduzca valor válido");
            }
        }
    }
}