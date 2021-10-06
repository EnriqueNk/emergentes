package inspila;

import java.util.Scanner;

public class InsPila {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Bienvenidos a la pila");
        System.out.println("digite el tamaño de la pila");
        int tamano = lea.nextInt();
        int dato = 0, opc;
        Pila a = new Pila(tamano);
        do {
            System.out.println("****QUE DESEA HACER****");
            System.out.println("1.-Introducir datos ");
            System.out.println("2.-Eliminar dato");
            System.out.println("3.- Saber si esta vacio");
            System.out.println("4.- 2Saber si tiene tamaño");
            System.out.println("5.- Mostrar");
            System.out.println("6.- Salir");
            opc = lea.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("insertar dato");
                    a.insertar(dato = lea.nextInt());
                    System.out.println("dato insertado");
                    System.out.println("");
                    break;
                case 2:
                    a.eliminar();
                    break;
                case 3:
                    System.out.println(a.vacio());
                    System.out.println("");
                    /*   if (vacio() != false) {
                        System.out.println("SI, ESTA VACIO");
                    } else {
                        System.out.println("NO ESTA VACIO");
                    }*/
                    break;
                case 4:
                    System.out.println(a.tamano());
                    break;
                case 5:
                  a.mostrar();
                    break;
            }
        } while (opc != 6);
    }

}
