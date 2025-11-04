import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ColaSupermercado {
    public static void main(String[] args) {
        int carritosDisponibles = 25; // Total de carritos
        int clientesTotales = 50;     // Clientes a simular
        Queue<Integer> colaCaja1 = new LinkedList<>();
        Queue<Integer> colaCaja2 = new LinkedList<>();
        Queue<Integer> colaCaja3 = new LinkedList<>();

        Random random = new Random();

        for (int cliente = 1; cliente <= clientesTotales; cliente++) {
            // Esperar si no hay carritos disponibles
            if (carritosDisponibles == 0) {
                System.out.println("Cliente " + cliente + " espera un carrito...");
                continue;
            }

            // Cliente toma un carrito
            carritosDisponibles--;

            // Elegir la caja con menos clientes
            int tam1 = colaCaja1.size();
            int tam2 = colaCaja2.size();
            int tam3 = colaCaja3.size();

            if (tam1 <= tam2 && tam1 <= tam3) {
                colaCaja1.offer(cliente);
                System.out.println("Cliente " + cliente + " va a la Caja 1");
            } else if (tam2 <= tam1 && tam2 <= tam3) {
                colaCaja2.offer(cliente);
                System.out.println("Cliente " + cliente + " va a la Caja 2");
            } else {
                colaCaja3.offer(cliente);
                System.out.println("Cliente " + cliente + " va a la Caja 3");
            }

            // Simular pago y liberación de carrito
            if (random.nextInt(5) == 0) { // Al azar, un cliente termina
                if (!colaCaja1.isEmpty()) colaCaja1.poll();
                if (!colaCaja2.isEmpty()) colaCaja2.poll();
                if (!colaCaja3.isEmpty()) colaCaja3.poll();
                carritosDisponibles++;
            }
        }

        System.out.println("\nSimulación finalizada");
        System.out.println("Carritos disponibles: " + carritosDisponibles);
        System.out.println("Clientes restantes en Caja 1: " + colaCaja1.size());
        System.out.println("Clientes restantes en Caja 2: " + colaCaja2.size());
        System.out.println("Clientes restantes en Caja 3: " + colaCaja3.size());
    }
}
