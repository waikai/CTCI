public static void printPar(int l, int r, char[] str, int count){
    if(l < 0 || r < l) return;
    if (l == 0 && r == 0){
        System.out.println(str);
    }else {
        if (l > 0){
            str[count] = '(';
            printPar(l -1, r, str , count+1);
        }
        if( r > l){
            str[count] = ')';
            printPar(l, r-1, str, count + 1);
        }
    }
}
public static void printPar(int count){
    char[] str = new char[count*2];
    printPar(count, count, str, 0);
}

public static void printPar(int l ,int r, char[] str, count){
    if (l < 0 || r<l) return;
    if (l == 0 && r == 0){
        System.out.println(str);
    }else {
        if(l > 0){
            str[count]='(';
            printPar(l -1, r, str, count+1);
        }
        if (r > l){
            str[count] = ')';
            print
        }
    }
}


public static void findpath(int[][] matrix, int m, int n){
    if (matrix[m][n] == 1) return;
    if (m == 0 && n == 0){
        System.out.println(path);
    }else{
        if (m >= 1){
            findpath












