public class ArrayIndexStorage extends IndexStorage {
    private final Integer[] array;

    public ArrayIndexStorage(Integer[] arr) {
        super(arr.length);
        array = arr;
    }

    public int get(int index) {
        return array[index];
    }
}
