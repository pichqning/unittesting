import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;


public class ListUtilTest {
    /**
     * Test class for ListUtil
     *
     * @author Pichaaun Popukdee
     */

    private List<Object> makeList(Object... ele) {
        return java.util.Arrays.asList(ele);
    }

    @Test
    public void testFewElement() {
        assertEquals(1, ListUtil.countUnique(makeList("a")));
        assertEquals(0, ListUtil.countUnique(makeList()));
        assertEquals(2, ListUtil.countUnique(makeList(null, "1")));

    }

    @Test
    public void testFewDuplicates() {
        assertEquals(4, ListUtil.countUnique(makeList("1", "2", "a", "a", "3", "1", "2", "a")));
        assertEquals(2 , ListUtil.countUnique(makeList(null , null , "0" , "0")));
    }

    @Test
    public void testImpossible () {
        List<?> a = null;
        boolean possible = true ;
        try
        {
            ListUtil.countUnique(a);
        }
        catch (Exception e) {
            possible = false;
        }
        assertFalse(possible);
    }

    @Test
    public void testUpperCase () {
        assertEquals(2,ListUtil.countUnique(makeList("a","A")));
    }

    @Test
    public void testHugeList () {
        String cha = "abcd";
        List<Character> list = new ArrayList<>();
        int count = 100_000;
        Random ran = new Random();
        while (count > 0) {
            list.add(cha.charAt(ran.nextInt(4)));
            count--;
        }

        assertEquals(4,ListUtil.countUnique(list));

    }

}

