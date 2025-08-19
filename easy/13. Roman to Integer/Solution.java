class Solution {
    private static final Map<Character, Integer> symbols;

    static {
        symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
    }

    public int romanToInt(String s) {
        int sum = 0;
        int length = s.length();
        for(int i = 0; i < length; i++){
            int value = symbols.get(s.charAt(i));
            if(i != length - 1) {
                int nextValue = symbols.get(s.charAt(i + 1));
                if(nextValue > value){
                    sum -= value;
                    continue;
                }
            }
            sum += value;
        }
        return sum;
    }
}