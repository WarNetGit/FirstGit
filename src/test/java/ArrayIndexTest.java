import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexTest {
    @Test
    public void testReverseArray() {
        ArrayIndexStorage arrayTest = new ArrayIndexStorage(new Integer[]{12, 15, 25, 28, 35});
        Integer[] expected = new Integer[]{35, 28, 25, 15, 12};
        Integer[] actual = arrayTest.reverse();
        Assertions.assertArrayEquals(expected, actual);

        arrayTest = new ArrayIndexStorage(new Integer[]{1, 2, 3, 4, 5});
        expected = new Integer[]{5, 4, 3, 2, 1};
        actual = arrayTest.reverse();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseIndex() {
        IndexStorage indexStorageTest = new IndexStorage(5);
        Integer[] expected = new Integer[]{4, -3, 2, -1, 0};
        Integer[] actual = indexStorageTest.reverse();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetSize() {
        IndexStorage indexStorageTest = new IndexStorage(5);
        int expected = 5;
        int actual = indexStorageTest.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeSiz() {
        IndexStorage indexStorageTest=new IndexStorage(0);
        try {
            indexStorageTest = new IndexStorage(-5);
        } catch (Exception e) {
            System.out.println("Ошибка indexStorage:" + e.getMessage());
        }
        int expected = 0;
        int actual = indexStorageTest.size();
        Assertions.assertEquals(expected, actual);
    }
}
