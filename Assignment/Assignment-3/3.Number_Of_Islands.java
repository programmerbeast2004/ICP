class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length ==0) return 0;
        int r=grid.length;
        int c=grid[0].length;
        int ct=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    ct++;
                    dfs(grid,i,j);
                }
            }
        }
        return ct;
    }
    public void dfs(char [][]grid,int i,int j){
        int r=grid.length;
        int c=grid[0].length;
        if(i<0 || j<0 || i>=r || j>= c ||grid[i][j]=='0') return;
        grid[i][j]='0';
        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};
        for(int d=0;d<4;d++){
            dfs(grid,i+dx[d],j+dy[d]);
        }
    }
}