int stackSize = 300;
int[] buffer = new int [stackSize * 3];
int[] stackPointer = {0,0,0};

void push (int stackNum, int value){
    int index = stackNum * stackSize + stackPointer[stackNum]+1;
    stackPointer[stackNum]++;
    buffer[index]= value;
}


int pop(int stackNum){
    int index = stackNum * stackSize+ stackPointer[stackNum];
    stackPointer[stackNum]--;
    int value = buffer[index];
    buffer[index]=0;
    return value;
}

int peek(int stackNum){
    int index = stackNum * stackSize + stackPointer[stackNum];
    return buffer[index];
}
boolean isEmpty(int stackNum){
    return stackPointer[stackNum] == stackNum * stackSize;
}


int stackSize = 300;
int[] buffer = new int [stackSize * 3];
int[] stackPointer = {0,0,0}
public void push(int stackNum, int value) {
    int index = stackNum * stackSize + stackPointer[stackNum]+1;
    stackPointer[stackNum]++;
    buffer[index]=value;
}
public int pop(int stackNum){
    int index = stackNum*stackSize + stackPointer[stackNum];
    stackPointer[stackNum]--;
    int value = buffer[index];
    buffer[index]= 0;
    return value;
}
public int peek(int stackNum){
    int index = stackSum * stackSize + stackPointer[stackNum];
    return buffer[index];
}
public isEmpty(int stackNum){
    return stackPointer[stackNum] == stackNum * stackSize;
}



