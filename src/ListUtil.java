
import java.lang.reflect.Array;
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
    public static <T extends Comparable<? super T>> int binarySearch(T[] array,T element) {
        Arrays.sort(array);
        int l = 0, r = array.length - 1;
        while (l <= r)
        {
            int index = l + (r-l)/2;
            if (array[index] == element)
                return index;
            l++;
        }
        return -1;
    }
    
}
