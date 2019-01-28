package aufgaben.aufgabe34;

public class Bistro {
    private String name;
    private int anzahlPlaetze;
    private boolean offen;

    public Bistro(String name, int anzahlPlaetze) {
        this.name = name;
        this.anzahlPlaetze = anzahlPlaetze;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlPlaetze() {
        return anzahlPlaetze;
    }

    public void setAnzahlPlaetze(int anzahlPlaetze) {
        this.anzahlPlaetze = anzahlPlaetze;
    }

    public boolean isOffen() {
        return offen;
    }

    public void oeffnen() {
        offen = true;
    }

    public void schliessen() {
        offen = false;
    }
}
