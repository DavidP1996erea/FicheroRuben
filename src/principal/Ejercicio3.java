package principal;

import java.io.File;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un directorio");
        String nombre = sc.next();
        File directorio = new File(nombre);


        if (directorio.isDirectory() && directorio.exists()) {

            System.out.println("Contiene : ");

            for (int i=0; i<directorio.list().length;i++){

                directorio=new File(directorio.getAbsolutePath(),directorio.list()[i] );

                if(directorio.isDirectory()){
                    System.out.println("Es un directorio " + directorio.list()[i] );
                }else {

                }
            }

        } else {
            System.out.println("No existe");
        }

    }

}

