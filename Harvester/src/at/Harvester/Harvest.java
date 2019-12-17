package at.Harvester;

import java.awt.*;

public class Harvest {
//_____________________________________Data_Fields________________________________________________
    private Field f;
    private char direction;
    private int startCol, startRow;
    private Point startPoint, leftTopCorner, rightTopCorner, leftBottomCorner, rightBottomCorner;
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

    public void calculatePath(){
        int tmp = startPoint.x*startPoint.y;
       if(direction == 'O'){

       }

    }
//________________________________________Methods_2_(secondary Methods)____________________________________________

    public void generatePoints(){
        generateStartPoint();
        generateLeftTopCorner();
        generateLeftBottomCorner();
        generateRightTopCorner();
        generateRightBottomCorner();
    }
//_______________________________________Methods_3_(tertiary Methods)___________________________________________________
    //___move____
    public int moveEast(int input){
        return input+1;
    }
    public int moveWest(int input){
        return input-1;
    }
    public int moveSouth(int input){
        return input+f.getColumms();
    }
    public int moveNorth(int input){
        return input-f.getColumms();
    }
    //__generatePoints__
    public void generateStartPoint() {
        this.startPoint = new Point(startCol, startRow);
    }
    public void generateLeftTopCorner() {
        this.leftTopCorner = new Point(1,1);
    }
    public void generateRightTopCorner() {
        this.rightTopCorner = new Point(f.getColumms(), 1);
    }
    public void generateLeftBottomCorner() {
        this.leftBottomCorner = new Point(1, f.getRows());
    }
    public void generateRightBottomCorner() {
        this.rightBottomCorner = new Point(f.getColumms(), f.getRows());
    }
}
