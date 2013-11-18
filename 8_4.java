public static ArrayList<String> getPerm(String s){
    ArrayList<String> permutations = new ArrayList<String>();
    if (s == null){
        return null;
    }else if (s.length() == 0){
        permutations.add("");
        return permutations;
    }
    char first = s.charAt(0);
    String remainder = s.substring(1);
    ArrayList<String> words = getPerm(remainder);
    for(String word : words){
        for (int j = 0; j <= word.length(); j++){
            permutations.add(insertCharAt(word, first, j));
        }
    }
    return permutations;
}
public static String insertCharAt(String word, char c, int i){
    String start = word.substring (0,i);
    String end = word.substring (i);
    return start +c + end;
}

public static  
