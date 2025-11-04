import java.util.Stack;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear una pila vacía
        Stack<Integer> pila = new Stack<>();

        // Comprobar si está vacía (debería ser true)
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());

        // Insertar un elemento
        pila.push(1);

        // Volver a comprobar si está vacía (debería ser false)
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());
    }
}
