import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Universidad del valle de Guatemala
 * Hoja de Trabajo 6
 * Manuel Martínez 
 * Sofía Lam
 */

public class archivos {

    public Map<String, String> ReadCards(int implementacion){
        FactoryMap<String, String> fact = new FactoryMap<>();
        Map<String, String> map = fact.getMap(implementacion);
        try {
            FileReader fr = new FileReader("cards_desc.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            while ((linea = bf.readLine()) != null) {
            String[] cadenas = linea.split("\\|");
            map.put(cadenas[0], cadenas[1]);
            }
            fr.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return map;
            
    }
}
