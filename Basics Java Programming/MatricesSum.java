//sum of two 3x3 matrix.
import java.util.*;
class Matrix{
    private int [][]data1;    
    private int [][]data2;
    public Matrix(){     //Constructor.
        data1 = new int[3][3];
        data2 = new int[3][3];
    }
    
    public void setMatrix1(){
        System.out.println("Enter elements for 1st 3x3 matrix:");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                data1[i][j] = sc.nextInt();
            }
        }
    }
    
    public void setMatrix2(){
        System.out.println("Enter elements for 2nd 3x3 matrix:");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                data2[i][j] = sc.nextInt();
            }
        }
    }
    
    public int[][] addMatrices(){
        int[][] result = new int[3][3];
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++)  {
            result[i][j] = data1[i][j] + data2[i][j];
          }
        }
        return result;
    }
    
}
class MatricesSum {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.setMatrix1();
        m.setMatrix2();
        int[][] res = m.addMatrices();
        System.out.println("Sum of two 3x3 matrix = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}