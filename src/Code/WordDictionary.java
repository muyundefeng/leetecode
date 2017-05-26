package Code;

/**
 * Created by lisheng on 17-5-25.
 */
public class WordDictionary {
    /**
     * Initialize your data structure here.
     */
    private String words;

    public WordDictionary() {
        words = "";
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        words += word;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        if (!word.contains(".")) {
            return words.contains(word);
        } else {
            String patternStr = ".*" + word + ".*";
            return words.matches(patternStr);
        }
    }
    /**
     * Your WordDictionary object will be instantiated and called as such:
     * WordDictionary obj = new WordDictionary();
     * obj.addWord(word);
     * boolean param_2 = obj.search(word);
     */
    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("a");
        dictionary.addWord("a");
        System.out.println(dictionary.search("."));
        System.out.println(dictionary.search("a"));
        System.out.println(dictionary.search("aa"));
        System.out.println(dictionary.search("a"));
        System.out.println(dictionary.search(".a"));
        System.out.println(dictionary.search("a."));
//        dictionary.addWord("a");
//        dictionary.addWord("aa");
//
//
//        System.out.println(dictionary.search("pad"));
//        System.out.println(dictionary.search("bad"));
//        System.out.println(dictionary.search(".ad"));
//        System.out.println(dictionary.search("b.."));
    }
}
