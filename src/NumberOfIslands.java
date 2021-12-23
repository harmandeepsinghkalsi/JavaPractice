package practice;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberOfIslands {


        public static void main(String[] args) {

            char[][] grid = {
                                {'1','1','1','1','0'},
                                {'1','1','0','1','0'},
                                {'1','1','0','0','0'},
                                {'0','0','0','0','1'}
                            };
            int noOfIslands = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        traverseGrid(grid, i, j);
                        noOfIslands++;
                    }
                }
            }
            System.out.println(noOfIslands);
        }

        public static void traverseGrid(char grid[][], int row, int col){

            //base conditions
            if(row < 0 || row > grid.length-1 || col <0 || col > grid[0].length-1 ){
                return;
            }
            if(grid[row][col] == '0'){
                return;
            }

            // Processing condition
            grid[row][col]='0';

            // call the traverse function again for all the four directions
            traverseGrid(grid, row-1, col); //top
            traverseGrid(grid,row+1, col); //down
            traverseGrid(grid, row, col-1); //left
            traverseGrid(grid,row, col+1); //right


        }
    }

