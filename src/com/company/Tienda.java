package com.company;

import java.util.Scanner;

public class Tienda {
//TODO atributo
    Scanner lec=new Scanner(System.in);
    private String nombre,direccion;
    private int nroProducto;
    private String[][] producto=new String[100][2];
            //TODO constructor
    Tienda(){}
    //TODO getter y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNroProducto() {
        return nroProducto;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }
    //TODO leer
    public  void leer() {
        System.out.print("INGRESE NOMBRE : ");
        setNombre(lec.next());
        System.out.print("INGRESE DIRECCION : ");
        setDireccion(lec.next());
        System.out.println("INGRSE nro de PRODUCTO : ");
        setNroProducto(lec.nextInt());
        for (int i = 0; i < getNroProducto(); i++) {
            System.out.print("producto:");
            producto[i][0] = lec.nextLine();
            System.out.print("precio:");
            producto[i][1] = lec.nextLine();
        }
    }
        //TODO mostrar
        public void mostrar(){
        System.out.println("NOMBRE"+getNombre());
        System.out.println("DIRECCION"+getDireccion());
        for(int i=0;i<getNroProducto();i++){
            System.out.println("NOMBRE"+producto[i][0]+"i"+"PRESIO"+producto[i][1]);

        }
    }
    //TODO adicionar
    public void adicionar(int n){
         int m=getNroProducto();
         setNroProducto(getNroProducto()+n);
         for(int i=m;i<getNroProducto();i++){
             producto[i][0]=lec.nextLine();
             producto[i][1]=lec.nextLine();
         }
    }
    //TODO actualizar
    public void actualizar (String n){
        for(int i=0;i<getNroProducto();i++){
            if(producto[i][0].equals(n)){
                producto[i][0]=lec.nextLine();
                producto[i][1]=lec.nextLine();
            }
        }
    }
    //TODO eliminar
}
