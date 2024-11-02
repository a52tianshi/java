import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public boolean isCircularSentence(String sentence) {
        if (sentence == null) {
            return false;
        }
        ArrayList<String> words = new ArrayList<String>();
        Collections.addAll(words, sentence.split(" "));
        for (int i = 0; i < words.size(); i++) {
            if (i != 0) {
                String lastWord = words.get(i - 1);
                String firstWord = words.get(i);
                if (lastWord.charAt(lastWord.length() - 1) != firstWord.charAt(0)) {
                    return false;
                }
            } else {
                String lastWord = words.get(words.size() - 1);
                String firstWord = words.get(i);
                if (lastWord.charAt(lastWord.length() - 1) != firstWord.charAt(0)) {
                    return false;
                }
            }
        }
        return true;
    }
}