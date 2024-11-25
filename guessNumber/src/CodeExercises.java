/**
 * Please run TestCodeRunner to check your answers
 */
public class CodeExercises {

    /**
     * When given an integer, return an integer that is the reverse (its
     * numbers are in reverse to the input) order.
     *
     * @param number {@link Integer int} number to reverse
     * @return the {@link Integer integer} with digits in reverse order
     */
    public int reverseInt(int number) {
        int reverseNum = 0;

        // TODO write answer here

        return reverseNum;
    }



    /**
     * Determines the Excel column name of the given column number.
     *
     * @param num column number as an {@link Integer int}
     * @return the column title as a {@link String}
     */
    public String convertIntToColTitle(int num) {
        String columnName = "";
        if (num < 0) {
            System.out.println("invalid number");
        }else {
            for (int i = 0; i < num/26; i++) {
                columnName += (char)(65+num%26);
            }
        }
        // TODO write answer here

        return columnName;
    }



    /**
     * Determine if the given string is a palindrome (case folded).
     *
     * @param str input {@link String}
     * @return true if string is palindrome, false otherwise
     */
    public boolean isStringPalindrome(String str) {

        // TODO write answer here
        if (str == null || str.length() == 0){
            return false; //字符为空返回false
        }else {
            for (int i = 0; i < (str.length()-1)/2; i++) {
                if (str.charAt(i) == str.charAt(str.length()-1-i)) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Generate a space separated list of all the prime numbers from 2
     * to the highest primestr less than or equal to the given integer.
     *
     * @param num upper bound for prime detection
     * @return the primes as a space separated {@link String}
     */
    public String printPrimeNumbers(int num) {
        String primesStr = "";

        // TODO write answer here

        return primesStr;
    }
}
