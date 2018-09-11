public class ReverseImage {
    public void rotate(int[][] matrix) {

//        for clockwise
//                A- transpose the matrix
//                B- reverse rows

       // transpose the matrix

       for(int i=0;i<matrix.length;i++){
           for(int j=i;j<matrix.length;j++){
               int temp= matrix[i][j];
               matrix[i][j]= matrix[j][i];
               matrix[j][i]=temp;
           }
       }

       System.out.println("After Tranpose--");

       printMatrix(matrix);

       // reverse rows

        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix.length/2;j++){
               int temp= matrix[i][j];
               matrix[i][j]= matrix[i][matrix.length-j-1];
               matrix[i][matrix.length-j-1]=temp;
           }
        }
        System.out.println("After Rotation--");

        printMatrix(matrix);


    }
    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

       ReverseImage ri = new ReverseImage();
       ri.rotate(arr);
      // printMatrix(arr);

    }
    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }
}
