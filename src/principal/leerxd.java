package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class leerxd {
    public static void main(String[] args) {

        String text = "Clientes.txt";
        String linea="";
        Scanner sc;
        BufferedReader buffer1 = null;
        String codigo="";
        String [] parte;
        Cliente cliente1;
        try {

            buffer1 = new BufferedReader(new FileReader(text));

            linea=buffer1.readLine();
            linea=buffer1.readLine();
            linea=buffer1.readLine();

                sc = new Scanner(linea);

                if (sc.hasNextLine()) { // Si el siguiente coso es un int entra en el if

                    codigo += sc.nextLine(); // Suma cada int

                }

                parte=codigo.split(" ");

            cliente1 = new Cliente(Integer.parseInt(parte[0]), parte[1], parte[2], parte[3], Integer.parseInt(parte[4]), Integer.parseInt(parte[5]), Integer.parseInt(parte[6]), parte[7], Integer.parseInt(parte[8]) );



            System.out.println(cliente1.getDireccion());



        }catch (Exception e){

        }



    }
}
