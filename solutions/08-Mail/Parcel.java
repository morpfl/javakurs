
public class Parcel implements Deliverable {
	private String sender;
	private Addressee addressee;
	private float weight;

	public Parcel(String sender, Addressee addressee, float weight) {
		this.sender = sender;
		this.addressee = addressee;
		this.weight = weight;
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

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	// implementiert Methode aus interface
	@Override
	public boolean PersonalDeliveryRequired() {
		return true;
	}
}
