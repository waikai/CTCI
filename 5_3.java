

// 1 shift left index.00001  index= 2  00100
// n都第index位是0 或 1
public static boolean GetBit(int n, int index){
    return ((n&(1 << index))>0);
}
public static  int SetBit(int n, int index, boolean b){
    if(b){
        return n | (1 << index);
    }else {
        int mask = ~(1 << index);//mask 11011
        return n & mask;
    }
}
public static int GetNext_NP(int n ){
    if(n <= 0) return -1;
    int index = 0;
    int countOnes = 0 ;

// find the first one 
    while (!GetBit(n,index)) index++;
// turn on the next one 
    while(GetBit(n,index)){
        index++;
        countOnes++;
    }
    n = SetBit(n, index, true);
    // turn off previous one
    index--;
    n = SetBit(n, index, false);
    countOnes--;
    // set zeros
    for(int i = index -1; i >=countOnes; i--){
        n = SetBit(n, i , false);
    }
    //set ones
    for(int i = countOnes -1; i >= 0; i--){
        n = SetBit(n,i,true);
    }
    return n;
}
public static GetPrevious_NP(int n){
    if (n<=0) return -1;
    int index =0;
    int countZero=0;

    while (GetBit(n, index)) index++;
    while (!GetBit(n, index)){
        index++;
        countZero++;
    }
    n = SetBit(n,index,false);
    index--;
    n = SetBit(n,index, true);
    countZero--;
    for(int i = index -1;i >= countZero; i--){
        n = SetBit(n,i,true);
    }
    for(int i = countZero-1; i>=0; i--){
        n=SetBit(n,i,false);
    }
    return n;
}


