package at.Harvester;

public class Field {
    private int rows, columms;

    public Field(int rows, int columms) {
        this.rows = rows;
        this.columms = columms;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumms() {
        return columms;
    }

    public void setColumms(int columms) {
        this.columms = columms;
    }
}
