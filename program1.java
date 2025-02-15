public class ProdMatrix {
    public static void main(String[] args) {
        // Initialize matrix a
        int a[][] = {
            {1, 3, 2},
            {3, 1, 1},
            {1, 2, 2}
        };
        
        // Initialize matrix b
        int b[][] = {
            {2, 1, 1},
            {1, 0, 1},
            {1, 3, 1}
        };
        
        // Calculate dimensions of the matrices
        int row1 = a.length;       // Number of rows in matrix a
        int col1 = a[0].length;    // Number of columns in matrix a
        int row2 = b.length;       // Number of rows in matrix b
        int col2 = b[0].length;    // Number of columns in matrix b
        
        // Check if multiplication is possible
        if (col1 != row2) {
            System.out.println("Matrices cannot be multiplied");
        } else {
            // Initialize the product matrix with zeros
            int prod[][] = new int[row1][col2];
            
            // Perform matrix multiplication
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) { // Use col1 instead of row2
                        prod[i][j] += a[i][k] * b[k][j]; // Accumulate the product
                    }
                }
            }
            
            // Print the product matrix
            System.out.println("Product of two matrices: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(prod[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}