class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){
            return image;
        }
        helper(image,  sr,  sc,  newColor,image[sr][sc]);
        return image;
    }
    
     int dirs[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

     public void helper(int[][] image, int sr, int sc, int newColor , int initial){
         if(sr<0|| sc<0 || sr>= image.length || sc >= image[0].length  || image[sr][sc] != initial){
             return;
         }

        image[sr][sc]=newColor;

        for(int[] dir : dirs){
            int nr = sr + dir[0];
            int nc = sc + dir[1];
            helper( image,  nr,  nc,  newColor,initial);
        }
     };
}