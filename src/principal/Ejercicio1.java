package principal;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        File primera = new File("C:/Users/dperea/Downloads","FuncioneEscalares.sql");
        File ruta = new File("C:/Users/dperea/Downloads");


        if(primera.exists()){
            datos(primera);
            comprobar(primera);
        }else {
            System.out.println("No existe el fichero");
        }


        System.out.println("\n \n Datos del segundo fichero: \n \n ");


        if(ruta.exists()){
            datos(ruta);
            comprobar(ruta);
        }else {
            System.out.println("No existe el fichero");
        }






    }

    private static void datos(File file){
        System.out.println("Nombre " + file.getName());
        System.out.println("Ruta absoluta " + file.getAbsolutePath());
        System.out.println("Ruta donde se creó " + file.getPath());
        System.out.println("Directorio padre " + file.getParent());
    }

    private static void comprobar(File file){

        if (file.canWrite()) {
            System.out.println("Es de escritura");
        }

        if (file.canRead()){
            System.out.println("Es de lectura");
        }

        if(file.isDirectory()){
            System.out.println("Es un directorio");

        }

        System.out.println("Tamaño en bytes: " + file.length());

    }

}
