# Übung 6

In dieser Übung wollen wir unsere Formen-Anwendung noch etwas erweitern. Dafür nutzen wir abstrakte Klassen/Funktionen.
Falls jemand letzte Woche nicht da war, oder aus unerfindlichen Gründen die Lösung nicht mehr hat, könnt ihr als Grundlage die Musterlösung nutzen.

**Wir wollen folgendes hinzufügen:** 
Um etwas objektorientierter zu arbeiten, soll eine abstrakte Klasse `shapes` implementiert werden. Diese besitzt folgende Attribute:
- `color`
- `id`

Weiterhin soll sie eine "normale" Methode `getColor`, sowie die abstrakten Methoden `calculateArea` und `calculatePerimeter` enthalten. (Tipp: Denke daran, dass diese beiden Methoden nicht innerhalb der abstrakten Klasse implementiert werden müssen.)

**Was muss zusätzlich beachtet werden:**
- Die Klasse Triangle, Quadrilateral und Circle müssen von der abstrakten Klasse erben.
- Bedenke, was sich innerhalb der Konstruktoren und Klassenattribute ändern muss.
- Überlege, wie die einzelnen Flächeninhalte / Umfänge berechnet werden.
- Nutze @Override in den Unterklassen, um die abstrakten Methoden konkret zu implementieren.

**Was soll das Programm können:**
Das Programm soll folgende Main-Methode ausführen können:


public static void main(String[] args) {
		Circle circle = new Circle(3.4, "blue", 1);
		Parallelogram parallelogram = new Parallelogram(2.3, 5.4, "grey", 2, 2.4);
		Square square = new Square(5, "red", 3);
		
		Shape[] shape = new Shape[3];
		shape[0] = circle;
		shape[1] = parallelogram;
		shape[2] = square;
		
		for(int i = 0; i < shape.length; i++) {
			System.out.println("The shape is a: " + shape[i].getClass());
			System.out.println("The color of the shape is: " + shape[i].printColor());
			System.out.println("The area of it: " + shape[i].calculateArea());
			System.out.println("The perimeter of it: " + shape[i].calculatePerimeter());
			System.out.println("---------------------------------------------");
		}
}


