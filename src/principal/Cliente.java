package principal;

import javax.swing.*;
import java.awt.*;
import java.io.*;
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
    public  static List <Cliente> listaClienteSaldo0 = new ArrayList<>();
    public  static List <Cliente> listaClienteCredito = new ArrayList<>();

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
                    generarListaClientesSaldo0();
                    insertarListaSaldo0();
                    abrirFicheroCliente0();
                    break;

                case 2:
                    generarListaClientesCredito();
                    insertarListaCredito();
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
        BufferedReader buffer1=null;
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



        }catch (Exception e){

            System.out.println("Algó falló");

        }finally {
            try {
                buffer1.close();
            }catch (Exception fef){
                System.out.println("error");
            }


        }

        return listaCliente;
    }




    public static List<Cliente> generarListaClientesSaldo0(){
        int contador=0;

        while (contador<listaCliente.size()){

            if ((listaCliente.get(contador).getSaldo())==0) {

                if (!listaClienteSaldo0.contains(listaCliente.get(contador))) {
                    listaClienteSaldo0.add(listaCliente.get(contador));
                }
            }


            contador++;
        }

        return listaClienteSaldo0;
    }

    public static void insertarListaSaldo0() {
        BufferedWriter buffW;

        try {

            buffW = new BufferedWriter(new FileWriter("ClientesSaldo0.txt"));

            for (int i = 0; i < listaClienteSaldo0.size(); i++) {

                buffW.append(listaClienteSaldo0.get(i).toString());
                buffW.write("\n");


            }
            buffW.close();


        } catch (Exception e) {

            System.out.println("Error");
        }
    }


    public static void abrirFicheroCliente0() {
        Desktop ficheroAEjecutar = Desktop.getDesktop();
        try {
            ficheroAEjecutar.open(new File("ClientesSaldo0.txt"));
        } catch (IOException e) {

            System.out.println("Error");

        }
    }


    public static List<Cliente> generarListaClientesCredito(){
        int contador=0;

        while (contador<listaCliente.size()){

            if ((listaCliente.get(contador).getSaldo())<0) {

                if (!listaClienteCredito.contains(listaCliente.get(contador))) {
                    listaClienteCredito.add(listaCliente.get(contador));
                }
            }


            contador++;
        }

        return listaClienteCredito;
    }


    public static void insertarListaCredito() {
        BufferedWriter buffW;

        try {

            buffW = new BufferedWriter(new FileWriter("ClientesCredito.txt"));

            for (int i = 0; i < listaClienteCredito.size(); i++) {

                buffW.append(listaClienteCredito.get(i).toString());
                buffW.write("\n");


            }
            buffW.close();


        } catch (Exception e) {

            System.out.println("Error");
        }
    }

    @Override
    public String toString() {

        return "Código: " + numCliente + " Nombre: " + nombre + " PrimerApellido: " + apellido1 + " SegundoApellido: " +
            apellido2  + " Saldo: " + saldo + " IngresosMedio: " + ingresosMedios + " GastosMedios: " + gastosMedios;

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
