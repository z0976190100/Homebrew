package map_table;

import java.util.*;

public class TableAlter {

    private long rowID = 0;
    String[] header;
    private List<Row> table = new ArrayList<>();
    int pagesQuantity;

    public TableAlter(String... colNames) {
        header = new String[colNames.length];
        for (int i = 0; i < colNames.length; i++) {
            this.header[i] = colNames[i];
        }
    }

    public void add(Map<String , CellContent> row) {
        this.table.add(new TableAlter.Row(row));
    }


    public int pageCount(int rowsOnPage) {

        if (rowsOnPage > 0 && rowsOnPage <= this.table.size()) {

            int size = this.table.size();
            this.pagesQuantity = size % rowsOnPage == 0 ? size / rowsOnPage : size / rowsOnPage + 1;
            return this.pagesQuantity;
        }

        return 0;
    }

    public Iterator iterateRange(int start, int rowsInRange) {  // r is table-on-page

        try {
            List<TableAlter.Row> temp = this.table.subList(start, start + rowsInRange);
            Iterator iterator = temp.iterator();
            return iterator;
        } catch (RuntimeException e) {              // ??????????? how to is a good practice?
            System.out.println("out of bounds, man");
        }
        return null;
    }


    public void customSort(List<TableAlter.Row> tableToSort, String colName, String sortType) {


        switch (sortType) {
            case "descending":
                tableToSort.sort(new Comparator<TableAlter.Row>() {
                    @Override
                    public int compare(TableAlter.Row o1, TableAlter.Row o2) {
                        return (o1.getRow().get(colName)).compareTo(o2.getRow().get(colName));
                    }
                }.reversed());
                break;
            case "ascending":
                tableToSort.sort(new Comparator<TableAlter.Row>() {
                    @Override
                    public int compare(TableAlter.Row o1, TableAlter.Row o2) {
                        return (o1.getRow().get(colName)).compareTo(o2.getRow().get(colName));
                    }
                });
                break;
            default:
                break;
        }
    }

    //**

    private class Row implements Comparable<Row> {

        long id;
        Map<String, CellContent> row = new HashMap<>();

        private Row(Map<String, CellContent> roww) {
            this.id = rowID++;
            this.addRow(roww);
        }


        @Override
        public int compareTo(Row o) {
            return 0;
        }


        Map<String, CellContent> getRow() {
            return row;
        }

        private  void addRow(Map<String, CellContent> row){
            for (String str : row.keySet()) {
                this.row.put(str, row.get(str));
            }
        }
       private void setRow(String [] header, CellContent ... cont) {

        }


    }

//**

    public interface CellContent <T> extends Comparable<CellContent> {

        default int compareTo(CellContent o){
            return 0;
        }

        void setCell(T content);

    }
}
