import java.util.Stack;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // Crear una pila de caracteres
        Stack<Character> pila = new Stack<>();

        // Apilar cada letra de la palabra
        for (char c : palabra.toCharArray()) {
            pila.push(c);
        }

        // Desapilar e imprimir para mostrar la palabra invertida
        System.out.print("Invertida: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
    }
}
