import java.util.*;

public class Bibliothek {
	String name;
	public Map<Long,List<Buch>> buecher;
	
	public Bibliothek(String name) {
		this.name = name;
		buecher = new HashMap<Long,List<Buch>>();
	}
	
	public boolean ausleihen(long isbn) {
		List<Buch> buecherEinerIsbn = this.buecher.get(isbn);
		for(Buch buch : buecherEinerIsbn) {
			if(buch.ausleihen()) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Buch buch = new Buch("test","test");
		Buch buch2 = new Buch("test2","test2");
		
		long isbn = 23456;
		List<Buch> neueBuecher = new LinkedList<Buch>();
		
		neueBuecher.add(buch);
		neueBuecher.add(buch2);
		
		Bibliothek bib = new Bibliothek("testbib");
		bib.buecher.put(isbn, neueBuecher);
		
		System.out.println(bib.ausleihen(isbn));
		System.out.println(bib.ausleihen(isbn));
		System.out.println(bib.ausleihen(isbn));
		
	}

}
