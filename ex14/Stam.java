package ex14;

import java.util.Scanner;

public class Stam {
    private int[][] matrix;



    public Stam(int row,int col){
        Scanner s = new Scanner(System.in);
        this.matrix=new int[row][col];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                do{
                    System.out.printf("matrix[%d][%d]=",i,j);
                    matrix[i][j]=s.nextInt();
                }while(matrix[i][j]<1);
            }
        }
    }
    public boolean isDistinct(){


        return true;
    }
    public int intROw(){
        return 1;
    }
    public int intCol(){
        return 1;
    }
    public int min(){
        return 1;
    }
    public boolean arrZog(int row,int col){
        if(row>=this.matrix.length || col>=this.matrix[0].length)
            return false;
        for(int i = row;i<this.matrix.length;i++){
            for(int j=col;j<this.matrix[i].length;j++){
                if(matrix[i][j]%2==1)
                    return false;
            }
        }
        return true;
    }

}
