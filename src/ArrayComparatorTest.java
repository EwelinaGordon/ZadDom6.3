public class ArrayComparatorTest {
    public static void main(String[] args) {

        int[][] tab1 = new int[2][2];
        int[][] tab2 = new int[2][2];
        tab1[0] = new int[]{2, 1};
        tab1[1] = new int[]{2, 2};
        tab2[0] = new int[]{2, 2};
        tab2[1] = new int[]{2, 2};

        ArrayComparator arrayComparator = new ArrayComparator();
        System.out.println(arrayComparator.compare(tab1, tab2));
    }
}