public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                //Check if number is positive
                if (Integer.parseInt(number.trim()) < 0) throw new IllegalArgumentException("negatives not allowed");
                //Check if number is less than 1000
                if (Integer.parseInt(number.trim()) >= 1000) returnValue += 0;
                else returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}