class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";

        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if(s.isEmpty()) return "";
            minLength = Math.min(s.length(), minLength);
        }

        for(int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != c) return strs[j].substring(0, i);
            }
        }


        return strs[0].substring(0, minLength);
    }
}