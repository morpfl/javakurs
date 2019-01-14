public class Buch {
	private String autor;
	private String titel;
	private boolean istAusgeliehen; 
	
	public Buch(String titel, String autor) {
		this.istAusgeliehen = false;
		this.autor = autor;
		this.titel = titel;
	}
	
	public boolean ausleihen() {
		if(this.istAusgeliehen) return false;
		this.istAusgeliehen = true;
		return true;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitel() {
		return this.titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public boolean istAusgeliehen() {
		return this.istAusgeliehen;
	}
	
	
}
