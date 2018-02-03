import java.util.ArrayList;
import java.util.Arrays;

public class Kierunek extends Dziekanat {
    private String nazwaKierunku;
    private Przedmiot[] przedmioty;
    private Student[] studenci;

    public Kierunek(String nazwaKierunku, Przedmiot[] przedmioty) {
        this.nazwaKierunku = nazwaKierunku;
        this.przedmioty = przedmioty;
    }

    public addStudent(Student student) {
        this.studenci = this.appendValue(this.studenci, student);
    }

    public String getNazwaKierunku() {
        return nazwaKierunku;
    }

    public void setNazwaKierunku(String nazwaKierunku) {
        this.nazwaKierunku = nazwaKierunku;
    }

    public Przedmiot[] getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(Przedmiot[] przedmioty) {
        this.przedmioty = przedmioty;
    }

    public Student[] appendValue(Student[] obj, Student newObj) {

        ArrayList<Student> temp = new ArrayList<Student>(Arrays.asList(obj));
        temp.add(newObj);
        return temp.toArray();

    }
}
