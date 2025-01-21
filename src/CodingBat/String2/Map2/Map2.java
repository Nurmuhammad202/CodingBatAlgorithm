package CodingBat.String2.Map2;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map2 {
    public Map<String, Integer> word0(String[] strings) {

        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        for (String string : strings) {
            sortedMap.put(string, 0);
        }

        return sortedMap;
    }
}

interface QueCustom {
    void readDate();
}

interface OnItemClicklistener {
    void click();
}

interface DeQueCustom extends QueCustom, OnItemClicklistener {

}

class Per implements DeQueCustom {

    @Override
    public void readDate() {

    }

    @Override
    public void click() {

    }
}