public int search(String[] strings, String str, int first, int last){
    while (first <= last){
        while (first <= last && string[last] == ""){
            --last;
        }
        if (last < first){
            return -1;
        }
        int mid = (last + first)>>1;
        while (string[mid] == ""){
            ++mid;
        }
        int r = string[mid].compareTo(str);
        if (r == 0 ) return mid;
        if (r < 0 ) {
            first = mid +1;
        }else {
            last = mid +1;
        }
    }
    return -1;
}



public int search(String[] string, String str){
    if (string == null || str ==null) return -1;
    if (str == ""){
        for(int i = 0; i < string.length; i++){
            if (string[i] == "") return i;
        }
        return -1;
    }
    return search(string, str, 0 , string.length-1);
}
public int search(String[] string, String str, int first, int last) {
    while(first <= last){
        while(first <= last && string[last]==""){
            --last;
        }
        if (last < first){
            return -1;
        }
        int mid = (last+first)>> 1;
        while (string[mid]==""){
            ++mid;
        }
        int r = string[mid].compareTo(str);
        if(r == 0){
            first = mid+1;
        }else {
            last = mid -1;
        }
        return -1;
    }

    public int search(String[] string, String str){
        if (string == null || str == null) return -1;
        if (str == ""){
            for (int i = 0)

