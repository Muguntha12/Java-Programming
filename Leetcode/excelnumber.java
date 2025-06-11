class excelnumber {
    public int titleToNumber(String columnTitle) {
              int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result=26*result+value;
        }
        return result;
        
    }
}
