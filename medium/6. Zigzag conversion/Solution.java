class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        var builders = new ArrayList<StringBuilder>();
        for (int i = 0; i < s.length(); i++) {
            builders.add(new StringBuilder());
        }

        int currRow = 0;
        boolean onTop = false;
        for(char c : s.toCharArray()) {
            builders.get(currRow).append(c);
            if(currRow == numRows - 1) onTop = true;
            else if (currRow == 0) onTop = false;
            currRow += onTop ? -1 : 1;
        }

        StringBuilder converted = new StringBuilder();
        builders.forEach(converted::append);

        return converted.toString();
    }
}