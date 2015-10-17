# Kapitel 4 Übung 2 ("Primzahlen ermitteln")

## Prüfen ob eine Primzahl vorliegt

* Schreiben Sie eine Methode isPrimzahl, die einen Parameter vom Typ ```int``` erwartet (```testzahl```) und als Ergebnis einen ```boolean``` zurückliefert.
* Diese Methode soll ```true``` liefern, wenn die übergebene Zahl eine Primzahl ist, sonst ```false```.

| Tipps  |
| ------------- |
| Sie müssen für jede Zahl ```n``` zwischen ```2``` und ```testZahl-1``` dahingehend prüfen, ob ```testZahl``` durch ```n``` teilbar ist.  |
| Für die Prüfung "ist teilbar" eignet sich der Restberechnungs-Operator ```%```.  |

## Primzahlen ermitteln und zählen

* Schreiben Sie ein Programm, welches jede Zahl zwischen 2 und 10000 dahingehend prüft, ob sie eine Primzahl ist, und das Ergebnis für jede Zahl anzeigt.
* Verwenden Sie dazu die Methode aus dem vorangegangenen Übungsteil.
* Geben Sie am Ende zusätzlich aus, wieviele Primzahlen gefunden wurden und welchen Anteil in Prozent sie an den getesteten Zahlen haben.

## Programm in eine Methode auslagern und Zahlenblöcke auf Primzahlen prüfen

* Schreiben Sie eine Methode ```ermittleAnzahlPrimzahlen```, welche zwei Parameter vom Typ ```int``` übergeben bekommt (```von``` und ```bis```) und einen ```int``` zurückliefert.
* Diese Methode soll zählen, wieviele Primzahlen es zwischen von und bis gibt, und das Ergebnis zurückliefern.
* Wenn dies funktionert, erweitern Sie das Programm, so dass es jeweils 10 Zahlenblöcke mit jeweils 1000 Zahlen (von 1 bis
1000, 1001 bis 2000 usw.) dahingehend prüft, wieviele Primzahlen in dem jeweiligen Block existieren.
