
public class Postman extends Human {
	private long employeeID;
	public Addressee[] addressees;

	public Postman(long employeeID, String name, int alter, int workload) {
		super(name,alter);
		this.employeeID = employeeID;
		// erstellt neuen Array mit Größe workload und weißt ihn addressees zu
		this.addressees = new Addressee[workload];
	}

	public long getEmployeeID() {
		return this.employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	// implementiert abstrakte Methode aus Superklasse
	public String getJob() {
		return "Postwoman or Postman";
	}

	// weißt addressees einen neuen array zu
	public void setOrders(Addressee[] addressees) {
		this.addressees = addressees;
	}

	public void printOrders() {
		for(int i = 0; i < addressees.length; i++) {
			System.out.println(addressees[i].getName());
		}
	}

	// gibt den Postman als String zurück
	public String toString(){
		return this.getJob();
	}
}
