**Letzte Übung 9 (Exercises - Bibliothek- Teil 3)**
- `Bibliothek` enthält `Bücher`
- `Buch` hat:
    - `Titel`
    - `Autor`
    - `ISBN`
- `Bibliothek` kann mehrere Exemplare eines `Buchs` enthalten
- `Buch` ist in `Bibliothek` entweder `entliehen` oder verfügbar
- `Bibliothek` kann unendlich `Bücher` enthalten
- `Bücher` können `ausgeliehen` und `zurückgegeben` werden

**Diese Übung 10**
*Hinweise:*

*(1) Nutze passende Collections: `List`, `Map`, `Set`!*

*(2) Stelle sicher, dass nur Aktionen durchgeführt werden können die in 
einer `Bibliothek` erlaubt sind (zB.: Ein `Buch` das bereits entliehen ist kann nicht mehr ausgeliehen werden)*
- User einer `Bibliothek` als neue Klasse mit
    - `ID`
    - `Name`
    - seine ausgeliehenen `Bücher`
- Erweitere die Ausleih-Methode um einen `Nutzer`
- `Bibliothek` enthält jeden `Nutzer` (nur einmal!)
- Nur entliehene Bücher sollen an die `Bibliothek` zurückgegeben werden können
- Erweitere Klasse `Buch`, sodass jedes ausgeliehene Exemplar die `ID` seines `Nutzer` kennt
- Erweitere die `Bibliothek` so, dass `Bücher` aufgenommen werden können
- eine `Main-Methode` in der `Bücher` aufgenommen, entliehen und zurückgegeben werden
- Die `Bibliothek` verlangt außerdem eine Gebühr von 1 Euro pro ausgeliehenes `Buch`, wenn ein `Nutzer bereits mehr als 10 `Bücher`
entliehen hat, daher speichert sie ab, welcher `Nutzer`und wie viel `Gebühr` schuldig ist

**Für die ganz Schnellen**
- Gebe den Namen des `Nutzer` eines entliehenen `Buches` zurück
- Gebe aus, ob für die `Bücher`, die ein `Nutzer` entliehen hat, noch verfügbare Exemplare in der `Bibliothek` stehen
- Recherechiere welche Implementation der Collections (zB. HashMap, TreeMap, ...) die effizienteste in unserem Anwendungsfall ist
und ergänze deinen Code passend
