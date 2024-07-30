public class transMatrix {
    public int[][] transpose(int [][] matrix){
        int r = matrix.length;
        System.out.println("The number of rows in the matrix is: " + r);
        int c = matrix[0].length;
        System.out.println("The number of columns in the matrix is: " + c);
        System.out.println();
        int[][] output  = new int[c][r];

        for(int i = 0; i < r; i++){
            System.out.println();
            for(int j = 0; j < c; j++){
                System.out.println("Transposing element at index " + i + ", " + j + " to " + j + ", " + i);
                output[j][i] = matrix[i][j];
                System.out.println("Transposed element at index " + j + ", " + i + " is: " + output[j][i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        transMatrix obj = new transMatrix();
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] transposedMatrix = obj.transpose(matrix);
        System.out.println();
        System.out.println("Length of transposedMatrix is: " + transposedMatrix.length);
        System.out.println("Length of transposedMatrix[0] is: " + transposedMatrix[0].length);
        System.out.println();
        for(int i = 0; i < transposedMatrix.length; i++){
            for(int j = 0; j < transposedMatrix[0].length; j++){
                System.out.println("Element at index " + i + ", " + j + " is: " + transposedMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("The transposed matrix is: ");
        for(int i = 0; i < transposedMatrix.length; i++){
            for(int j = 0; j < transposedMatrix[0].length; j++){
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}






//public class transMatrix {
//    public int[][] transpose(int [][] matrix){
//        int r = matrix.length;
//        int c = matrix[0].length;
//        int[][] output  = new int[c][r];
//
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                output[j][i] = matrix[i][j];
//            }
//        }
//        return output;
//    }
//
//    public static void main(String[] args) {
//        transMatrix obj = new transMatrix();
//        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
//        int[][] transposedMatrix = obj.transpose(matrix);
//        for(int i = 0; i < transposedMatrix.length; i++){
//            for(int j = 0; j < transposedMatrix[0].length; j++){
//                System.out.print(transposedMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}







//public class transMatrix {
//    public int[][] transpose(int [][] matrix){
//        int r = matrix.length;
//        int c = Integer.MAX_VALUE;
//
//        // Find the minimum length of the rows
//        for (int[] row : matrix) {
//            c = Math.min(c, row.length);
//        }
//
//        int[][] output  = new int[c][r];
//
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                output[j][i] = matrix[i][j];
//            }
//        }
//        return output;
//    }
//
//    public static void main(String[] args) {
//        transMatrix obj = new transMatrix();
//        int[][] matrix = {{1, 2}, {3, 4}, {5, 6, 7}};
//        int[][] transposedMatrix = obj.transpose(matrix);
//        System.out.println("The transposed matrix is: ");
//        for(int i = 0; i < transposedMatrix.length; i++){
//            for(int j = 0; j < transposedMatrix[0].length; j++){
//                System.out.print(transposedMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}