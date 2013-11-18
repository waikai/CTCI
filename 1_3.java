public static void re(char[] str){
    if(str ==null) return ;
    int len = str.length;
    if (len < 2) return;

    int tail =1;
    for (int i =1 ; i < len; ++i){
        int j ;
        for (j = 0; j < tail; ++j){
            if (str[i] == str[j] ) break;
        }
        if (j == tail){
            str[tail] = str[i];
            ++tail;
        }else{
            str[tail]=0;
            ++tail}
    }
    
}

