public static void merge(int[] a, int[] b, int n, int m) {
    int k= m+n-1;
    int i = n-1;
    int j = m - 1;

    while(i>=0 && j>= 0){
        if(a[i] > b[j]){
            a[k--]=a[i--];
        }else{
            a[k--]=b[j--];}}
        while(j>=0){
            a[k--] = b[j--]}
    }

public static void merge(int[]a,int[]b,int n , int m){
    int k = m+n-1;
    int i = n-1;
    int j = m-1;
    while (i>=0 && j>=0){
        if(a[i]>b[j]){
            a[k--]=a[i--];
        }else{
            a[k--]=a[j--];
        }
    }
    while (j>=0){
        a[k--]=a[j--]}
}



public static void merge(int[] a, int [] b, int n, int m){
    int k = m+n-1;
    int i = n-1;
    int j = m-1;
    while (i >= 0 && j>=0){
        if (a[i]>b[j]) a[k--]= a[i--];
        else {a[k--]=b[j--];}
        while (j>=0){
            a[k--]=b[j--];
        }

