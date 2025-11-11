package ejerciciosPracticos;
import java.util.*;
/**
 *
 * @author joel adrian caballlero lugo
 */


class NodoCircular {
    double coef;
    int exp;
    NodoCircular sig;

    public NodoCircular(double coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }
}

public class Problema4 {
    private NodoCircular ultimo;

    public void insertar(double coef, int exp) {
        NodoCircular nuevo = new NodoCircular(coef, exp);
        if (ultimo == null) {
            ultimo = nuevo;
            nuevo.sig = nuevo;
        } else {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
            ultimo = nuevo;
        }
    }

    public void mostrar() {
        if (ultimo == null) return;
        NodoCircular aux = ultimo.sig;
        do {
            System.out.println(aux.coef + "x^" + aux.exp);
            aux = aux.sig;
        } while (aux != ultimo.sig);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema4 lista = new Problema4();

        System.out.println("Ingrese coeficiente y exponente (termine con exponente negativo):");
        while (true) {
            System.out.print("Coeficiente: ");
            double c = sc.nextDouble();
            System.out.print("Exponente: ");
            int e = sc.nextInt();
            if (e < 0) break;
            lista.insertar(c, e);
        }

        System.out.println("\nRecorrido circular del polinomio:");
        lista.mostrar();
    }
}
