class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1)
                    matrix[i][j] = -1;
                else
                    q.offer(new int[] { i, j });
            }
        }   
    
    
    int level = 1;
    int dirs[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    while(!q.isEmpty()){

        int size = q.size();

        for(int i=-;i<size;i++){
            int temp = q.poll();

            for(int[] dir: dirs){
                nr = temp[0]+dir[0];
                nc = temp[1]+dir[1];

                if(matrix[nr][nc]==-1){
                    matrix[nr][nc] = matrix[temp[0]][temp[1]] + 1;
                }
            }
        }
    }

    return matrix;
    }

    
}