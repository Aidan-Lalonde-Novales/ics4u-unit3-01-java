/*
* This program reverses a string using recursion.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-11-09
*/

/**
 * This is a string reverser.
*/
final class ReverseString {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private ReverseString() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function reverses a string.
     *
     * @param input string to be base reversal on.
     * @return reverse of the input string.
     */
    public static String reverse(final String input) {
        final String reversedString;
        if (input.length() == 0) {
            reversedString = "";
        } else {
            reversedString = reverse(input.substring(1)) + (input.charAt(0));
        }
        return reversedString;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String toBeReversed = "recursion";
        System.out.println("\nOriginal String: " + toBeReversed);
        System.out.println("\nReversed String: " + reverse(toBeReversed));
        System.out.println("\nDone.");
    }
}
