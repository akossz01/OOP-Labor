package lab12_1;


import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words = new ArrayList<>();
    private static ArrayListDictionary instance = null;

    private ArrayListDictionary() {
    }

    public static IDictionary newInstance(){
        if (instance != null){
            return instance;
        }
        instance = new ArrayListDictionary();
        return instance;
    }

    @Override
    public boolean add(String s) {
        if (words.contains(s)){
            return true;
        }
        else words.add(s);
        return true;
    }

    @Override
    public boolean find(String s) {
        for (String w:words){
            if (w.equals(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return words.size();
    }
}
