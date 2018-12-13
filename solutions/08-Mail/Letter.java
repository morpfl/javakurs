
public class Letter implements Deliverable {
	private String sender;
	private Addressee addressee;

	public Letter(String sender, Addressee addressee) {
		this.sender = sender;
		this.addressee = addressee;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Addressee getAddressee() {
		return this.addressee;
	}

	public void setAddressee(Addressee addressee) {
		this.addressee = addressee;
	}

	// Wir müssen die abstrakte Methode implementieren
	@Override
	public boolean PersonalDeliveryRequired() {
		return false;
	}
}
