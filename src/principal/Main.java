package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String texto = "AgnesObel.txt";
        int cantidadNumero = 0;
        String linea = "";
        BufferedReader buffe1= null;
        Scanner scanner=null;
        try {

            buffe1 = new BufferedReader(new FileReader(texto));
            linea = buffe1.readLine(); // Se mete todo el contenido del texto en esta variable

            while ( linea != null) { //Mientras exista algo más se ejecutará el wile
                scanner = new Scanner(linea);
                if (scanner.hasNextInt()) { // Si el siguiente coso es un int entra en el if
                    cantidadNumero += scanner.nextInt(); // Suma cada int
                }
                linea = buffe1.readLine();
            }


            System.out.println(cantidadNumero);


        } catch (Exception xd) {

        }
    }
}
