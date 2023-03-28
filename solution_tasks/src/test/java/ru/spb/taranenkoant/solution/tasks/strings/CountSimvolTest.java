package ru.spb.taranenkoant.solution.tasks.strings;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSimvolTest {

    private final CountSimvol countSimvol = new CountSimvol();

    @Test
    public void oneSymbolTest() {
        int actual = countSimvol.countOccurrences("A", 'A');
        assertEquals(1, actual);
    }

    @Test
    public void twoSymbolTest() {
        int actual = countSimvol.countOccurrences("AA", 'A');
        assertEquals(2, actual);
    }

    @Test
    public void twoSymbolWithSpaceTest() {
        int actual = countSimvol.countOccurrences("A A", 'A');
        assertEquals(2, actual);
    }


    @Test
    public void twoSmallSymbolWithSpaceTest() {
        int actual = countSimvol.countOccurrences("a a", 'A');
        assertEquals(0, actual);
    }

    @Test
    public void oneSmallOneLargeSymbolWithSpaceTest() {
        int actual = countSimvol.countOccurrences("a A", 'A');
        assertEquals(1, actual);
    }

    @Test
    public void oneSmallOneLargeSymbolWithSpace2Test() {
        int actual = countSimvol.countOccurrences("A a", 'A');
        assertEquals(1, actual);
    }


    @Test
    public void manyDifferentSymbolsTest() {
        int actual = countSimvol.countOccurrences("A B C D A A B AA", 'A');
        assertEquals(5, actual);
    }

    @Test
    public void emptyStrTest() {
        int actual = countSimvol.countOccurrences("", 'A');
        assertEquals(0, actual);
    }

    @Test
    public void emptyWithSpaceStrTest() {
        int actual = countSimvol.countOccurrences("         ", 'A');
        assertEquals(0, actual);
    }

    @Test
    public void strangeTest() {
        int actual = countSimvol.countOccurrences("         A ", 'A');
        assertEquals(1, actual);
    }

    @Test
    public void npeTest() {
        int actual = countSimvol.countOccurrences(null, 'A');
        assertEquals(1, actual);
    }

    @Test
    public void emptySymbolTestTest() {
        int actual = countSimvol.countOccurrences(" ", ' ');
        assertEquals(1, actual);
    }

    @Test
    public void largeEmptySymbolTestTest() {
        int actual = countSimvol.countOccurrences("     ", ' ');
        assertEquals(5, actual);
    }

    @Test
    public void tabSymbolTestTest() {
        int actual = countSimvol.countOccurrences(" ", ' ');
        assertEquals(1, actual);
    }

    @Test
    public void tab2SymbolTestTest() {
        int actual = countSimvol.countOccurrences("  ", ' ');
        assertEquals(2, actual);
    }
}