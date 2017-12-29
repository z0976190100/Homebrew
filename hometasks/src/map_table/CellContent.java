package map_table;

public class CellContent implements Comparable<CellContent>{

    String content;

    CellContent(int row, int col, String content){
        this.content = content;
    }

    @Override
    public int compareTo(CellContent o) {
        return 0;
    }
}
