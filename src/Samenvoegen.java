import java.util.HashMap;

public class Samenvoegen {
    private HashMap<String, String> map1 = new HashMap<>();
    private HashMap<String, String> map2 = new HashMap<>();
    private HashMap<String, String> samen = new HashMap<>();

    // Twee HashMaps aanmaken
    public Samenvoegen() {
        map1.put("a", "b");
        map2.put("b", "c");
        // wordt in samen ("a", "c");
        map1.put("d", "e");
        map2.put("e", "f");
        // wordt in samen ("d", "f");
        map1.put("g", "h");
        map2.put("i", "j");
        // wordt geen paar in samen want "h" is nietgelijk aan "i";
    }

    // Voeg de twee HashMaps samen
    public void voegSamen() {

    }

    // Samengevoegde HashMap afdrukken
    public void displayMap() {

    }
}