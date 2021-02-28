package Arrays;

public class Array2DTest {
    public static void main(String[] args){
        int[][] grid = new int[12][8]; // A 12x8 grid, in [row][col] or [y][x]
        int numRows = grid.length;  // 12
        int numCols = grid[0].length;//8
        //fill in grid
        for (int row = 0; row < numRows; ++row){
            for (int col = 0; col<numCols; ++col){
                grid[row][col] = row*numCols + col + 1;
            }
        }
        for (int row = 0; row < numRows; ++row){
            for (int col = 0; col < numCols; ++col){
                System.out.printf("%3d", grid[row][col]);
            }
            System.out.println();
        }
    }
}
