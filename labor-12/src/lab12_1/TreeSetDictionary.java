package lab12_1;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDictionary implements IDictionary{
    private Set<String> words = new TreeSet<>();
    private static TreeSetDictionary instance = null;

    private TreeSetDictionary(){
    }

    public static IDictionary newInstance(){
        if (instance != null){
            return instance;
        }
        instance = new TreeSetDictionary();
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
