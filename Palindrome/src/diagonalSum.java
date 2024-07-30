import org.w3c.dom.ls.LSOutput;
import java.util.*;

public class diagonalSum {
    public int diagonal(int[][] matrix){
        int r = matrix.length;
        System.out.println("The number of rows in the matrix is: " + r);
        int c = matrix[0].length;
        System.out.println("The number of columns in the matrix is: " + c);
        System.out.println();
        int sum = 0;
        for(int rowNo = 0; rowNo < r; rowNo++){
            System.out.println();
            System.out.println("Considering element at index " + rowNo + ", " + rowNo);
            int primaryDiagonal = matrix[rowNo][rowNo];
            int colNo = c - rowNo - 1;
            System.out.println("Considering element at index " + rowNo + ", " + colNo);
            int secondaryDiagonal = matrix[rowNo][colNo];
            sum += primaryDiagonal;
            System.out.println("Added " + primaryDiagonal + " to the sum. Sum is now: " + sum);
            if(rowNo != colNo){
                sum += secondaryDiagonal;
                System.out.println("Added " + secondaryDiagonal + " to the sum. Sum is now: " + sum);
                System.out.println();
            }
        }
        return sum;

    }

    public static void main(String[] args){
        diagonalSum obj = new diagonalSum();
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println("The sum of the diagonals of the given matrix is: " + obj.diagonal(matrix));
    }
}





//public class diagonalSum {
//    public int diagonal(int[][] matrix){
//        int r = matrix.length;
//        int c = matrix[0].length;
//        int sum = 0;
//        for(int rowNo = 0; rowNo < r; rowNo++){
//            int primaryDiagonal = matrix[rowNo][rowNo];
//            int colNo = c - rowNo - 1;
//            int secondaryDiagonal = matrix[rowNo][colNo];
//            sum += primaryDiagonal;
//            if(rowNo != colNo){
//                sum += secondaryDiagonal;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args){
//        diagonalSum obj = new diagonalSum();
//        int[][] matrix = {{1, 2,3},{4, 5, 6},{7, 8, 9}};
//        System.out.println("The sum of the diagonals of the given matrix is: " + obj.diagonal(matrix));
//    }
//}




//import java.util.Scanner;
//public class diagonalSum{
//    public int diagonal(int[][] matrix){
//        int r = matrix.length;
//        int c = matrix[0].length;
//        int sum = 0;
//        for(int rowNo = 0; rowNo < r ; rowNo++){
//            int primaryMat = matrix[rowNo][rowNo];
//            sum += primaryMat;
//            int colNo = c - rowNo - 1;
//            int secondaryMat = matrix[rowNo][colNo];
//            if(rowNo != colNo){
//                sum += secondaryMat;
//            }
//        }
//        return sum;
//    }
//    public int[][] takeInput(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Enter the number of columns: ");
//        int columns = sc.nextInt();
//        int[][] matrix = new int[rows][columns];
//        System.out.println("Enter the elements of the matrix:");
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < columns; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        return matrix;
//    }
//    public static void main(String[] args){
//        diagonalSum obj = new diagonalSum();
//        int[][] elements = obj.takeInput();
//        System.out.println("The sum of the diagonal elements of the matrix is: " + obj.diagonal(elements));
//    }
//}







