public class IndexStorage {
    private final int size;

    public IndexStorage(int size) throws NegativeArraySizeException {
        if (size < 0) {
            throw new NegativeArraySizeException("Размер массива не может быть отрицательным");
        }
        this.size = size;
    }

    public int get(int index) {
        return index % 2 == 0 ? index : -index;
    }

    public int size() {
        return size;
    }

    public Integer[] reverse() {
        Integer[] reversArr = new Integer[size];
        for (int i = 0; i < reversArr.length; i++) {
            reversArr[size - 1 - i] = get(i);
        }
        return reversArr;
    }

}
