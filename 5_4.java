public static int solution(int a, int b){
    int count = 0;
    for (int c = a^b; c!=0; c = c >>1){
        count+= c&1;
    }
    return count;
}
// a=1000
// b=1110
// c=0110
// c>>1 c=0011 c & 1 =1
//
//
//
//
public static int su(int a, int b){
    int count = 0;
    for (int c = a^b; c!=0; c= c>>1){
        count+= c&1;
    }
    return count;
}

