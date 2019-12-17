package at.Harvester;

public class Field {
//_______________________________Fields_______________________________
    private int rows, columms;
//________________________________Constructor___________________________
    public Field(int rows, int columms) {
        this.rows = rows;
        this.columms = columms;
    }
//_________________________________Getter_______________________________
    public int getRows() {
        return rows;
    }
    public int getColumms() {
        return columms;
    }

//__________________________________Setter_______________________________
    public void setRows(int rows) {
        this.rows = rows;
    }
    public void setColumms(int columms) {
        this.columms = columms;
    }
//_________________________________Methods_1_____________________________

}
