import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        String nombre;

        // Leer nombres hasta que el usuario escriba "FIN"
        while (true) {
            System.out.print("Ingrese un nombre (FIN para salir): ");
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("FIN")) break; // salir del ciclo
            pila.push(nombre); // apilar el nombre
        }

        // Mostrar los nombres en orden inverso (desapilando)
        System.out.println("\nNombres en orden inverso:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
