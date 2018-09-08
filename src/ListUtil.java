
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BinaryOperator;

public class ListUtil {
    /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * The list can contain null value and count as a unique.
     *
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list) {
        if (list == null) throw new NullPointerException();
        Set<Object> unique = new HashSet<>();
        for (Object temp : list) {
            unique.add( temp);
        }
        return unique.size();
    }

    /**
     * Searching the index of the element by using bisection methods.
     * @param array
     * @param element
     * @return index of the searched element.
     */
    public static <T extends Comparable<? super T>> int binarySearch(T[] array,T element){
        if (array == null) throw new IllegalArgumentException("Search element must not be null.");
        int first = 0;
        int last  = array.length;
        Arrays.sort(array);
        while (first < last) {
            int mid = first + ((last - first) / 2);
            if (element.compareTo(array[mid]) < 0) {
                last = mid;
            } else if (element.compareTo(array[mid]) > 0) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
