public class Przedmiot extends Dziekanat {
    private String nazwa;
    private Wykladowca wykladowca;

    public Przedmiot(String nazwa, Wykladowca wykladowca) {
        this.nazwa = nazwa;
        this.wykladowca = wykladowca;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
