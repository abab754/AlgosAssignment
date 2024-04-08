package SortingAlgos;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size10 = 10;
        int size100 = 100;
        int size250 = 250;
        int size1k = 1000;
        int size10k = 10000;
        Random random = new Random();


        //Test size 10
        int[] nums10 = new int[size10];
        for (int i = 0; i < size10; i++) {
            nums10[i] = random.nextInt(100); // Generates random integers between 0 (inclusive) and 100 (exclusive)
        }
        CountingSort cs = new CountingSort();
        cs.printArray(nums10);
        cs.printArray(cs.countSort(nums10));

        //Test size 100
        int[] nums100 = new int[size100];
        for (int i = 0; i < size100; i++) {
            nums100[i] = random.nextInt(100); // Generates random integers between 0 (inclusive) and 100 (exclusive)
        }
        cs.printArray(nums100);
        cs.printArray(cs.countSort(nums100));

        //Test size 250
        int[] nums250 = new int[size250];
        for (int i = 0; i < size250; i++) {
            nums250[i] = random.nextInt(100); // Generates random integers between 0 (inclusive) and 100 (exclusive)
        }
        cs.printArray(nums250);
        cs.printArray(cs.countSort(nums250));

        //Test size 1000
        int[] nums1k = new int[size1k];
        for (int i = 0; i < size1k; i++) {
            nums1k[i] = random.nextInt(100); // Generates random integers between 0 (inclusive) and 100 (exclusive)
        }
        cs.printArray(nums1k);
        cs.printArray(cs.countSort(nums1k));


        //Test size 10000
        int[] nums10k = new int[size10k];
        for (int i = 0; i < size10k; i++) {
            nums10k[i] = random.nextInt(100); // Generates random integers between 0 (inclusive) and 100 (exclusive)
        }
        cs.printArray(nums10k);
        cs.printArray(cs.countSort(nums10k));

    }
}
