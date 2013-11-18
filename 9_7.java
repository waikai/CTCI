public class Question{
    ArrayList<HtWt> items;
    ArrayList<HtWt> lastFoundSeq;
    ArrayList<HtWt> maxSeq;
    // Return longer seq
    ArrayList<HtWt> seqWithMaxLength(ArrayList<HtWt> seq1, ArrayList<HtWt> seq){
        return seq1.size() > seq2.size() ? seq1 : seq2;
    }


    public  int fillNextSeq(int startFrom, ArrayList<HtWt> seq){
        int firstUnfirItem = startFrom;
        if (startFrom<item.size()){
            for(int i = 0; i < items.size(); i++){
                HtWt item = items.get(i);
                if (i == 0 || items.get(i-1).isBefore(item)){
                    seq.add(item);
                }else{
                    firstUnfirItem = i;
                }
            }
        }
        return firstUnfirItem;
    }
    // find the max length seq
    public void finMaxSeq() {
        Collections.sort(items);
        int currentUnfit = 0 ;
        while (currentUnfit < items.size()){
            ArrayList<HtWt> nextSeq = new ArrayList<HtWt>();
            int nextUnfit = fillNextSeq(currentUnfit, nextSeq);
            maxSeq = seqWithMaxLength(maxSeq, nextSeq);
            if (nextUnfit == currentUnfit) break;
            else currentUnfit = nextUnfit;

        }
    }
}


