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

        table.iterateRange(3, 9);

        table.sortDescending("first");
       // System.out.println(table.sortedRows.toString());
    }

}

/*
    Разработать класс, позволяющий работать с табличными данными.
        Каждая строка таблицы представляется в виде объекта Map.
        Каждая колонка таблицы характеризуется строковым названием (ключ объекта Map)
        Добавлять строки в данную таблицу можно с помощью метода add(Map map)
        Для данной таблицы должно быть возможно указывать порядок сортировки по заданной колонке
        Должен быть реализован механизм разбиения данной таблицы на страницы с заданным количество строк
        (должно возвращаться общее количество страниц и получение итератора на данную страницу).*/
