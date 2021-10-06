package inspila;

public class Pila {

    int vectorpila[];
    int cima;

    public Pila(int tamano) {
        vectorpila = new int[tamano];
        cima = 0;
    }

    //metodo insertar
    public void insertar(int dato) {
        vectorpila[cima] = dato;
        cima++;
    }

    public int eliminar() {
        int elimina = 0;
        if (cima == 0) {
            System.out.println("la pila esta vacio");
        } else {
            elimina = vectorpila[cima];
            cima--;
        }

        return elimina;
    }

    public boolean vacio() {
        if (cima == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int tamano() {
        return vectorpila.length;
    }

    public void mostrar() {
        System.out.println("MOSTRAR ELEMENTOS:");
        for (int i = 0; i < cima; i++) {
            System.out.println(""+vectorpila[i]);
        }
    }
}
