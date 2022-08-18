package kz.anuar;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class SortingAppTest {

    protected SortingApp sortingApp = new SortingApp();

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void testNullAsArgException() {
        String[] args = {null};
        sortingApp.sort(args);
    }

    @Test
    public void testNullAsArgMessage() {
        expectedEx.expectMessage("Arguments must be an integer.");
        String[] args = {null};
        sortingApp.sort(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoIntAsArgException() {
        String[] args = {"1", "2", "three", "four"};
        sortingApp.sort(args);
    }

    @Test
    public void testNoIntAsArgMessage() {
        expectedEx.expectMessage("Arguments must be an integer.");
        String[] args = {"1", "2", "three", "four"};
        sortingApp.sort(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroArgException() {
        String[] args = {};
        sortingApp.sort(args);
    }
    @Test
    public void testZeroArgMessage() {
        expectedEx.expectMessage("A length of array must be between 1 to 10.");
        String[] args = {};
        sortingApp.sort(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testElevenArgsException() {
        String[] args = {"150", "-150", "250", "-250", "350", "-350", "450", "-450", "550", "-550", "650"};
        sortingApp.sort(args);
    }

    @Test
    public void testElevenArgsMessage() {
        expectedEx.expectMessage("A length of array must be between 1 to 10.");
        String[] args = {"150", "-150", "250", "-250", "350", "-350", "450", "-450", "550", "-550", "650"};
        sortingApp.sort(args);
    }

}
