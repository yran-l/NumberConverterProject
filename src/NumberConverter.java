public class NumberConverter {
    int[] digits;
    int base;

    final static String DIGIT_MAP = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqerstuvwxyz+/";
    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i, i + 1);
            int d = Integer.parseInt(single);
            digits[i] = d;
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
        while (total > 0) {
            remainder = total % b;
            total = total / b;
            for (int i = 0; i < DIGIT_MAP.length(); i++) {
                if (i == remainder) {
                    finalNum = DIGIT_MAP.charAt(i) + finalNum;
                }
            }
        }
        return finalNum;
    }
}

