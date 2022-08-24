package com.AdLatorre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precio;

        System.out.println("Ingrese un precio");
        double entradaTeclado;
        Scanner entradaEscaner= new Scanner(System.in);
        entradaTeclado= Double.parseDouble(entradaEscaner.nextLine());

        precioIva(entradaTeclado);



    }

    static void precioIva(double precio) {
        double total;
        total=((precio*21)/100)+precio;

        System.out.println(total);


    }
}

