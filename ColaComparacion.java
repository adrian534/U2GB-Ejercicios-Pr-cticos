import java.util.LinkedList;
import java.util.Queue;

public class ColaComparacion {
    // Método que compara si dos colas son idénticas
    public static <T> boolean sonIguales(Queue<T> cola1, Queue<T> cola2) {
        // Si tienen tamaños distintos, no pueden ser iguales
        if (cola1.size() != cola2.size()) return false;

        // Crear colas auxiliares para no modificar las originales
        Queue<T> aux1 = new LinkedList<>(cola1);
        Queue<T> aux2 = new LinkedList<>(cola2);

        // Comparar elemento por elemento
        while (!aux1.isEmpty()) {
            T e1 = aux1.poll();
            T e2 = aux2.poll();
            if (!e1.equals(e2)) return false;
        }

        return true; // Si llega aquí, ambas colas son iguales
    }

    public static void main(String[] args) {
        Queue<Integer> colaA = new LinkedList<>();
        Queue<Integer> colaB = new LinkedList<>();

        // Agregar elementos
        colaA.offer(1);
        colaA.offer(2);
        colaA.offer(3);

        colaB.offer(1);
        colaB.offer(2);
        colaB.offer(3);

        // Mostrar resultado
        System.out.println("¿Las colas son iguales? " + sonIguales(colaA, colaB));
    }
}
