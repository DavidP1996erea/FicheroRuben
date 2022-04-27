package principal;

import java.io.*;
import java.util.Arrays;

public class Prueba implements Serializable {
    static int [] so = new int[]{0,1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {


        ObjectOutputStream out = null;

        FileInputStream archivoLeer = null;
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

        catch (EOFException exceayuda){
            System.out.println("Final");
        }
        catch (Exception f){
            System.out.println("Falló");
        }
    }
}
