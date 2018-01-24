package map_table;

import java.util.*;

public class Table {

    String[] header;
    private List<Map<String, CellContent>> rows = new ArrayList<>();
    int pagesQuantity;

    Table(String... colNames) {
        header = new String[colNames.length];
        for (int i = 0; i < colNames.length; i++) {
            this.header[i] = colNames[i];
        }
    }


    public void add(Map<String, CellContent> map) {
        // validation???
        this.rows.add(map);

    }

    public void setCellContentByColName(int row, String colName, CellContent content) {
        Map<String, CellContent> temp = new HashMap<>();

        if (this.rows.size() >= row - 1) {
            temp = this.rows.get(row - 1);
        }

        for (int i = rows.size() - 1; i < row; i++) {
            temp.put(colName, null);
            rows.add(temp);
        }
        temp.put(colName, content);
        rows.add(row - 1, temp);
    }

    public int pageCount(int rowsOnPage) {

        if (rowsOnPage > 0 && rowsOnPage <= this.rows.size()) {

            int size = this.rows.size();
            this.pagesQuantity = size % rowsOnPage == 0 ? size / rowsOnPage : size / rowsOnPage + 1;
            return pagesQuantity;
        }

        return 0;
    }

    public Iterator iterateRange(int start, int rowsInRange) {  // r is rows-on-page

        try {
            List<Map<String, CellContent>> temp = this.rows.subList(start, start + rowsInRange);
            Iterator iterator = temp.iterator();
            return iterator;
        } catch (RuntimeException e) {              // ??????????? how to is a good practice?
            System.out.println("out of bounds, man");
        }
        return null;
    }

    public void sortDescending(String col) {

        CellContent[] colToSort = new CellContent[rows.size()];
        int[] rowId = new int[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
            colToSort[i] = rows.get(i).get(col);
            rowId[i] = i;
        }
        this.qSort(colToSort, 1, colToSort.length - 1);
    }

    private void qSort(CellContent arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }

    private int partition(CellContent arr[], int low, int high) {

        CellContent pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            int compResult = arr[j].compareTo(pivot);
            if (compResult <= 0) {
                i++;

                // swap arr[i] and arr[j]
                CellContent temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        CellContent temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void toStringWithPagination(List list, int r) {
    }

}