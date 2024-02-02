public class NumberConverter {
    int[] digits;
    int base;

    final static String DIGIT_MAP = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+/";
    public NumberConverter(String number, int base) {
        digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            int single = DIGIT_MAP.indexOf(number.substring(i,i+1));
            digits[i] = single;
        }
        this.base = base;
    }
    public int convertToDecimal()
    {
        int num = 0;
        int exponent = 0;
        for (int i = digits.length - 1;i >= 0;i--){
            num = num + digits[i] * (int) (Math.pow(base, exponent));
            exponent++;
        }
        return num;
    }

    public String convertToBase(int b) {
        String finalNum = "";
        int total = convertToDecimal();
        int remainder = 0;
        if (b == 1){
            for (int i = 0; i < total; i++){
                finalNum += "" + 1;
            }
            return finalNum;
        }
        while (total > 0) {
            remainder = total % b;
            total = total / b;
            for (int i = 0; i < DIGIT_MAP.length(); i++) {
                if (i == remainder) {
                    finalNum = DIGIT_MAP.charAt(i) + finalNum;
                }
            }
        }
        if (finalNum.equals("") && b != 1){
            finalNum = finalNum + 0;
        }
        return finalNum;
    }
}

