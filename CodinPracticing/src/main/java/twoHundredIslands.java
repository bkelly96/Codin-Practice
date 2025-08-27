 class twoHundredIslands {
        boolean visited[][];

        public int numIslands(char[][] grid) {

            int output = 0;
            visited = new boolean[grid.length][grid[0].length];

            for(int i= 0; i < grid.length; i++){
                for(int j = 0; j < grid[i].length; j++){
                    if(visited[i][j] == true){
                        continue;
                    }
                    if(grid[i][j] == '0'){
                        visited[i][j] = true;
                        continue;
                    } else if(grid[i][j] =='1'){
                        //todo call determine bounds(mapping out  a mass)
                        exploreTheIsland(grid, i , j);
                        output++;
                    }
                    //have we seen i+j before, if visited, skip
                    //if not, check value
                    //if not and is water, set visited to true
                    //if not and is land, set visited to true and map
                }

            }

            return output;
        }

        public void exploreTheIsland(char[][] grid, int i, int j){
            //if a new land comes in check up, down, left, right
            //mark as explored.
            //if explored = false
            //go up
            if(visited[i][j] == true){
                return;
            }

            visited[i][j] = true;

            if(i > 0 && grid[i-1][j] == '1'){
                exploreTheIsland(grid, i-1, j);
            }
            if(i < grid.length - 1 && grid[i+1][j] == '1'){
                exploreTheIsland(grid, i+1, j);
            }
            if(j > 0 && grid[i][j-1] == '1'){
                exploreTheIsland(grid, i, j-1);
            }
            if(j < grid[i].length - 1 && grid[i][j+1] == '1'){
                exploreTheIsland(grid, i, j+1);
            }
        }
}
