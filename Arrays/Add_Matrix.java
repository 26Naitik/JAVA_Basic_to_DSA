//write a java rpogram to print the sum between two 2x3 matrix.
public class Add_Matrix {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,3}, {3,4,5}};
        int [][] mat2 = {{7,8,9},{4,6,7}};
        int [][] result = {{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0; j<mat1[i].length;j++){
                System.out.format("Setting values for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("\nResultant Matrix:");
        for(int i=0;i<mat1.length;i++){
            for(int j=0; j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
