ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
    ArrayList<ArrayList<Integer>> allsubsets;
    if (set.size() == index){
        allsubsets = new ArrayList<ArrayList<integer>>();
    }else{
        allsubsets = getSubsets(set, index+1);
        int item = set.get(index);
        ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> subset : allsubsets) {
            ArrayList<Integer> newsubset = new ArrayList<Integer>();
            newsubset.addAll(subset);
            newsubset.add(item);
            moresubsets.add(newsubset);
        }
        allsubsets.addAll(moresubsets);
    }
    return allsubsets;
}


ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set){
    ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList>();
    int max = 1 << set.size();
    for(int i = 0; i < max; i++){
        ArrayList<Integer> subset = new ArrayList<Integer>();
        int k = i;
        int index = 0;
        while (k > 0){
            if ((k & 1)>0){
                subset.add(set.get(index));
            }
            k >>= 1;
            index++;
        }
        allsubsets.add(subset);
        }
    return allsubsets;
}


ArrayList<ArrayList<Integer>> getsub(ArrayList<ArrayList<Integer>> set){
    ArrayList<ArrayList<Integer>> allset = new ArrayList<ArrayList>();
    int max = 1 << set.size();
    for(int i = 0; i < max; i++){
        ArryList<Integer> subset = new ArrayList<Integer>();
        int k = i;
        while (k > 0){
            if ((k & 1) > 0){
                subset.add(set.get(index));
            }
            k >>= 1 ;
            index ++;
        }
        allset.add(subet);
    }
    return allset;
}


