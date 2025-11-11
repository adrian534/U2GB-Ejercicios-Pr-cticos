package ejerciciosPracticos;

/**
 *
 * @author joel adrian caballlero lugo
 */
import java.util.Random;
import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Problema1 {
    private Nodo inicio;

    // Inserta al final
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    // Muestra la lista
    public void mostrar() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente;
        }
        System.out.println();
    }

    // Elimina los nodos mayores a un valor
    public void eliminarMayores(int limite) {
        while (inicio != null && inicio.dato > limite) {
            inicio = inicio.siguiente;
        }
        Nodo aux = inicio;
        while (aux != null && aux.siguiente != null) {
            if (aux.siguiente.dato > limite) {
                aux.siguiente = aux.siguiente.siguiente;
            } else {
                aux = aux.siguiente;
            }
        }
    }

    public static void main(String[] args) {
        Problema1 lista = new Problema1();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            lista.insertar(random.nextInt(100) + 1);
        }

        System.out.println("Lista generada:");
        lista.mostrar();

        System.out.print("Ingrese el valor límite: ");
        int limite = sc.nextInt();

        lista.eliminarMayores(limite);

        System.out.println("Lista después de eliminar mayores a " + limite + ":");
        lista.mostrar();
    }
}
