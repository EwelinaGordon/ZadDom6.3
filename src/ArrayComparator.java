public class ArrayComparator {

    boolean compare(int[][] table1, int[][] table2) {
        if (table1 == null && table2 == null) {
            return true;
        }

        if ((table1 != null && table2 == null) || (table1 == null && table2 != null)) {
            return false;
        }

        if (table1.length != table2.length) {
            return false;
        }

        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[1].length; j++) {
                if (table1[i][j] != table2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}