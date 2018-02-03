import java.util.*;

public class Dziekanat extends Main {
    private Student[] Studenci;
    private Przedmiot[] Przedmioty;
    private Kierunek[] Kierunki;
    private Rocznik[] Roczniki;
    private Wykladowca[] Wykladowcy;

    public void Dziekanat(String[] args) {
        this.importujDane();
        this.wyswietlListeStudentow();
    }

    public void wyswietlListeStudentow() {
        System.out.printf("Informacje ogólne \n" +
                "Ilość wszystkich studentów: %d" +
                "Ilość osób na kierunku informatyka: %d",
                this.iloscWszystkichStudentow(), this.getKierunek("Informatyka").);

        for (Student student: this.Studenci) {
            System.out.printf("Imię i nazwisko: %s %s \n",
                    student.getImie(),
                    student.getNazwisko());
        }
    }

    public int iloscWszystkichStudentow() {
        return this.Studenci.length;
    }

    private Przedmiot getPrzedmiot(String nazwaPrzedmiotu) {
        for (Przedmiot przedmiot: this.Przedmioty) {
            if(przedmiot.getNazwa() == nazwaPrzedmiotu) {
                return przedmiot;
            }
        }

        return null;
    }

    private Kierunek getKierunek(String nazwaKierunku) {
        for (Kierunek kierunek: this.Kierunki) {
            if(kierunek.getNazwaKierunku() == nazwaKierunku) {
                return kierunek;
            }
        }

        return null;
    }

    public void importujDane() {
        // Deklarujemy wykladowców
        Wykladowca AdrianLeszczynski = new Wykladowca(
                "Adrian", "Leszczynski"
        );

        this.Wykladowcy = new Wykladowca[] {
                AdrianLeszczynski
        };


        // Deklarujemy przedmioty
        Przedmiot Informatyka = new Przedmiot("Informatyka", AdrianLeszczynski);
        Przedmiot Matematyka = new Przedmiot("Matematyka", AdrianLeszczynski);
        Przedmiot PodstawyProgramowania = new Przedmiot("Podstawy programowania", AdrianLeszczynski);
        Przedmiot Fizyka = new Przedmiot("Fizyka", AdrianLeszczynski);

        this.Przedmioty = new Przedmiot[] {
                Informatyka, Matematyka, PodstawyProgramowania, Fizyka
        };


        // Deklarujemy kierunki
        Kierunek KierunekInformatyka = new Kierunek(new Przedmiot[]{Informatyka, Fizyka, PodstawyProgramowania});

        this.Kierunki = new Kierunek[] {
            KierunekInformatyka
        };


        // Deklarujemy roczniki
        Rocznik Rocznik2017 = new Rocznik(2017,
                new Kierunek[]{KierunekInformatyka});


        // Deklarujemy studentów
        String[] zainteresowania = {"Książki", "Seks"};
        Zaliczenie[] zaliczenia = {new Zaliczenie()};
        Student JanKowalski = new Student(
                "Jan", "Kowalski",
                "12.03.1998", "Wrocław",
                zainteresowania, "98031200831",
                "Mężczyzna", zaliczenia,
                KierunekInformatyka, Rocznik2017);

        this.Studenci = new Student[] {
                JanKowalski,
        };
    }
}
