class SqueakyClean {
    static String clean(String identifier) {
        char[] charArray = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean capitaliseNext = false;
        for (char ch: charArray){
            // Check Whitespace
            if (Character.isWhitespace(ch)){
                builder.append('_');
            }
            // Check Dash
            else if(ch == '-'){
                capitaliseNext = true;
            }
            // Check Digit
            else if (Character.isDigit(ch)){
                if (ch == '0'){
                    builder.append('o');
                }
                else if (ch == '1'){
                    builder.append('l');
                }
                else if (ch == '3'){
                    builder.append('e');
                }
                else if (ch == '4'){
                    builder.append('a');
                }
                else if (ch == '7'){
                    builder.append('t');
                }
            }
            // Check Letter
            else if(Character.isLetter(ch)){
                // Capitalise Letter
                if (capitaliseNext){
                    builder.append(Character.toUpperCase(ch));
                    capitaliseNext = false;
                }
                // Append Letter Normally
                else{
                    builder.append(ch);
                }
            }
        }
        return builder.toString();
    }
}
