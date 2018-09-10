import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.lang.Comparable;

@SuppressWarnings("unused")
public class Listen {

	public static void print(Collection<String> c) {
		//ungültige Elemente abfangen
		if(c == null) {
			return;
		}
		//Iterator erzeugen
		Iterator<String> it = c.iterator();
		//solange Elemente vorhanden
		while(it.hasNext()) {
			//nächstes Element holen
			String s = it.next();
			//Element ausgeben
			System.out.println(s);
		}
		
	}
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		
		//neue Liste erzeugen
		@SuppressWarnings("rawtypes")
		List l = new LinkedList();
		//Zeichenkette hinzufügen
		l.add("Hallo");
		//Zahl hinzufügen, dabei automatische Erzeugung eines Integer-Objekts
		l.add(3);
		//das erste Element entnehmen
		Object o = l.get(0);
		System.out.println(o);
		
		
		//neue Liste generischen Typs erzeugen
		List<String> l1s = new LinkedList<String>();
		List<Integer> l2i = new LinkedList<Integer>();
		
		//Zeichenkette zu l1 hinzufügen
		l1s.add("Hallo");
		//Zahl zu l2 hinzufügen
		l2i.add(3);
		//das erste Element aus l1 entnehmen
		String zeichenkette = l1s.get(0);
		//das erste Element von l2 entnehmen
		int zahl = l2i.get(0);
		l2i.add(4);
		l2i.add(3);
		l2i.add(5);
		//Teilliste erzeugen
		List<Integer> l3i = l2i.subList(1, 3);
	
		Collection<String> co = new LinkedList<String>();
		co.add("Hallo"); co.add("Welt"); co.add("!");
		print(co);
		
		System.out.println(l2i == l3i);
		l3i = l2i;
		System.out.println(l2i == l3i);
		

	}

}
