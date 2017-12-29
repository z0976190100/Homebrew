package map_table;

public class Main {


    public static void main(String[] args) {


        Table table = new Table(20, "first", "second", "third");

        System.out.println(table.header.toString());

        table.setCellByIndex(3, "first", "mycontent");
        table.setCellByIndex(3, "second", "1");
        table.setCellByIndex(12, "first", "mycontent");
        table.setCellByIndex(10, "first", "notmycontent");
        table.setCellByIndex(10, "third", "orororor");
        table.setCellByIndex(15, "first", "anotmycontent");

        System.out.println(table.getCellContentByColName(3, "first"));

        table.paginateBy(3, table.rows);

        table.sortDescending("first");
        System.out.println(table.sortedRows.toString());
    }

}
