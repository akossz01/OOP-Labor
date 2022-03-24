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

    public Matrix(Matrix m) {
        this(m.data);
    }

    public void fillRandom(double a, double b){
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < columns; ++c) {
                data[r][c] = Math.random()*(b-a)+a;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix() {
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < columns; ++c) {
                System.out.print(this.data[r][c] + " ");
            }
            System.out.println("\n");
        }
    }

    public Matrix add(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.columns != m2.columns) {
            return null;
        } else {
            Matrix m3 = new Matrix(m1.rows, m1.columns);
            for (int r = 0; r < rows; ++r) {
                for (int c = 0; c < columns; ++c) {
                    m3.data[r][c] = m1.data[r][c] + m2.data[r][c];
                }
            }
            return m3;
        }
    }

    public Matrix transpose(Matrix m1) {
        Matrix m2 = new Matrix(m1.rows, m1.columns);

        for (int r = 0; r < m1.rows; ++r) {
            for (int c = 0; c < m1.columns; ++c) {
                m2.data[r][c] = m1.data[c][r];
            }
        }

        return m2;
    }

    //deep copy olyan masolat ami elvan kulonitve - eloszor felveszi ugyanazokat az ertekeket, de utana fuggetlenek
}
