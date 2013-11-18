int StackSzie = 300;
int[] buffer = new int[StackSzie * 3];
int[] StackPoint = {0, 0, 0 };
void push(int stackNum, int value){
    int index = stackNum * StackSzie + StackPoint+1;
    buffer[index] = value;
    StackPoint[stackNum]++;
}
void pop(int stackNum){
    int index = stackNum * StackSzie + StackPoint;
    int value = buffer[index];
    buffer[index] = 0 ;
    StackPoint[stackNum]--;
    return value;
}
boolean isEmp(int stackNum){
    return StackPoint[stackNum] == stackNum * StackSzie;
}

