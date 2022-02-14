import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            IndexStorage indexStorage = new IndexStorage(15);
            System.out.println("Размер массива родителя = " + indexStorage.size());
            System.out.println(Arrays.toString(indexStorage.reverse()));
        } catch (Exception e) {
            System.out.println("Ошибка indexStorage:" + e.getMessage());
        }
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(new Integer[]{12, 15, 25, 28, 35});
        System.out.println("Размер массива потомка = " + arrayIndexStorage.size());
        System.out.println(Arrays.toString(arrayIndexStorage.reverse()));
    }
}
