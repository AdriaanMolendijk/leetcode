import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {

        ArrayList<Row> rows = new ArrayList<>();
        int m = mat.length;
        for (int i = 0; i < m; i++) {
            Row row = new Row(i, mat[i]);
            rows.add(row);
        }

        System.out.println(rows);
        Collections.sort(rows);
        System.out.println(rows);
        int[] out = new int[k];
        for (int i = 0; i < k; i++) {
            out[i] = rows.get(i).getIndex();
        }
        return out;
    }

    class Row implements Comparable<Row> {
        private int index;
        private int[] row;

        public Row(int index, int[] row) {
            this.index = index;
            this.row = row;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int[] getRow() {
            return row;
        }

        public void setRow(int[] row) {
            this.row = row;
        }

        public int rowSum() {
            int sum = 0;
            for (int r : row) sum += r;
            return sum;
        }

        @Override
        public int compareTo(Row o) {
            if (rowSum() == o.rowSum())
                return Integer.compare(index, o.getIndex());
            return Integer.compare(rowSum(), o.rowSum());
        }

        @Override
        public String toString() {
            return "Row{" +
                    "index=" + index +
                    ", row=" + Arrays.toString(row) +
                    '}';
        }
    }

}
