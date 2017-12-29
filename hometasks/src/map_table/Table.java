package map_table;

import java.util.*;

public class Table {

    String [] header;
//    List<Map> sortedRows = new LinkedList<>();

    Map<String, CellContent> row = new HashMap<>();
    List<Map<String, CellContent>> rows = new ArrayList<>();


    Table(String... colNames) {
        header = new String[colNames.length];
        for (int i = 0; i < colNames.length; i++) {
            this.header[i]= colNames[i];
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

    String getCellContentByColName(int r, String colName) {
        SortedMap<String, String> temp = rows.get(r - 1);
        String result = temp.get(colName);
        return result;
    }*/

    Iterator paginateBy(int start, int r) {  // r is rows-on-page

        try {
          List<Map<String, CellContent>> temp =  this.rows.subList(start, start+r);
          Iterator iterator = temp.iterator();
          return iterator;
       }catch (RuntimeException e){
           System.out.println("out of bonds, man");
       }
        return  null;
    }

    void sortDescending(String col){

       Map<Integer, CellContent> colToSort = new HashMap<>();
        for(int i = 0; i< rows.size(); i++ ){
            colToSort.put(i, rows.get(i).get(col));
        }


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


   void toStringWithPagination(List list, int r){



    }


    class QuickSort
    {
        /* This function takes last element as pivot,
           places the pivot element at its correct
           position in sorted array, and places all
           smaller (smaller than pivot) to left of
           pivot and all greater elements to right
           of pivot */
        int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            int i = (low-1); // index of smaller element
            for (int j=low; j<=high-1; j++)
            {
                // If current element is smaller than or
                // equal to pivot
                if (arr[j] <= pivot)
                {
                    i++;

                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // swap arr[i+1] and arr[high] (or pivot)
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;

            return i+1;
        }

        /* The main function that implements QuickSort()
          arr[] --> Array to be sorted,
          low  --> Starting index,
          high  --> Ending index */
        void qSort(int arr[], int low, int high)
        {
            if (low < high)
            {
            /* pi is partitioning index, arr[pi] is
              now at right place */
                int pi = partition(arr, low, high);

                // Recursively sort elements before
                // partition and after partition
                qSort(arr, low, pi-1);
                qSort(arr, pi+1, high);
            }
        }
    }

}