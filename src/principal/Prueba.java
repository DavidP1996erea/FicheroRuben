package principal;

import java.io.*;
import java.util.Arrays;


public class Prueba  {


    public static void main(String[] args) {
        int [] so = new int[]{0,1,2,3,4,5,6,7,8,9};

        ObjectOutputStream out = null;

        FileInputStream archivoLeer;
        ObjectInputStream input=null;


        try {


            out = new ObjectOutputStream( new FileOutputStream("enteros.dat"));


                out.writeObject(so);

        } catch (Exception e) {

            System.out.println("Falló we");


        }finally {

            try{
                out.close();

            }catch (Exception f){

                System.out.println("Fallo todo");

            }
        }

        try{
            archivoLeer = new FileInputStream("enteros.dat");
            input  = new ObjectInputStream(archivoLeer);

                so = (int[]) input.readObject();
                System.out.println(so.toString());

        }

        catch (Exception f){
            System.out.println("Falló");
        }
    }
}
