public class CountWordInSentence {
    public static void main(String[] args) {
        String sentence = "Hello world, this is a test sentence.";
        int wordCount = countWords(sentence);
        System.out.println("The number of words in the sentence is: " + wordCount);
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
