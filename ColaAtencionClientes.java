import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ColaAtencionClientes {
    public static void main(String[] args) {
        Queue<Integer> filaClientes = new LinkedList<>();
        int tiempoTotal = 7 * 60; // 7 horas -> 420 minutos
        int clientesAtendidos = 0;
        int maxFila = 0;
        int tiempoMaxEspera = 0;
        boolean cuartaCajaAbierta = false;
        int minutoAperturaCuarta = 0;

        Random random = new Random();

        // Simulación minuto a minuto
        for (int minuto = 1; minuto <= tiempoTotal; minuto++) {
            // Cada minuto llega un nuevo cliente
            filaClientes.offer(minuto);

            // Si la fila supera los 20 clientes, abrir cuarta caja
            if (filaClientes.size() > 20 && !cuartaCajaAbierta) {
                cuartaCajaAbierta = true;
                minutoAperturaCuarta = minuto;
                System.out.println("⚠️ Se abre la cuarta caja en el minuto " + minuto);
            }

            // Procesar clientes en 3 o 4 cajas
            int cajasActivas = cuartaCajaAbierta ? 4 : 3;

            for (int i = 0; i < cajasActivas; i++) {
                if (!filaClientes.isEmpty()) {
                    int llegada = filaClientes.poll();
                    int espera = minuto - llegada;
                    if (espera > tiempoMaxEspera) tiempoMaxEspera = espera;
                    clientesAtendidos++;
                }
            }

            // Registrar tamaño máximo de la fila
            if (filaClientes.size() > maxFila) {
                maxFila = filaClientes.size();
            }
        }

        // Resultados finales
        System.out.println("\n📊 RESULTADOS DE LA SIMULACIÓN");
        System.out.println("Total de clientes atendidos: " + clientesAtendidos);
        System.out.println("Tamaño máximo de la fila: " + maxFila);
        System.out.println("Tiempo máximo de espera: " + tiempoMaxEspera + " minutos");
        if (cuartaCajaAbierta) {
            System.out.println("Cuarta caja abierta en el minuto: " + minutoAperturaCuarta);
        } else {
            System.out.println("No fue necesario abrir la cuarta caja.");
        }
    }
}
