
public class Student extends Dziekanat {
    private String imie;
    private String nazwisko;
    private String dataUrodzenia; // TODO lista studentow po ich wieku?
    private String adres;
    private String[] zainteresowania; // TODO funkcja pokazujaca studentow z takimi samymi zainteresowaniami
    private String pesel;
    private String plec;
    private Zaliczenie[] zaliczenia;


    private Kierunek kierunek;
    private Rocznik rocznik;

    public Student(String imie, String nazwisko, String dataUrodzenia, String adres, String[] zainteresowania, String pesel, String plec, Zaliczenie[] zaliczenia, Kierunek kierunek, Rocznik rocznik) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.adres = adres;
        this.zainteresowania = zainteresowania;
        this.pesel = pesel;
        this.plec = plec;
        this.zaliczenia = zaliczenia;
        this.kierunek = kierunek;
        kierunek.addStudent(this);
        this.rocznik = rocznik;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String[] getZainteresowania() {
        return zainteresowania;
    }

    public void setZainteresowania(String[] zainteresowania) {
        this.zainteresowania = zainteresowania;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public Zaliczenie[] getZaliczenia() {
        return zaliczenia;
    }

    public void setZaliczenia(Zaliczenie[] zaliczenia) {
        this.zaliczenia = zaliczenia;
    }

    public Kierunek getKierunek() {
        return kierunek;
    }

    public void setKierunek(Kierunek kierunek) {
        this.kierunek = kierunek;
    }

    public Rocznik getRocznik() {
        return rocznik;
    }

    public void setRocznik(Rocznik rocznik) {
        this.rocznik = rocznik;
    }
}
