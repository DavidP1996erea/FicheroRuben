package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private int numCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int saldo;
    private int ingresosMedios;
    private int gastosMedios;
    private String direccion;
    private int codigoPostal;

    public  static List <Cliente> listaCliente = new ArrayList<>();

    public Cliente(int numCliente, String nombre, String apellido1, String apellido2, int saldo,
                   int ingresosMedios, int gastosMedios, String direccion, int codigoPostal) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.saldo = saldo;
        this.ingresosMedios = ingresosMedios;
        this.gastosMedios = gastosMedios;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }


    public static void menu(){

        Scanner opcion = new Scanner(System.in);
        int opc;

        System.out.println("Introduzca la opción que desee:");
        System.out.println("1. Lista clientes con saldo 0");
        System.out.println("2. Lista clientes con saldo crédito");
        System.out.println("3. Lista cleintes con saldo débito");
        System.out.println("4. Generar cartas a los clientes super Vips");
        System.out.println("5. Generar cartas a los clientes Robinson");
        System.out.println("0. Salir");
        opc=opcion.nextInt();


        while (opc!=0){

            switch (opc){

                case 1:
                    clientesSaldo0.generarListaClientesSaldo0();
                    System.out.println(clientesSaldo0.listaClienteSaldo0.get(1).getNombre()) ;
                    System.out.println(clientesSaldo0.listaClienteSaldo0.size());
                    break;


                default:
                    System.out.println("Opción equivocada");


            }


            System.out.println("Seleccione otra opción");
             opc= opcion.nextInt();


        }



    }

    public static List<Cliente> generarLista(){
        String text = "Clientes.txt";
        String linea;
        Scanner sc;
        BufferedReader buffer1;
        String codigo="";
        String [] parte;

        try {

            buffer1 = new BufferedReader(new FileReader(text));



            while ( (linea=buffer1.readLine()) != null) {

                sc = new Scanner(linea);

                codigo += sc.nextLine();
                parte = codigo.split(" ");

                listaCliente.add(new Cliente(Integer.parseInt(parte[0]), parte[1], parte[2], parte[3],
                        Integer.parseInt(parte[4]), Integer.parseInt(parte[5]), Integer.parseInt(parte[6]),
                        parte[7], Integer.parseInt(parte[8])));

                codigo = "";


            }
            buffer1.close();



        }catch (Exception e){

            System.out.println("Algó falló");

        }

        return listaCliente;
    }















    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getIngresosMedios() {
        return ingresosMedios;
    }

    public void setIngresosMedios(int ingresosMedios) {
        this.ingresosMedios = ingresosMedios;
    }

    public int getGastosMedios() {
        return gastosMedios;
    }

    public void setGastosMedios(int gastosMedios) {
        this.gastosMedios = gastosMedios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
