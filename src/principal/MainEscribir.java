package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MainEscribir {
    public static void main(String[] args) {
        String texto = "AgnesObel.txt";
        BufferedReader leer=null;
        BufferedWriter escribir =null;
        String linea="";


        try{
            leer= new BufferedReader(new FileReader(texto));
            escribir = new BufferedWriter(new FileWriter(texto, true));
            escribir.write("Cosa que se pone en el texto. ");
            escribir.write("Al lado de todo");
            escribir.newLine();
            escribir.write("Debajo de la cosa");
            escribir.close();

            linea=leer.readLine();

            while (linea!=null){
                System.out.println(linea);
                linea=leer.readLine();
            }




        }catch (Exception e){

        }


    }
}
