
import java.util.*;

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
        Set<String> unique = new HashSet<>();
        for (Object temp : list) {
            unique.add((String) temp);
        }
        return unique.size();
    }
}
