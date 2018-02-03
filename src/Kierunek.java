import java.util.Arrays;
import java.util.stream.Stream;

public class Kierunek extends Dziekanat {
    private String nazwaKierunku;
    private Przedmiot[] przedmioty;
    private Student[] studenci;

    public Kierunek(String nazwaKierunku, Przedmiot[] przedmioty) {
        this.nazwaKierunku = nazwaKierunku;
        this.przedmioty = przedmioty;
    }

    public Student[] addStudent(Student student) {
//        this.studenci = this.concatAll(this.studenci, new Student[]{student});
//        this.studenci = $.concat(this.studenci, new Student[]{student});
//        this.studenci = this.appendValue(this.studenci, student);
        if(this.studenci == null) {
            this.studenci = new Student[]{student};
        } else {
            this.studenci = Stream.concat(Arrays.stream(this.studenci), Arrays.stream(new Student[]{student}))
                    .toArray(Student[]::new);
        }

        return this.studenci;
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

    public Student[] getStudenci() {
        return studenci;
    }

    public void setStudenci(Student[] studenci) {
        this.studenci = studenci;
    }
//    public Student[] appendValue(Student[] obj, Student newObj) {
//
//        ArrayList<Student> temp = new ArrayList<Student>(Arrays.asList(obj));
//        temp.add(newObj);
//        return temp.toArray();
//
//    }
}
