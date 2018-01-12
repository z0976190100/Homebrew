package map_table;

public class Main {


    public static void main(String[] args) {


        Table table = new Table("first", "second", "third");

        System.out.println(table.header.toString());

        table.setCellContentByColName(3, "first", new CellContent());
        table.setCellContentByColName(3, "second",new CellContent());
        table.setCellContentByColName(12, "first",new CellContent());
        table.setCellContentByColName(10, "first",new CellContent());
        table.setCellContentByColName(10, "third",new CellContent());
        table.setCellContentByColName(15, "first",new CellContent());

        //System.out.println(table.getCellContentByColName(3, "first"));

        table.paginateBy(3, 9);

        table.sortDescending("first");
       // System.out.println(table.sortedRows.toString());
    }

}
