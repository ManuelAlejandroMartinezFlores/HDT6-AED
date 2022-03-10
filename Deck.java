import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    FactoryMap fact;
    Map<String, Integer> cuenta;
    Map<String, String> mazo;

    Deck (int implementacion, Map<String, String> mazo_) {
        fact = new FactoryMap<String, Integer>();
        cuenta = fact.getMap(implementacion);
        mazo = mazo_;
    }

    Deck (Map<String, String> mazo_) {
        this(1, mazo_);
    }

    public void anadirCarta(String carta) throws Exception {
        if (!mazo.containsKey(carta)){
            throw new Exception();
        }
        if (cuenta.containsKey(carta)) {
            cuenta.put(carta, cuenta.get(carta) + 1);
        } else {
            cuenta.put(carta, 1);
        }
    }

    public String mostrarCartas() {
        String txt = "";
        for (String key : cuenta.keySet()) {
            txt += key + "|" + mazo.get(key) + ": " + cuenta.get(key) + "\n";
        }
        return txt;
    }

    public String mostrarCartasOrdenadas() {
        ArrayList<Carta> cartas = new ArrayList<>();
        for (String key : cuenta.keySet()){
            cartas.add(new Carta(key, mazo.get(key)));
        }
        Collections.sort(cartas);
        String txt = "";
        for (Carta c : cartas) {
            txt +=  c.toString() + ": " + cuenta.get(c.getNombre()) + "\n";
        }
        return txt;
    }

    public String mostrarTodasCartas() {
        String txt = "";
        for (String key : mazo.keySet()) {
            txt += key + "|" + mazo.get(key) + "\n";
        }
        return txt;
    }

    public String mostrarTodasCartasOrdenadas() {
        ArrayList<Carta> cartas = new ArrayList<>();
        for (String key : mazo.keySet()){
            cartas.add(new Carta(key, mazo.get(key)));
        }
        Collections.sort(cartas);
        String txt = "";
        for (Carta c : cartas) {
            txt +=  c.toString() + "\n";
        }
        return txt;
    }

    public String consultarCarta (String nombre) {
        return mazo.get(nombre);
    }
}