import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Controlador {

    public static void main(String[] args) {

        Vista vista = new Vista();
        archivos arch = new archivos();

        int implementacion = vista.getImplementacion();
        Deck deck = new Deck(implementacion, arch.ReadCards(implementacion));

        int opcion = 0;
        String nombre;

        while (opcion != 9) {
            opcion = vista.getOpcionMenu();

            switch (opcion) {
                case 1:
                    try {
                        nombre = vista.getCarta();
                        deck.anadirCarta(nombre);
                        vista.mostrarMensaje("Carta añadida");
                    } catch (Exception e) {
                        vista.mostrarError();
                    }
                    break;

                case 2:
                    nombre = vista.getCarta();
                    vista.mostrarMensaje(deck.consultarCarta(nombre));
                    break;

                case 3:
                    vista.mostrarMensaje(deck.mostrarCartas());
                    break;

                case 4:
                    vista.mostrarMensaje(deck.mostrarCartasOrdenadas());
                    break;

                case 5:
                    vista.mostrarMensaje(deck.mostrarTodasCartas());
                    break;

                case 6:
                    vista.mostrarMensaje(deck.mostrarTodasCartasOrdenadas());
                    break;

                case 7:
                    implementacion = vista.getImplementacion();
                    vista.mostrarMensaje(Util.pruebaCartas(implementacion));
                    break;
                
                case 8:
                    implementacion = vista.getImplementacion();
                    vista.mostrarMensaje(Util.pruebaCartasOrdenadas(implementacion));
                    break;
            }
        }


    }
}