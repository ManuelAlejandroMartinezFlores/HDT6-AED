import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class FactoryMap<K,V> {

    public Map<K,V> getMap(int implementacion){
        if (implementacion == 1){
            return new HashMap<K,V>();
        } else if (implementacion == 2){
            return new TreeMap<K,V>();
        } else {
            return new LinkedHashMap<K,V>();
        }
    }

}