public class ArrayComparator {

    void compare(int[][] table1, int[][] table2) {
        boolean diff = true;

        if (table1 == null || table2 ==null){
            diff = false;
        }

        if (table1.length != table2.length) {
            diff = false;}


            for (int i = 0; i < table1.length; i++) {
                for (int j = 0; j < table1[1].length; j++) {
                    if (table1[i][j] != table2[i][j]) {
                        diff = false;
                    }
                }
            } if (diff){
            System.out.println("Tablice są równe");
        } else
        System.out.println("Tablice są różne");

}

    }