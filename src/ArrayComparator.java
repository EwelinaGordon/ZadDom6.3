public class ArrayComparator {

    boolean compare(int[][] table1, int[][] table2) {
        boolean diff = true;

        if ((table1 != null && table2 == null) || (table1 == null && table2 != null)) {
            diff = false;
        }

        if (table1.length != table2.length) {
            diff = false;
        }

        while (diff) {
            for (int i = 0; i < table1.length; i++) {
                for (int j = 0; j < table1[1].length; j++) {
                    diff = (table1[i][j] == table2[i][j]);
                }
            }
            break;
        }
        return diff;
    }
}