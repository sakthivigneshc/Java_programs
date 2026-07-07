package part3;

import java.util.Arrays;

public class Anagram_String {

    /*
     * An Anagram is a word or phrase formed by
     * rearranging the letters of a different word or phrase,
     * using all the original letters exactly once.
     *
     * Example:
     *
     * Input:
     * t1 = anagram
     * t2 = nagaram
     *
     * Output:
     * Anagram strings
     */

    public static boolean soln1(String name1, String name2) {

        // If lengths are different, they cannot be anagrams
        if (name1.length() != name2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] nameArray1 = name1.toCharArray();
        char[] nameArray2 = name2.toCharArray();

        // Sort both arrays
        Arrays.sort(nameArray1);
        Arrays.sort(nameArray2);

        // Compare the sorted arrays
        return Arrays.equals(nameArray1, nameArray2);
    }

    public static void main(String[] args) {

        String name1 = "anagram";
        String name2 = "nagaram";

        boolean res = soln1(name1, name2);

        if (res) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}
