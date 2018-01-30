package map_table;

public class Main {


    public static void main(String[] args) {


        TableAlter table = new TableAlter("first", "second", "third");

        System.out.println(table.header.toString());


        TableAlter.CellContent CellImpl = new TableAlter.CellContent() {

            String content = "content1";
            @Override
            public void setCell(Object content) {
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        } ;

        TableAlter.CellContent CellImpl2 = new TableAlter.CellContent() {

            String content = "content2";
            @Override
            public void setCell(Object content) {
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        } ;



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
