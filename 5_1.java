public static int updateBits(int n, int m, int i, int j) {
    int max = ~0; // all 1
    int left = max - ((1<<i)-1);
    int mask = left | right;
    return (n & mask)|(m << i);
}
public static int updateBits(int n, int m , int i, int j){
    int ret = (1<<i)-1;
    ret = ret & n;
    return((n>>(j+1)<<(j+1)))|(m<<j)|ret;
}

public static int bit(int n, int m, int j. int i){
    int ret = (1 << i) -1;
    ret = ret & n ;
    return ((n >> (j+1)<<(j+1)))|(m << j)|ret;
}




public static int bit(int n, int m, int i, int j ){
    int ret = (1 << i) -1 ;
    ret = ret & n ;
    return (n >> (j+1) << (j+1))|(m << j)|ret ;
}

