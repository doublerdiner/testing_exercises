package CodingPractice;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] islands = {{'1','0','1'},{'0','1','1'},{'1','0','1'}};
        System.out.println(numOfIslands(islands));
    }

    private static int numOfIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int height = grid.length;
        int length = grid[0].length;
        int islands = 0;

        for(int i=0; i<height; i++){
            for(int j=0; j<length; j++){
                if(grid[i][j] == '1'){
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    private static void dfs(char[][] grid, int i, int j) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}
