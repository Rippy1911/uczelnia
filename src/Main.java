import java.util.Arrays;

/**
 * W poleceniu były zmienne, klasy i metody w języku polskim. Aplikacja zrobiona w takim samym zamierzeniu. :(
 */
public class Main {
    public static void main(String[] args) {
        Dziekanat dziekanat = new Dziekanat();
        dziekanat.Dziekanat(args);
    }

    public static <T> T[] concatAll(T[] first, T[]... rest) {
        int totalLength = first.length;
        for (T[] array : rest) {
            totalLength += array.length;
        }
        T[] result = Arrays.copyOf(first, totalLength);
        int offset = first.length;
        for (T[] array : rest) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }
}
