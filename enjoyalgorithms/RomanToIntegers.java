package enjoyalgorithms;

public class RomanToIntegers {

    static int intVal(char c) {
        // array or hashmap
        // An array would be more space-efficient since the number of Roman numerals is small and fixed
        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }

            default -> System.out.println("Invalid roman character!");
        }
        return 0;
    }
    public static int rmtoInt(String rm, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cur = intVal(rm.charAt(i));
            if (i + 1 < n) {
                int next = intVal(rm.charAt(i+1));
                if (cur >= next) res += cur;
                else res -= cur;
            } else
                res += cur;
        }
        return res;
    }
    public static void main(String[] args) {
        String firstNumber = "XL";
        System.out.println(rmtoInt(firstNumber, 2));

        String secondNumber = "VIII";
        System.out.println(rmtoInt(secondNumber, 4));

        String thirdNumber = "MCMIV";
        System.out.println(rmtoInt(thirdNumber, 5));
    }
}
