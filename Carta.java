
public class Carta  implements Comparable {
    String nombre;
    String tipo;

    Carta(String nombre_, String tipo_){
        nombre = nombre_;
        tipo = tipo_;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public int compareTo(Object o){
        Carta c = (Carta) o;
        return tipo.compareTo(c.getTipo());
    }

    public boolean equals(Object o){
        Carta c = (Carta) o;
        return tipo.equals(c.getTipo()) && nombre.equals(c.getNombre());
    }

    public String toString() {
        return nombre +"|" + tipo;
    }
}