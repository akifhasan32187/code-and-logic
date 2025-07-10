public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        String lower = word.toLowerCase();
        return lower.equals(new StringBuilder(lower).reverse().toString());
    }

    public static void main(String[] args) {
        // Example test cases
        String[] testWords = {"madam", "Sir", "racecar", "Level", "hello"};

        for (String word : testWords) {
            System.out.println(word + " - " + isPalindrome(word));
        }
    }
}

