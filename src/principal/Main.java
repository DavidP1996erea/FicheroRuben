package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String texto = "AgnesObel.txt";
        int cantidadNumero=0;
        String linea="";
        try {

            BufferedReader buffe1 = new BufferedReader(new FileReader(texto));
            linea=buffe1.readLine();
            Scanner scanner=new Scanner(linea);


            while (scanner.hasNext() ){
                if(scanner.hasNextInt()){
                    cantidadNumero+=scanner.nextInt();
                }
            }

            System.out.println(cantidadNumero);


        }catch (Exception xd){

        }
    }
}
