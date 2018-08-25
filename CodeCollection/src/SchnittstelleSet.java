import java.util.HashSet;
import java.util.Set;

public class SchnittstelleSet {

	public static void main(String[] args) {
		Set<String> menge = new HashSet<String>();
		String a = "Hallo Welt!";
		String b = "Hallo";
		String c = "Welt!";
		String d = b + " " + c;
		menge.add(a); //liefert true
		menge.add(b); //liefert true
		menge.add(c); //liefert true
		menge.add(d); //liefert false, da bei a schon enthalten
		menge.size(); //liefert 3
		menge.contains(b); //liefert true
		menge.contains(d); //liefert true
		System.out.println(menge); //druckt [Hallo, Welt!, Hallo Welt!]
		menge.remove(d); //liefert true
		System.out.println(menge); //druckt [Hallo, Welt!]
		menge.size(); //liefert 2
	}

}
