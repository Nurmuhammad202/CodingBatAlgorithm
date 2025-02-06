package CodingBat.String2.Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {

        List<String> list = new ArrayList<>();

        for (String item : words) {
            if(item.length() != len) {
                list.add(item);
            }
        }

        return list;
    }
}
