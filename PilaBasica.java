import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear una pila vacía de enteros
        Stack<Integer> pila = new Stack<>();

        // Insertar (push) elementos en la pila
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);

        // Eliminar (pop) los dos últimos elementos
        pila.pop();
        pila.pop();

        // Mostrar contenido actual de la pila
        System.out.println("Contenido actual: " + pila);
    }
}
