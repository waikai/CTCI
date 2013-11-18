public static boolean isU(String str){
    boolean [] = new boolean[256];
    for (int i = 0; i < str.length(); i++){
        int var = str.charAt[i];
        if (char_set[var]) return false;
        char_set[var] = true;
    }
    return true;
}

