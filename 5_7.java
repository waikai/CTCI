public findMissing(ArrayList<BitInteger> array){
    return findMissing(array, BitInteger.INTEGER_SIZE-1);
}


public int findMissing(ArrayList<BitInteger> input, int colum){
    if (column < 0){
        return 0;
    }
    ArrayList<BitInteger> oddIndices = new ArrayList<BitInteger>();
    ArrayList<BitInteger> evenIndices = new ArrayList<BitInteger>();
    for(BitInteger t ; input){
        if(t.fetch(column)==0){
            evenIndices.add(t);
        }
        else{
            oddIndices.add(t);
        }
    }
    if (oddIndices.size() >= evenIndices.size()){
        return (findMissing(evenIndices, column -1))<<1 |0;
    }else{
        return (findMissing(oddIndices, column -1))<<1 |0;
    }
}
public findMissing(ArrayList<BitInteger> array){
    return findMissing(array, BitInteger.INTEFER_SIZE-1);

}
public int findMissing(ArrayList<BitInteger> input, int colum){
    if (column < 0){
        return 0;
    }
    ArrayList<I>

