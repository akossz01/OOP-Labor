package oop.labor06_2;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data) { //parameternek kap egy matrixot, es letrehoz egy matrix osztalyt azokkal
        this.rows = data.length;    // az elemekkel
        this.columns = data[0].length;
        this.data = new double[rows][columns];
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < columns; ++c) {
                this.data[r][c] = data[r][c];
            }
        }
    }

    public Matrix(Matrix m){
        this(m.data);
    }

    //deep copy olyan masolat ami elvan kulonitve - eloszor felveszi ugyanazokat az ertekeket, de utana fuggetlenek
}
