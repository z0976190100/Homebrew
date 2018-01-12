package map_table;

public class CellContent implements Comparable<CellContent>{

    CellContent content;

    CellContent(){}

    CellContent(int row, int col, CellContent content){
        this.content = content;
    }

    @Override
    public int compareTo(CellContent o) {
        return 0;
    }
}
