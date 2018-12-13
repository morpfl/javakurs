
public abstract class Human {
	private String name;
	private int alter;

	public Human(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getAlter() {
		return this.alter;
	}

	// abstrakte Methoden müssen in Subklassen implementiert werden
	public abstract String getJob();
}
