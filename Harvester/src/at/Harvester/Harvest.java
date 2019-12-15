package at.Harvester;

public class Harvest {
//_____________________________________Fields________________________________________________
    private Field f;
    private char direction;
    private int startCol, startRow;
//_____________________________________Constructor___________________________________________
    public Harvest(int columns, int rows,int startCol, int startRow, char direction) {
        setF(columns, rows);
        setStartCol(startCol);
        setStartRow(startRow);
        setDirection(direction);
    }
//_____________________________________Setter____________________________________________
    public void setF(int columns, int rows) {
        this.f = new Field(columns,rows);
    }
    public void setF(Field f) {
        this.f = f;
    }
    public void setStartCol(int startCol) {
        this.startCol = startCol;
    }
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
    public void setDirection(char direction) {
        this.direction = direction;
    }
//___________________________________________Getter_______________________________________
    public int getStartCol() {
        return startCol;
    }
    public char getDirection() {
        return direction;
    }
    public int getStartRow() {
        return startRow;
    }
    public Field getF() {
        return f;
    }
//_________________________________________Methods_1__________________________________________

}
