package eu.fogas.orchard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    private static final int NO_TOKEN = 0;
    private static final int TOKEN = 2;

    @Test
    public void pointConstructor() {
        int x = 1;
        int y = 2;
        int apples = 3;

        Point p = new Point(x, y, apples);

        assertEquals(x, p.x());
        assertEquals(y, p.y());
        assertEquals(apples, p.getSum(NO_TOKEN));
    }

    @Test
    public void getSum_shouldSummarizeApples_whenThereIsNoInitialArray() {
        Point p = new Point(1, 2, 9);

        assertEquals(9, p.getSum(NO_TOKEN));
    }

    @Test
    public void getSum_shouldSummarizeApples_whenThereIsInitialArray() {
        int[] init = new int[]{1, 2};

        Point p = new Point(0, 0, 0, init);

        assertEquals(3, p.getSum(NO_TOKEN));
    }

    @Test
    public void getSum_shouldSummarizeApples_whenThereIsInitialArrayAndApples() {
        int[] init = new int[]{1, 2};

        Point p = new Point(0, 0, 3, init);

        assertEquals(6, p.getSum(NO_TOKEN));
    }

    @Test
    public void getSum_shouldSummarizeApplesWithToken_whenThereIsNoInitialArray() {
        Point p = new Point(1, 2, 9);

        assertEquals(18, p.getSum(TOKEN));
    }

    @Test
    public void getSum_shouldSummarizeApplesWithToken_whenThereIsInitialArray() {
        int[] init = new int[]{1, 2, 3};

        Point p = new Point(0, 0, 0, init);

        assertEquals(11, p.getSum(TOKEN));
    }

    @Test
    public void getSum_shouldSummarizeApplesWithToken_whenThereIsInitialArrayAndApples() {
        int[] init = new int[]{1, 2, 3};

        Point p = new Point(0, 0, 4, init);

        assertEquals(17, p.getSum(TOKEN));
    }
}
