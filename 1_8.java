public static boolean isRo(String s1, String s2){
    int len = s1.length();
    if (len == s2.length() && len > 0){
        String s3 = s1+s1;
        return isSubstring(s3,s2);
    }
    return false;
}

