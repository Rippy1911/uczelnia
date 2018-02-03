public class Rocznik extends Dziekanat  {
    private Integer rok;
    private Kierunek[] kierunki;

    public Rocznik(Integer rok, Kierunek[] kierunki) {
        this.rok = rok;
        this.kierunki = kierunki;
    }

    public Integer getRok() {
        return rok;
    }

    public void setRok(Integer rok) {
        this.rok = rok;
    }

    public Kierunek[] getKierunki() {
        return kierunki;
    }

    public void setKierunki(Kierunek[] kierunki) {
        this.kierunki = kierunki;
    }
}
