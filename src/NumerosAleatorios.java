
/**
 *
 * @author chech
 */
import java.util.*;
 
public class NumerosAleatorios {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        Stack<Integer> pila = new Stack<>();
        Queue<Integer> cola = new LinkedList<>();
 
        System.out.println("1. Insertar en pila y extraer");
        System.out.println("2. Insertar en cola y extraer");
        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();
 
        for (int i = 0; i < 1000000; i++) {
            int num = rnd.nextInt(20000001) - 10000000; // Genera un número aleatorio entre -10,000,000 y 10,000,000
            if (opcion == 1) {
                pila.push(num); // Inserta el número en la pila
            } else {
                cola.offer(num); // Inserta el número en la cola
            }
        }
 
        long startTime = System.nanoTime();
 
        if (opcion == 1) {
            while (!pila.empty()) {
                int num = pila.pop(); // Extrae el número de la pila
            }
        } else {
            while (!cola.isEmpty()) {
                int num = cola.poll(); // Extrae el número de la cola
            }
        }
 
        long endTime = System.nanoTime();
 
        long tiempoTotal = endTime - startTime;
        double segundos = (double) tiempoTotal / 1_000_000_000.0;
 
        System.out.println("Tiempo total: " + tiempoTotal + " nanosegundos (" + segundos + " segundos)");
    }
 
}
