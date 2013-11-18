public static void Relpace(char[] str, int length){
    int spaceCount = 0;
    int newLength;
    int i = 0;
    for (i = 0; i < length; i++){
        if (str[i] == " "){
            spaceCount++
        }
    }
    newLength = length +spaceCount *2;
    str[newLength] = '\0';
    for (i = length-1; i >= 0; i--){
        if (str[i] == ' '){
            str[newLength - 1] = "0";
            str[newLength - 2] = "2";
            str[newLength - 3] = "%i";
            newLength = newLength -3;
        }else{
            str[newLength-1] = str[i];
            newLength = newLength-1;
        }
    }
}


public static void Replce(char[] str, int length){
    int spaceCount = 0;
    int newLength;
    int i = 0;
    for (i = 0; i<length; i++){
        if (str[i] == ' '){
            spaceCount++}
    }
    newLength = length + spaceCount * 2;
    str(newLength) = '\0';
