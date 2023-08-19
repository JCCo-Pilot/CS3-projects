public class SpiralMatrix {
    private int [][] matrix;
    private int input;
    public SpiralMatrix(int i){
        input = i;
        matrix =new int[i][i];
    }
    public void fill(){
        int value = 1;
        int left = 0;
        int right = input-1;
        int top = 0;
        int bottom = input-1;
        while(value<=input*input){
           //fills in the downards motion
            for(int i = top;i<=bottom;i++){
                matrix[i][left] = value;
                value++;
            }
            left++;
            //fills in the across motion
            for(int i = left;i<=right;i++){
                matrix[bottom][i]= value;
                value++;
            }
            bottom--;
            //fills in the upward motion
            for(int i = bottom;i>=top;i--){
                matrix[i][right]=value;
                value++;
            }
            right--;
            //fills in the back across motion
            for (int i = right;i>=left;i--){
                matrix[top][i]= value;
                value++;
            }
            top++; 
        }
    }
    
    /*public void fill(){
        int value = 1;
        int left = 0;
        int right = input-1;
        int top = 0;
        int bottom = input-1;
        //fills in the downards motion
        for(int i = top;i<=bottom;i++){
            matrix[i][left] = value;
            value++;
        }
        left++;
        //fills in the across motion
        for(int i = left;i<=right;i++){
            matrix[bottom][i]= value;
            value++;
        }
        bottom--;
        //fills in the upward motion
        for(int i = bottom;i>=top;i--){
            matrix[i][right]=value;
            value++;
        }
        right--;
        //fills in the back across motion
        for (int i = right;i>=left;i--){
            matrix[top][i]= value;
            value++;
        }
        top++;
            
    }*/
    public String toString(){
        String result = "";
        for (int x = 0; x<matrix.length;x++){
            for (int y = 0; y<matrix[x].length;y++){
                result+=(matrix[x][y]);
                result +="\t";
            }
            result+="\n";
        }
        return result;
    }
}