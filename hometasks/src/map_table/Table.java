package map_table;

import java.util.*;

public class Table {



   public void toStringWithPagination(List list, int r) {


   }

    String[] header;


    Map<String, CellContent> row = new HashMap<>();
    List<Map<String, CellContent>> rows = new ArrayList<>();


   Table(String... colNames) {
        header = new String[colNames.length];
        for (int i = 0; i < colNames.length; i++) {
            this.header[i] = colNames[i];
        }

       /* for (int r = 0; r < row; r++) {
            this.row = new TreeMap<>();
            for (int i = 0; i < colNames.length; i++) {
                this.row.put(colNames[i], "empty");
            }
            this.rows.put(r, this.row);
            System.out.println(rows.toString());
        }*/
    }

    /*void setCellByIndex(int r, String c, String cont) {
        SortedMap<String, String> temp = rows.get(r - 1);
        temp.put(c, cont);
        rows.put(r - 1, temp);
    }
*/
    void setCellContentByColName(int r, String colName, CellContent cc) {
        Map<String, CellContent> temp = new HashMap<>();

        if (this.rows.size() >= r - 1) {
            temp = this.rows.get(r - 1);
        }

        for (int i = rows.size() - 1; i < r; i++) {
            temp.put(colName, null);
            rows.add(temp);
        }
        temp.put(colName, cc);
        rows.add(r - 1, temp);
    }

    Iterator paginateBy(int start, int r) {  // r is rows-on-page

        try {
            List<Map<String, CellContent>> temp = this.rows.subList(start, start + r);
            Iterator iterator = temp.iterator();
            return iterator;
        } catch (RuntimeException e) {
            System.out.println("out of bonds, man");
        }
        return null;
    }

    void sortDescending(String col) {

        CellContent[] colToSort = new CellContent[rows.size()];
        int[] rowId = new int[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
            colToSort[i] = rows.get(i).get(col);
            rowId[i] = i;
        }
        this.qSort(colToSort, 1, colToSort.length - 1);

       /* List<String> tempSorted = new ArrayList<>();
        List<Integer> tempSortedId = new ArrayList<>();
        for (Integer rowIn: rows.keySet()) {
             String tempStr = rows.get(rowIn).get(col);
            tempSorted.add(tempStr);
            int i = tempSorted.indexOf(tempStr);
            tempSortedId.add(i, rowIn);
        }
         for(String string: tempSorted){
            int i = 0;
             SortedMap<String, String> map = rows.get(tempSortedId.get(i));
             sortedRows.add(map);
             i++;
         }
         return sortedRows;*/
    }

    void qSort(CellContent arr[], int low, int high) {
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

    int partition(CellContent arr[], int low, int high) {
        CellContent cellContent = new CellContent();
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




    class QuickSort {
        /* This function takes last element as pivot,
           places the pivot element at its correct
           position in sorted array, and places all
           smaller (smaller than pivot) to left of
           pivot and all greater elements to right
           of pivot */


        /* The main function that implements QuickSort()
          arr[] --> Array to be sorted,
          low  --> Starting index,
          high  --> Ending index */
    }

}