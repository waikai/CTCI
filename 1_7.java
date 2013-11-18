public static void setZeros(int[][] matrix){
    int[] row = new int[matrix.length];
    int[] column = new int[matrix[0].length];
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length, j++){
            if(matrix[i][j] == 0){
                row[i]=1;
                column[j] = 1;
            }
        }
    }
    for(int i = 0 ; i < matrix.length; i++){
        for(int j = 0; j< matrix[0].length; j++){
            if ((row[i] ==1)|| (column[j] ==1)){
                matrix[i][j] = 0;
            }
        }
    }
}
public static void setZeros(int[][] matrix){
    int[] row = new int[matrix.length];
    int[] culumn = new int[matrix[0].length];
    for(int i = 0 ; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
            if (matrix[i][j] == 0){
                row[i] = 1;
                culumn[j] = 1;
            }
        }
    }
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix.length; j++){
            if (row[i] == 1 || culumn[j] == 1){
                matrix[i][j] = 0;
            }
        }
    }
}

