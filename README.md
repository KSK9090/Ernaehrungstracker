# Kalorientracker (Java + API)

Ein einfacher Kalorientracker in Java, der Lebensmittel per Benutzereingabe verarbeitet und automatisch die Kalorien über eine API berechnet.

---

##  Features

* Eingabe von Lebensmitteln über die Konsole
* Automatische Kalorienberechnung über eine GET request zur API (API Schlüssel ist im Code enthalten)
* Ausgabe der Kalorien im Terminal
* Speicherung der Einträge in einer .txt Datei
* Berechnung basiert auf **100g pro Lebensmittel**

---

## Wie es funktioniert

1. Benutzer gibt ein Lebensmittel ein (z. B. `chicken breast`) (Eingaben momentan nur auf Englisch möglich / lesbar)
2. Das Programm ergänzt automatisch:

   ```
   100g chicken breast
   ```
3. Anfrage wird an die Edamam API gesendet
4. Die JSON-Antwort wird verarbeitet
5. Kalorien werden extrahiert und angezeigt
6. Ergebnis wird in `taeglich2.txt` gespeichert

---

## Technologien

* Java
* HTTP Requests (`HttpURLConnection`)
* JSON Parsing (manuell über String-Verarbeitung)
* FileWriter (Dateispeicherung)

---

## Installation

1. Repository klonen:

   ```
   git clone https://github.com/KSK9090/ernaehrungstracker.git
   ```

2. In das Projektverzeichnis wechseln

3. Java-Datei kompilieren:

   ```
   javac Essen2.java
   ```

4. Programm starten:

   ```
   java ernährungstracker.Essen2
   ```

---

## API Key

Dieses Projekt nutzt die Edamam API.

⚠️ Hinweis:

* Der enthaltene API-Key ist nur für Demo-Zwecke gedacht
* Er kann jederzeit deaktiviert werden

Eigener API Key:
https://developer.edamam.com/

---

## 📝 Beispiel

**Input:**

```
chicken breast
```

**Output:**

```
120.00 kcal
```

**Gespeichert in Datei:**

```
100g chicken breast 120.00 kcal
```

---

## Hinweise

* Kalorien beziehen sich immer auf **100g**
* JSON wird bewusst manuell verarbeitet (Lernzweck)
* Keine externe JSON-Library verwendet

---

## 🎯 Ziel des Projekts

Dieses Projekt wurde erstellt, um folgende Konzepte zu lernen:

* Arbeiten mit APIs
* HTTP Requests in Java
* JSON-Daten verstehen und verarbeiten
* Dateioperationen
* Grundlegende Programmstruktur

---

## 📈 Verbesserungsideen

* Tageskalorien summieren
* Menüsystem hinzufügen
* GUI (z. B. JavaFX)
* Nutzung einer JSON Library (Gson)
* API-Key auslagern (Security)
* Eingabe / Ausgabe automatisch übersetzen mit einer anderen API
* Statt nur Kalorien auch andere Nährwerte auslesen

