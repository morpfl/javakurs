In dieser Übung soll es darum gehen, einen Überblick über alles bisher gelernte zu geben und das zu wiederholen:
- Vererbung
- Interfaces
- Arrays
- Abstrakte Klassen
- getter & setter
- ...

Im allgemeinen betrachten wir eine Klasse Mensch und Unterklassen wie Empfänger und Postbote. Außerdem Post, wie Briefe oder Pakete. Diese wird von Menschen an Menschen ausgeliefert, außerdem arbeiten die Postboten in einer Poststelle, ... usw.
Für die genaue Implementierung, betrachte das UML-Diagramm!
Viel Erfolg;-)

```java
public class Main {
	public static void main(String[] args) {
		Postman postman0 = new Postman(1,"Heinz",45,1);
		Postman postman1 = new Postman(2,"Klaus",45,2);
		Postman postman2 = new Postman(3,"Max",45,1);

		Postman[] employees = new Postman[3];

		employees[0] = postman0;
		employees[1] = postman1;
		employees[2] = postman2;

		PostOffice postOffice = new PostOffice(employees);

		Addressee addressee0 = new Addressee("Anna", 35, "Musterstraße 4");
		Addressee addressee1 = new Addressee("Max", 19, "Musterstraße 3");
		Addressee addressee2 = new Addressee("Claudia", 20, "Musterstraße 2");
		Addressee addressee3 = new Addressee("Peter", 51, "Musterstraße 1");

		Addressee[] addresseesOfPostman0 = new Addressee[1];
		Addressee[] addresseesOfPostman1 = new Addressee[2];
		Addressee[] addresseesOfPostman2 = new Addressee[2];

		addresseesOfPostman0[0] = addressee0;
		addresseesOfPostman1[0] = addressee1;
		addresseesOfPostman1[1] = addressee2;
		addresseesOfPostman2[0] = addressee3;

		postman0.setOrders(addresseesOfPostman0);
		postman1.setOrders(addresseesOfPostman1);
		postman2.setOrders(addresseesOfPostman2);

		Letter letter0 = new Letter("somebody",addressee0);
		Letter letter1 = new Letter("somebody else",addressee0);
		Letter letter2 = new Letter("unknown",addressee1);
		Letter letter3 = new Letter("me",addressee2);
		Parcel parcel1 = new Parcel("Mr. Smith",addressee3,5.0f);

		for(int i = 0; i < employees.length; i++) {
			System.out.println("The employee " + employees[i].getName() + " has the following addressees:");
			employees[i].printOrders();
		}
	}
}
```

![UML](https://github.com/morpfl/javakurs/blob/master/exercises/mail.png)
