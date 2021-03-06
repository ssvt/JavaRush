package com.javarush.task.task25.task2515;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height][width];
    }
    public void clear(){
        for (int w = 0; w < width; w ++){
            for (int h = 0; h < height; h++){
                this.matrix[h][w] = ' ';
            }
        }
    }
    public void print(){

        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width ; j++) {
                System.out.print(" ");
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
        }
    }

    public void setPoint(double x, double y, char c){
        int xRounded = (int) Math.round(x);
        int yRounded = (int) Math.round(y);
        if (xRounded >= 0 && xRounded < matrix[0].length && yRounded >= 0 && yRounded < matrix.length) {
            matrix[yRounded][xRounded] = c;
        }
    }
    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    setPoint(x + j, y + i, c);
                }
            }
        }
    }

    public char[][] getMatrix() { return matrix; }

    public int getHeight() { return height; }

    public int getWidth() { return width; }
}
