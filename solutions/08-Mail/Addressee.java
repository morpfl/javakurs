
public class Addressee extends Human {
	private String address;

	public Addressee(String name, int alter, String address) {
		// ruft Konstrukter der Superklasse auf
		super(name,alter);
		this.address = address;
	}

	public String getAdress() {
		return this.address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	// implementiert abstrakte Methode aus Superklasse
	public String getJob() {
		return "If a PostOffice knows the job of every addressee it probably would violate the EU-DSGVO!";
	}

}
