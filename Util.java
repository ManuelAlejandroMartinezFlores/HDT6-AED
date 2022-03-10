import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;


public class Util {
    
    public static String pruebaCartas (int implementacion) {
        // Map<String, String> mazo = new HashMap<>();
        archivos arch = new archivos();
        Map<String, String> mazo = arch.ReadCards(implementacion);
        Deck deck = new Deck(implementacion, mazo);
        
        long tiempo = System.nanoTime();
        for (int i=0; i<100; i++) {
            deck.mostrarTodasCartas();
        }
        tiempo = (System.nanoTime() - tiempo) / 100;
        return tiempo + " nanosegundos";
    }

    public static String pruebaCartasOrdenadas (int implementacion) {
        // Map<String, String> mazo = new HashMap<>();
        archivos arch = new archivos();
        Map<String, String> mazo = arch.ReadCards(implementacion);
        Deck deck = new Deck(implementacion, mazo);
        
        long tiempo = System.nanoTime();
        for (int i=0; i<100; i++) {
            deck.mostrarTodasCartasOrdenadas();
        }
        tiempo = (System.nanoTime() - tiempo) / 100;
        return tiempo + " nanosegundos";
    }
}