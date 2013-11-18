int fibo(int n){
    if(n == 0){
        return 0;
    }else if(n == 1){
        return 1;
    }else if (n >1){
        return fibo(n-1)+fibo(n-2);
    }else {
    return -1;
    }
}
int f(int n){
    if (n < 0) return -1;
    if (n == 0) return 0;
    int a = 1, b =1;
    for(int i = 3; i <= n; i++){
        int c = a+b;
        a=b;
        b=c;
    }
    return b;
}

