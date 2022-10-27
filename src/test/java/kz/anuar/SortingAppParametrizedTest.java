package kz.anuar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class SortingAppParametrizedTest {

    private final SortingApp sortingApp = new SortingApp();

    private String input;
    private String expected;

    public SortingAppParametrizedTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1 2 3 4 5 6 7 8 9 0", "0 1 2 3 4 5 6 7 8 9"},
                {"21 12 23 14 51 16 71 18 91 100",
                        "12 14 16 18 21 23 51 71 91 100"},
                {"1 2 3 4 5 6 7 8 9 0", "0 1 2 3 4 5 6 7 8 9"},
                {"-1000 -500 -2000", "-2000 -1000 -500"},
                {"1", "1"},
        });
    }

    @Test
    public void sortingTestParametrizedCases() {
        assertEquals(expected, sortingApp.sort(input));
    }
}
