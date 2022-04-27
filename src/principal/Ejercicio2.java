package principal;

import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un directorio");
        String nombre = sc.next();
        File directorio = new File(nombre);

        rutaAbsoluta(directorio);

    }

    private static void rutaAbsoluta(File file) {
        if (file.isDirectory() && file.exists()) {

            System.out.println("Contiene : ");

            for (int i=0; i<file.list().length;i++){

                System.out.println( "- " + file.list()[i]);
            }

        } else {
            System.out.println("No existe");
        }
    }
}