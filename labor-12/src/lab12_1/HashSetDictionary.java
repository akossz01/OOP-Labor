package lab12_1;

import java.util.HashSet;
import java.util.Set;

public class HashSetDictionary implements IDictionary{
    private Set<String> words = new HashSet<>();
    private static HashSetDictionary instance = null;

    private HashSetDictionary(){
    }

    public static IDictionary newInstance() {
        if (instance != null){
            return instance;
        }
        instance = new HashSetDictionary();
        return instance;
    }

    @Override
    public boolean add(String s) {
        words.add(s);
        return true;
    }

    @Override
    public boolean find(String s) {
        return words.contains(s);
    }

    @Override
    public int size() {
        return words.size();
    }
}
