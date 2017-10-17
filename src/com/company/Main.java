package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        Tienda tienda1=new Tienda();
	tienda1.leer();
	tienda1.mostrar();
	tienda1.adicionar(lec.nextInt());
	tienda1.actualizar(lec.nextLine());
    }
}
