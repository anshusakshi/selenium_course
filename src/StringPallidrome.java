
public class StringPallidrome {

    public static void main(String[] args) {
        String[] sentence = {"R", "A", "D", "A", "R"};
        String reversedSentence = "";

        // Reversing the array elements
        for (int i = sentence.length - 1; i >= 0; i--) {
            reversedSentence += sentence[i];
        }

        // Checking if the reversed sequence forms a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < sentence.length; i++) {
            if (!sentence[i].equals(sentence[sentence.length - 1 - i])) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Reversed sentence: " + reversedSentence);
        if (isPalindrome) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }
}


