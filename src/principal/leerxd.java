package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leerxd {
    public static void main(String[] args) {

        String text = "Clientes.txt";
        String linea="";
        Scanner sc;
        BufferedReader buffer1 = null;
        String codigo="";
        String [] parte;
        List <Cliente> listaCliente = new ArrayList<>();
        try {

            buffer1 = new BufferedReader(new FileReader(text));



                while ( (linea=buffer1.readLine()) != null) {

                        sc = new Scanner(linea);

                            codigo += sc.nextLine();
                            parte = codigo.split(" ");
                            listaCliente.add(new Cliente(Integer.parseInt(parte[0]), parte[1], parte[2], parte[3], Integer.parseInt(parte[4]), Integer.parseInt(parte[5]), Integer.parseInt(parte[6]), parte[7], Integer.parseInt(parte[8])));
                            codigo = "";


                }
                buffer1.close();



            System.out.println(listaCliente.get(63).getNombre());



        }catch (Exception e){

        }



    }
}
