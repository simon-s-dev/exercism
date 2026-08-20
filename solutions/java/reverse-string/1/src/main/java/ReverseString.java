class ReverseString {

    String reverse(String inputString) {
        char[] inputChars = inputString.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = inputChars.length-1; i >= 0; i--){
            sb.append(inputChars[i]);
        }

        return sb.toString();
    }
  
}
