package CodingBat.String2.Api;

public class WordsFront {
    public String[] wordsFront(String[] words, int n) {
       String[] newWords = new String[n];

        for (int i = 0; i < words.length; i++) {
            if( i < n) {
                newWords[i] = words[i];
            }
        }

        return newWords;
    }
}
