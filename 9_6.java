public boolean findElem(int[][] mat,int elem, int M ,int N) {
    int row = 0;
    int col = N-1;
    while (row < M && col >= 0) {
        if (mat[row][col] == elem){
            return true;
        }else if (mat[row][col] > elem){
            col--;
        }else {
            row++;
        }
    }
    return false;
}

public boolean findElem(int[][] mat,int elem,  int m ,int n,){
    int row = 0;
    int col = N-1;
    while (row < m && col < n){
        if (mat[row][col] == elem){
            return true ;
        }else if (mat[row][col] > elem){
            col--;
        }else{
            row++;
        }
    }
    return false;
}

