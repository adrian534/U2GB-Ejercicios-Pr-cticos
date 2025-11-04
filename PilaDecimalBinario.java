import java.util.Stack;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num = sc.nextInt();

        // Crear una pila para guardar los restos
        Stack<Integer> pila = new Stack<>();

        // Mientras el número sea mayor que 0, dividir entre 2 y guardar el resto
        while (num > 0) {
            pila.push(num % 2);
            num /= 2;
        }

        // Desapilar para mostrar el número binario
        System.out.print("Binario: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
    }
}
