public class Abacus {
    public String[] add(String[] original, int val) {
      int orig_num = getNum(original);
      int sum = orig_num + val;
      String[] result = convertNumToAbacus(sum);
      return result;
    }
    
    public int getNum(String[] abacus) {
        int result = 0;
        int NUM_THREADS = 5;
        for(int i = 0; i < abacus.length; i++){
          int tens = (int) Math.pow(10,NUM_THREADS - i);
          int digit = convertBeadsToNum(abacus[i]); 
          result += digit*tens;  
        }
        return result;
    }
    
    public int convertBeadsToNum(String thread) {
        int remainder = 0;
        for(int i = 0; i < thread.length(); i++) {
            if(thread.charAt(i) != '-')
                remainder ++;
            else
                break;
        }
        return 9 - remainder;
    }
    
    public String[] convertNumToAbacus(int num) {
        String[] result = new String[6];
        String numString = String.valueOf(num);
        for(int i = 0; i < numString.length(); i++) {
            char c = numString.charAt(i);
            int digit = Integer.parseInt(String.valueOf(c));
            String beads = convertDigitToBeads(digit);
            result[i] = beads;
        }
        
        return result;
    }
    
    public String convertDigitToBeads(int digit) {
       StringBuilder result = new StringBuilder();
       
       int remainder = 9 - digit;
       
       for(int i = 0; i < remainder; i ++) {
           result.append('o');
       }
       result.append("---"); 
       
       for(int i = 0; i < digit; i ++) {
       	  result.append('o');    
       }
        
       return result.toString();
    }
    
}
