package ejer_2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Martinez De la Cruz Carlos
 */
public class EJER_2 {

    public static void main(String[] args) {
        EJER_2 proyectoReales = new EJER_2();
        proyectoReales.listaReales = new ArrayList();
        proyectoReales.leerOpcion();
    }
    private ArrayList listaReales;

    public void leerOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nLista de Reales");
            System.out.println("[1] Agregar");
            System.out.println("[2] Buscar");
            System.out.println("[3] Salir\n");
            System.out.print("Ingrese opcion (1-3): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
            }
        } while (opcion != 3);
    }

    public void ingresarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        System.out.print("Ingrese valor: ");
        valor = entrada.nextDouble();
        listaReales.add(valor);
    }

    public void buscarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato se encuentra en posicion: " + indice);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

}

