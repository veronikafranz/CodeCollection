import java.util.HashMap;
import java.util.Map;

public class SchnittstelleMap {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		String a = "Hallo";
		String b = "Welt!";
		m.put(10, a); //liefert null, da vorher kein Wert zu 10 gespeichert war
		m.put(12, b); //liefert null
		m.get(10);	//liefert "Hallo"
		m.get(4); //liefert null, da kein zugehöriger Wert gespeichert
		m.put(10, "Test"); //liefert "Hallo", da dieser voher mit dem Wert 10 verknüpft war
		m.get(10); //liefert "Test"
		m.size(); //liefert 2
		m.remove(12); //liefert "Welt!"
		m.size(); //liefert 1
	}

}
