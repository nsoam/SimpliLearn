import java.lang.reflect.Array;

public class AddMatrices {
    //Create 2 Matrices and add both of them in 3rd matrix
    public static void main(String[] args) {
        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        int mat3[][] = new int[2][2];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = 1;
                System.out.println("mat1[" + i + "] [" + j + "] = " + mat1[i][j]);
            }
        }

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = 2;
                System.out.println("mat2[" + i + "] [" + j + "] = " + mat2[i][j]);
            }
        }

        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println("mat3[" + i + "] [" + j + "] = " + mat3[i][j]);
            }
        }
    }
}
